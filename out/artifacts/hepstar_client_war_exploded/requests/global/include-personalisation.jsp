<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.request.Insured" %>
<%@ page import="com.caniksea.hc.models.request.Personalisation" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String command = request.getParameter("submit");
    String type = request.getParameter("type");
    String value = request.getParameter("value");

    HttpSession httpSession = request.getSession(false);

    Personalisation personalisation = (Personalisation) httpSession.getAttribute("personalisation");

    if(personalisation == null){
        personalisation = new Entry().buildPersonalisation(type, value);
    }else{
        personalisation = new Entry().addPersonalisation(personalisation, type, value);
    }

    httpSession.setAttribute("personalisation", personalisation);

    if(command.equalsIgnoreCase("Add another")){
        response.sendRedirect("../../global/add-personalisation.jsp");
    }else{
        Insured insured = (Insured) httpSession.getAttribute("insured");
        insured.setPersonalisation(personalisation);
        httpSession.setAttribute("insured", insured);

        response.sendRedirect("../../global/add-travelinfo.jsp");
    }
%>
