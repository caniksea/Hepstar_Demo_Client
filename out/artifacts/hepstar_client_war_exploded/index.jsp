<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 11:22 AM
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
    <link rel="stylesheet" href="styles.css">
    <title>Hepstar Client</title>
</head>
<body>
<div class="form-div">
    <form action="requests/global/buildAuth.jsp" method="post">
        <div class="form-group">
            <label for="currency">Currency</label>
            <input type="text" class="form-control" name="currency" id="currency" placeholder="Currency">
        </div>
        <div class="form-group">
            <label for="locale">Locale</label>
            <input type="text" class="form-control" name="locale" id="locale" placeholder="Locale">
        </div>
        <!--            <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Check me out</label>
                    </div>-->
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
