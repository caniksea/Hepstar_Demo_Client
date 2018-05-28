<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.request.PolicyRequest" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/27
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession httpSession = request.getSession(false);

    String productCode = request.getParameter("productcode");

    PolicyRequest pr = new Entry().initiatePolicyRequest(productCode);
    if(pr != null){
        httpSession.setAttribute("pr", pr);

        response.sendRedirect("../../policy/add-insured.jsp");
    }else{
        httpSession.setAttribute("error", "Could not build Policy Request");

        response.sendRedirect("../../global/error.jsp");
    }
%>
