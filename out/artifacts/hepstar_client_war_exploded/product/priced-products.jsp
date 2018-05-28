<%@ page import="com.caniksea.hc.models.response.Package" %>
<%@ page import="com.caniksea.hc.models.response.ProductInformation" %>
<%@ page import="com.caniksea.hc.models.response.ProductResponse" %>
<%@ page import="java.util.Set" %>
<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/26
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession httpSession = request.getSession(false);
    ProductResponse pricedCallProductResponse = (ProductResponse) httpSession.getAttribute("pricedCallProductResponse");
    Set<Package> packages = pricedCallProductResponse.getProductResponseParameters().getPackages().getPackages();
    ProductInformation pi = packages.stream().iterator().next().getPricedProduct().getProductInformation();
    String productName = pi.getName();
    String productCode = pi.getId();
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
    <title>Hepstar Client - products</title>
</head>
<body>
<div class="form-div">
    <p><em>See list of products below.</em></p>
    <form action="../requests/policy/initiate-request.jsp" method="post">
        <div class="row">
            <div class="col-sm-6"><%= productName %></div>
            <div class="col-sm-2"><input type="hidden" name="productcode" value="<%= productCode%>"> </div>
            <div class="col-sm-4"><input type="submit" name="submit" class="btn btn-primary float-right" value="Get Policy"></div>
        </div>
    </form>
</div>
</body>
</html>
