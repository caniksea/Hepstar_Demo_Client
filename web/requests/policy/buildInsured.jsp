<%@ page import="com.caniksea.hc.controller.Entry" %>
<%@ page import="com.caniksea.hc.models.request.Insured" %>
<%@ page import="com.caniksea.hc.models.request.Insureds" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/27
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("surname");
    String nationalId = request.getParameter("nationalId");
    String passportNumber = request.getParameter("passportNumber");
    String dob = request.getParameter("dob");
//    String age = request.getParameter("age");
    String residency = request.getParameter("residency");
    String gender = request.getParameter("gender");
    final String SRC = "policy";

    Entry entry = new Entry();

    HttpSession httpSession = request.getSession(false);

    httpSession.setAttribute("src", SRC);

    Insureds insureds = (Insureds) httpSession.getAttribute("insureds");

    if(insureds == null){
                insureds = entry.buildInsureds(firstName, lastName, nationalId, passportNumber, dob, "", residency, gender, SRC);
        if(insureds != null) httpSession.setAttribute("insured", insureds.getInsuredSet().stream().sorted().iterator().next());
    }else{
        Insured lastAddedInsured = (Insured) httpSession.getAttribute("insured");
        int nextId = lastAddedInsured.getId() + 1;
        Insured newInsured = entry.addInsured(firstName, lastName, nationalId, passportNumber, dob, "", residency, gender, nextId, SRC);
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
