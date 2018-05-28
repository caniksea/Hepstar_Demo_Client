<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.globals.LocalResponse" %>
<%@ page import="com.caniksea.hc.models.request.Authentication" %>
<%@ page import="com.caniksea.hc.models.request.CoverCountries" %>
<%@ page import="com.caniksea.hc.models.request.GlobalTravelInformation" %>
<%@ page import="com.caniksea.hc.models.request.Insureds" %>
<%@ page import="com.caniksea.hc.models.response.ProductResponse" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String command = request.getParameter("submit");
    String coverCountry = request.getParameter("cCountry");

    HttpSession httpSession = request.getSession(false);

    Entry entry = new Entry();

    CoverCountries coverCountries = (CoverCountries) httpSession.getAttribute("coverCountries");

    if(coverCountries == null){
        coverCountries = entry.buildCoverCountries(coverCountry);
    }else{
        coverCountries = entry.addCoverCountry(coverCountries, coverCountry);
    }

    httpSession.setAttribute("coverCountries", coverCountries);

    if(command.equalsIgnoreCase("Add another")){
        response.sendRedirect("../../global/add-covercountry.jsp");
    }else{
        GlobalTravelInformation gti = (GlobalTravelInformation) httpSession.getAttribute("gti");
        gti.setCoverCountries(coverCountries);

        httpSession.setAttribute("gti", gti);

        String src = (String) httpSession.getAttribute("src");

        if(src.equals("product")){

            Authentication authentication = (Authentication) httpSession.getAttribute("authentication");
            Insureds insureds = (Insureds) httpSession.getAttribute("insureds");

            LocalResponse localResponse = entry.sendPricedCall(authentication, insureds, gti);

            if(localResponse.getObject() == null) {
                httpSession.invalidate();
                httpSession = request.getSession();
                httpSession.setAttribute("error", localResponse.getDesc());

                response.sendRedirect("../../global/error.jsp");
            }else{
                ProductResponse productResponseObj = (ProductResponse) localResponse.getObject();
                if(productResponseObj.getStatus().getCode().equals("200")){
                    httpSession.setAttribute("pricedCallProductResponse", productResponseObj);

                    httpSession.removeAttribute("insureds");
                    httpSession.removeAttribute("insured");
                    httpSession.removeAttribute("personalisation");

                    response.sendRedirect("../../product/priced-products.jsp");
                }else{
                    httpSession.invalidate();
                    httpSession = request.getSession();
                    httpSession.setAttribute("error", productResponseObj.getStatus().getDescription());

                    response.sendRedirect("../../global/error.jsp");
                }
            }
        }else if(src.equals("policy")){
            response.sendRedirect("../../policy/add-extras.jsp");
        }
    }
%>
