package com.caniksea.hc.controller;

import com.caniksea.hc.models.globals.LocalResponse;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class HepstarWSClient {
    private String USER_AGENT = "Mozilla/5.0";
    private TrustManager TRUST_CERTS[] = new TrustManager[]{
            new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                }

                @Override
                public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }
    };
    private HostnameVerifier ALL_HOSTS = new HostnameVerifier() {
        @Override
        public boolean verify(String s, SSLSession sslSession) {
            return true;
        }
    };

    public LocalResponse callWS(String wsURL, String xmlRequest) {
        System.out.println("Calling " + wsURL + " with string:");
        System.out.println(xmlRequest);
        LocalResponse localResponse = new LocalResponse();
        String serviceResponse = null;
        try {
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, TRUST_CERTS, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

            //Use this block if you are behind proxy.
//            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("<hostname>", 1234));
//
//            Authenticator authenticator = new Authenticator() {
//                @Override
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return (new PasswordAuthentication("<username>", "<password>".toCharArray()));
//                }
//            };
//            Authenticator.setDefault(authenticator);

            URL url = new URL(wsURL);
//            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection(proxy);
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            HttpsURLConnection.setDefaultHostnameVerifier(ALL_HOSTS);

            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("User-Agent", USER_AGENT);
            urlConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            urlConnection.setRequestProperty("Content-Type", "application/xml");

            urlConnection.setDoOutput(true);
            DataOutputStream dos = new DataOutputStream(urlConnection.getOutputStream());
            dos.writeBytes(xmlRequest);
            dos.flush();
            dos.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = br.readLine()) != null){
                response.append(inputLine);
            }

            br.close();
            serviceResponse = (response.toString());
            System.out.println("Service responded with: "+serviceResponse);

            localResponse.setCode("00");
            localResponse.setDesc("success");
            localResponse.setObject(serviceResponse);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println(HepstarWSClient.class + " - callWS | NoSuchAlgorithmException: "+ e.getMessage());
            localResponse.setCode("XX");
            localResponse.setDesc(e.getMessage());
        } catch (KeyManagementException e) {
            e.printStackTrace();
            System.out.println(HepstarWSClient.class + " - callWS | KeyManagementException: "+ e.getMessage());
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println(HepstarWSClient.class + " - callWS | MalformedURLException: "+ e.getMessage());
            localResponse.setCode("XX");
            localResponse.setDesc(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(HepstarWSClient.class + " - callWS | IOException: "+ e.getMessage());
            localResponse.setCode("XX");
            localResponse.setDesc(e.getMessage());
        }
        return localResponse;
    }
}
