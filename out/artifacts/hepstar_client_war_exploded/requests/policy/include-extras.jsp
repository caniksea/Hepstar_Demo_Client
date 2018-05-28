<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.globals.LocalResponse" %>
<%@ page import="com.caniksea.hc.models.request.Authentication" %>
<%@ page import="com.caniksea.hc.models.request.GlobalTravelInformation" %>
<%@ page import="com.caniksea.hc.models.request.Insureds" %>
<%@ page import="com.caniksea.hc.models.request.PolicyRequest" %>
<%@ page import="com.caniksea.hc.models.response.PolicyResponse" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/27
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String distributorReference = request.getParameter("distributorReference");
    String email = request.getParameter("email");
    String cardType = request.getParameter("cardType");
    String cardNumber = request.getParameter("cardNumber");
    String cardHolder = request.getParameter("cardHolder");
    String cvv = request.getParameter("cvv");
    String month = request.getParameter("month");
    String year = request.getParameter("year");

    HttpSession httpSession = request.getSession(false);

    GlobalTravelInformation gti = (GlobalTravelInformation) httpSession.getAttribute("gti");
    Authentication authentication = (Authentication) httpSession.getAttribute("authentication");
    Insureds insureds = (Insureds) httpSession.getAttribute("insureds");
    PolicyRequest pr = (PolicyRequest) httpSession.getAttribute("pr");

    pr.setGti(gti);
    pr.setInsureds(insureds);

    LocalResponse localResponse = new Entry().sendPolicyCall(authentication, pr, distributorReference, email, cardType,
            cardNumber, cardHolder, cvv, month, year);
    if(localResponse.getObject() == null) {
        httpSession.invalidate();
        httpSession = request.getSession();
        httpSession.setAttribute("error", localResponse.getDesc());

        response.sendRedirect("../../global/error.jsp");
    }else{
        PolicyResponse policyResponse = (PolicyResponse) localResponse.getObject();
        if(policyResponse.getStatus().getCode().equals("200")){
            httpSession.setAttribute("policyCallResponse", policyResponse);

            httpSession.removeAttribute("insureds");
            httpSession.removeAttribute("insured");
            httpSession.removeAttribute("personalisation");

            response.sendRedirect("../../policy/policy-details.jsp");
        }else{
            httpSession.invalidate();
            httpSession = request.getSession();
            httpSession.setAttribute("error", policyResponse.getStatus().getDescription());

            response.sendRedirect("../../global/error.jsp");
        }
    }
%>
