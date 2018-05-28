<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String command = request.getParameter("submit");
    HttpSession httpSession = request.getSession(false);
    if(command.trim().equalsIgnoreCase("Add another insured")){
        httpSession.removeAttribute("personalisation");

        String src = (String) httpSession.getAttribute("src");
        if(src.equals("product")) response.sendRedirect("../../product/add-insured.jsp");
        else if(src.equals("policy")) response.sendRedirect("../../policy/add-insured.jsp");
    }else{
        response.sendRedirect("../../global/add-gtinfo.jsp");
    }
%>
