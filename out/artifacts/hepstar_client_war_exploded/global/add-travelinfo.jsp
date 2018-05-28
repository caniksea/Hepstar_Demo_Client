<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/24
  Time: 4:37 PM
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
    <title>Hepstar Client - add specific travel information</title>
</head>
<body>
<div class="form-div">
    <h4>Add Travel Information for insured.</h4>
    <em>
        You can add multplie travel information by clicking <strong>Add Another</strong>.
        <p>Click <strong>Continue</strong> to proceed.</p>
    </em>
    <form action="../requests/global/include-travelinfo.jsp" method="post">
        <div class="form-group">
            <label for="info">Information</label>
            <input type="text" class="form-control" name="info" id="info" placeholder="Travel Information">
        </div>
        <!--            <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Check me out</label>
                    </div>-->
        <div class="row">
            <%--<div class="col-sm-6"><input type="submit" name="submit" class="btn btn-primary" value="Add Another"></div>--%>
            <div class="col-sm-12"><input type="submit" name="submit" class="btn btn-primary float-right" value="Continue"></div>
        </div>
    </form>
</div>
</body>
</html>
