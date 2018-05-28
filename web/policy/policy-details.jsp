<%@ page import="com.caniksea.hc.models.response.PolicyInformation" %>
<%@ page import="com.caniksea.hc.models.response.PolicyResponse" %><%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/27
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession httpSession = request.getSession(false);
    PolicyResponse pr = (PolicyResponse) httpSession.getAttribute("policyCallResponse");
    PolicyInformation pi = pr.getResponseParameters().getPolicies().getPolicy().getPolicyInformation();
    String policyName = pi.getProductName();
    String insurerName = pi.getInsurer().getInsurerName();
    String insurerEmail = pi.getInsurer().getContact().getEmail();
    String policyNo = pi.getPolicyNo();
%>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../styles.css">
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <script src="../scripts.js"></script>
    <title>Hepstar Client - Policy Acquired</title>
</head>
<body>
<div class="form-div">
    <p><em>Policy Acquired Successfully!</em></p>
    <p>To cancel, click <strong>Cancel</strong>.</p>
    <form action="../requests/policy/cancel-policy.jsp" method="post">
        <div class="row">
            <div class="col-md-6 form-group">
                <label>Insurer Name</label>
                <label class="form-control"><%= insurerName %></label>
            </div>
            <div class="col-md-6 form-group">
                <label>Insurer Email</label>
                <label class="form-control"><%= insurerEmail %></label>
            </div>
        </div>
        <div class="row">
            <div class="col-md-9 form-group">
                <label>Policy/Product Name</label>
                <label class="form-control"><%= policyName %></label>
            </div>
            <div class="col-md-3">
                <button id="cancel-policy" class="btn btn-primary float-right" value="">Cancel</button>
            </div>
        </div>
        <input type="hidden" name="policyNo" value="<%= policyNo%>">
        <div id="cancel-block" class="row">
            <div class="col-md-9 form-group">
                <label for="reason">Reason</label>
                <textarea class="form-control" rows="3" name="reason" id="reason"></textarea>
            </div>
            <div class="col-md-3">
                <input type="submit" name="submit" class="btn btn-primary float-right" value="Submit">
            </div>
        </div>
    </form>
</div>
</body>
</html>
