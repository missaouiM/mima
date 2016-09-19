<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="mmissaoui">
<link rel="icon" href="../../favicon.ico">

<title>Signin Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link rel='stylesheet' href='<c:url value="/resources/css/bootstrap.min.css" />' />

<link rel='stylesheet' href='<c:url value="/resources/css/signin.css" />' />
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

</head>

<body>

   <div class="container">

      <form:form class="form-signin" method="post" action="/mima/signUp" modelAttribute="client">
         <h2 class="form-signin-heading">Please sign up</h2>
         <label for="name" class="sr-only">Name</label>
         <form:input type="text" id="inputName" path="name" class="form-control" placeholder="Name" required="required"/>
         <label for="lastName" class="sr-only">Last name</label>
         <form:input type="text" id="inputLastName" path="lastName" class="form-control" placeholder="lastName" required="required"  />         
         <label for="inputEmail" class="sr-only">Email address</label>
         <form:input type="email" id="inputEmail" path="email" class="form-control" placeholder="Email address" required="required"
            autofocus="autofocus" />
         <label for="inputPassword" class="sr-only">Password</label>
         <form:input type="password" id="inputPassword" path="password" class="form-control" placeholder="Password" required="required" />
         <!-- <div class="checkbox">
            <label> <input type="checkbox" value="remember-me"> Remember me
            </label>
         </div>-->
         <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
      </form:form>

   </div>
   <!-- /container -->


   <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
   <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
