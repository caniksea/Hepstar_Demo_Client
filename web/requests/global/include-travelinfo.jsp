<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.request.Insured" %>
<%@ page import="com.caniksea.hc.models.request.SpecificTravelInformation" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String travelInfo = request.getParameter("info");

    Entry entry = new Entry();

    SpecificTravelInformation sti = entry.buildTravelInfo(travelInfo);

    HttpSession httpSession = request.getSession(false);
    Insured insured = (Insured) httpSession.getAttribute("insured");
    insured.setSpecificTravelInformation(sti);
    httpSession.setAttribute("insured", insured);

    response.sendRedirect("../../global/more-insured.jsp");

%>
