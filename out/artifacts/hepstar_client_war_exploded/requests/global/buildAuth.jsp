<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.request.Authentication" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession httpSession = request.getSession(false);
    String currency = request.getParameter("currency");
    String locale = request.getParameter("locale");

    Entry entry = new Entry();

    Authentication authentication = entry.buildAuthentication(currency, locale);
    httpSession.setAttribute("authentication", authentication);

    response.sendRedirect("../../product/add-insured.jsp");

%>
