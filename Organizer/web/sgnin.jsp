<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 11.06.2015
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title> Органайзер</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>

<section class="container">
  <div class="login">
    <h1>Login to Organizer</h1>
    <form method="post" action="/login">
      <p><input type="text" name="login" value="" placeholder="Enter your login"></p>
      <p><input type="password" name="password" value="" placeholder="Enter your password"></p>
      <p class="remember_me">
        <%--<label>--%>
          <%--<input type="checkbox" name="remember_me" id="remember_me">--%>
          <%--Remember me on this computer--%>
        <%--</label>--%>
      </p>
      <p class="submit"><input type="submit" name="commit" value="Login"></p>
    </form>
  </div>
</section>

</body>
</html>
