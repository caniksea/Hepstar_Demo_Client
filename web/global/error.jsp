<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/26
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String error = (String) request.getSession(false).getAttribute("error");
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
    <title>Hepstar Client - error page</title>
</head>
<body>
<div class="form-div">
    <p><em>
        An error occurred! Product price call unsuccessful.
    </em></p>
    <hr />
    <p><%= error%></p>
    <hr />
    <form action="../index.jsp" method="post">
        <div class="row">
            <%--<div class="col-sm-6"><input type="submit" name="submit" class="btn btn-primary" value="Add Another Insured"></div>--%>
            <div class="col-sm-12"><input type="submit" name="submit" class="btn btn-primary float-right" value="Try Again"></div>
        </div>
    </form>
</div>
</body>
</html>
