<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/27
  Time: 3:55 PM
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
    <title>Hepstar Client - add insured (policy)</title>
</head>
<body>
<div class="form-div">
    <h4>Add Insured</h4>
    <form action="../requests/policy/buildInsured.jsp" method="post">
        <div class="row">
            <div class="col-md-6 form-group">
                <label for="firstName">First Name</label>
                <input type="text" class="form-control" name="firstName" id="firstName" placeholder="First Name">
            </div>
            <div class="col-md-6 form-group">
                <label for="surname">Surname</label>
                <input type="text" class="form-control" name="surname" id="surname" placeholder="Surname">
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 form-group">
                <label for="nationalId">National ID</label>
                <input type="text" class="form-control" name="nationalId" id="nationalId" placeholder="National ID">
            </div>
            <div class="col-md-4 form-group">
                <label for="passportNumber">Passport Number</label>
                <input type="text" class="form-control" name="passportNumber" id="passportNumber" placeholder="Passport Number">
            </div>
            <div class="col-md-4 form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" class="form-control" name="dob" id="dob">
            </div>
        </div>
        <%--<div class="form-group">--%>
            <%--<label for="age">Age</label>--%>
            <%--<input type="text" class="form-control" name="age" id="age" placeholder="Age">--%>
        <%--</div>--%>
        <div class="row">
            <div class="col-md-6 form-group">
                <label for="residency">Residency</label>
                <input type="text" class="form-control" name="residency" id="residency" placeholder="Residency">
            </div>
            <div class="col-md-6 form-group">
                <label for="gender">Gender</label>
                <select class="form-control" name="gender" id="gender">
                    <option selected>Choose...</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                </select>
            </div>
        </div>
        <!--            <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Check me out</label>
                    </div>-->
        <button type="submit" class="btn btn-primary">Next</button>
    </form>
</div>
</body>
</html>
