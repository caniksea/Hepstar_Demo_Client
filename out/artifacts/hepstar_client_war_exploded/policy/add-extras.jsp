<%--
  Created by IntelliJ IDEA.
  User: caniksea
  Date: 2018/05/27
  Time: 6:47 PM
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
    <title>Hepstar Client - add extras (policy)</title>
</head>
<body>
<div class="form-div">
    <h4>Add Distributor's Ref, Contact Email & Payment Information</h4>
    <form action="../requests/policy/include-extras.jsp" method="post">
        <div class="row">
            <div class="col-md-6 form-group">
                <label for="distributorReference">Distributor Reference</label>
                <input type="text" class="form-control" name="distributorReference" id="distributorReference" placeholder="Distributor Reference">
            </div>
            <div class="col-md-6 form-group">
                <label for="email">Contact Information - Email</label>
                <input type="email" class="form-control" name="email" id="email" placeholder="abc@xyz.com">
            </div>
        </div>
        <hr />
        <em>Payment Information</em>
        <hr />
        <div class="row">
            <div class="col-sm-4 form-group">
                <label for="cardType">Card Type</label>
                <select class="form-control" name="cardType" id="cardType">
                    <option selected>Choose...</option>
                    <option value="Visa">Visa</option>
                    <option value="MasterCard">Master Card</option>
                </select>
            </div>
            <div class="col-sm-8 form-group">
                <label for="cardNumber">Card Number</label>
                <input type="text" class="form-control" name="cardNumber" id="cardNumber" placeholder="Card Number">
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 form-group">
                <label for="cardHolder">Card Holder Name</label>
                <input type="text" class="form-control" name="cardHolder" id="cardHolder" placeholder="Card Holder Name">
            </div>
        </div>
        <div class="row">
            <div class="col-sm-4 form-group">
                <label for="cvv">CVV</label>
                <input type="text" class="form-control" name="cvv" id="cvv" placeholder="CVV">
            </div>
            <div class="col-sm-4 form-group">
                <label for="month">Expiry Month</label>
                <input type="text" class="form-control" name="month" id="month" placeholder="03" >
            </div>
            <div class="col-sm-4 form-group">
                <label for="year">Expiry Year</label>
                <input type="month" class="form-control" name="year" id="year" placeholder="2022" >
            </div>
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
