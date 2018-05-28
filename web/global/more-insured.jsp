<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Hepstar Client - add more insured</title>
</head>
<body>
<div class="form-div">
    <em>
        To add another insured, click <strong>Add Another</strong>.
        <p>Else, click <strong>Continue</strong> to proceed.</p>
    </em>
    <form action="../requests/global/process-more-insured.jsp" method="post">
        <div class="row">
            <div class="col-sm-6"><input type="submit" name="submit" class="btn btn-primary" value="Add Another Insured"></div>
            <div class="col-sm-6"><input type="submit" name="submit" class="btn btn-primary float-right" value="Continue"></div>
        </div>
    </form>
</div>
</body>
</html>
