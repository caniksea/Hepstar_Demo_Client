<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 6:44 PM
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
    <title>Hepstar Client - add global travel information</title>
</head>
<body>
<div class="form-div">
    <p><h4>Add Travel Information</h4></p>
    <form action="../requests/global/buildGTinfo.jsp" method="post">
        <div class="form-group">
            <label for="startdate">Start Date</label>
            <input class="form-control" type="date" id="startdate" name="startdate">
        </div>
        <div class="form-group">
            <label for="enddate">End Date</label>
            <input class="form-control" type="date" id="enddate" name="enddate">
        </div>
        <div class="form-group">
            <label for="departure">Departure Country</label>
            <input type="text" class="form-control" name="departure" id="departure" placeholder="Departure Country">
        </div>
        <div class="form-group">
            <label for="bvalue">Booking Value</label>
            <input type="text" class="form-control" name="bvalue" id="bvalue" placeholder="Booking Value">
        </div>
        <div class="row">
            <div class="col-sm-6"><input type="submit" name="submit" class="btn btn-primary" value="Continue"></div>
            <%--<div class="col-sm-6"><input type="submit" name="submit" class="btn btn-primary float-right" value="Continue"></div>--%>
        </div>
    </form>
</div>
</body>
</html>
