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

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<!-- link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet"-->

<!-- Custom styles for this template -->
<!-- link href="signin.css" rel="stylesheet"-->
<link rel='stylesheet' href='<c:url value="/resources/css/signin.css" />' />

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

   <div class="container">

      <form:form class="form-signin" method="post" action="/mima/login" modelAttribute="loginBean">
         <h2 class="form-signin-heading">Please sign in</h2>
         <label for="inputEmail" class="sr-only">Email address</label>
         <form:input type="email" id="inputEmail" path="email" class="form-control" placeholder="Email address" required="required"
            autofocus="autofocus" />
         <label for="inputPassword" class="sr-only">Password</label>
         <form:input type="password" id="inputPassword" path="password" class="form-control" placeholder="Password" required="required" />
         <div class="checkbox">
            <label> <input type="checkbox" value="remember-me"> Remember me
            </label>
         </div>
         <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form:form>

   </div>
   <!-- /container -->


   <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
   <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
