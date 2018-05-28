<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.globals.LocalResponse" %>
<%@ page import="com.caniksea.hc.models.request.Authentication" %>
<%@ page import="com.caniksea.hc.models.response.PolicyCancellationResponse" %><%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/27
  Time: 11:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String policyNo = request.getParameter("policyNo");
    String reason = request.getParameter("reason");

    HttpSession httpSession = request.getSession(false);
    Authentication authentication = (Authentication) httpSession.getAttribute("authentication");
    LocalResponse localResponse = new Entry().cancelPolicy(authentication, policyNo, reason);


    httpSession.invalidate();
    httpSession = request.getSession();

    if(localResponse.getObject() == null) {
        httpSession.setAttribute("error", localResponse.getDesc());

        response.sendRedirect("../../global/error.jsp");
    }else{
        PolicyCancellationResponse pcr = (PolicyCancellationResponse) localResponse.getObject();
        if(pcr.getStatus().getCode().equals("200")){

            if(pcr.getResponseParameters().isCancelled()) httpSession.setAttribute("info", pcr.getStatus().getDescription());
            else httpSession.setAttribute("info", "Policy NOT cancelled. Please try again!");

            response.sendRedirect("../../global/info.jsp");
        }else{
            httpSession.setAttribute("error", pcr.getStatus().getDescription());

            response.sendRedirect("../../global/error.jsp");
        }
    }
%>
