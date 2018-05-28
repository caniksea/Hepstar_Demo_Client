<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.request.Insured" %>
<%@ page import="com.caniksea.hc.models.request.Insureds" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession httpSession = request.getSession(false);

    String age = request.getParameter("age");
    String residency = request.getParameter("residency");
    String gender = request.getParameter("gender");
    final String SRC = "product";

    httpSession.setAttribute("src", SRC);

    Entry entry = new Entry();

    Insureds insureds = (Insureds) httpSession.getAttribute("insureds");

    if(insureds == null){
        insureds = entry.buildInsureds("", "", "", "", "", age, residency, gender, SRC);
        if(insureds != null) httpSession.setAttribute("insured", insureds.getInsuredSet().stream().sorted().iterator().next());
    }else{
        Insured lastAddedInsured = (Insured) httpSession.getAttribute("insured");
        int nextId = lastAddedInsured.getId() + 1;
        Insured newInsured = entry.addInsured("", "", "", "", "", age, residency, gender, nextId, SRC);
        if(newInsured == null){
            httpSession.setAttribute("insured", lastAddedInsured);
        }else{
            httpSession.setAttribute("insured", newInsured);

            insureds.getInsuredSet().add(newInsured);
        }
    }

    httpSession.setAttribute("insureds", insureds);

    response.sendRedirect("../../global/add-personalisation.jsp");
%>
