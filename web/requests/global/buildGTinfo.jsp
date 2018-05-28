<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.request.GlobalTravelInformation" %><%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 6:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String departure = request.getParameter("departure");
    String startDate = request.getParameter("startdate");
    String endDate = request.getParameter("enddate");
    String bookingValue = request.getParameter("bvalue");

    HttpSession httpSession = request.getSession(false);

    GlobalTravelInformation gti = new Entry().buildGTI(departure, startDate, endDate, bookingValue);

    httpSession.setAttribute("gti", gti);

    response.sendRedirect("../../global/add-covercountry.jsp");
%>
