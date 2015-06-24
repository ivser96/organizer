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
    <h1>Registration in Organizer</h1>
    <form method="post" action="/Reg">
      <p><input type="text" name="name" value="" placeholder="Enter your name"></p>
      <p><input type="text" name="surname" value="" placeholder="Enter your surname"></p>
      <p><input type="text" name="login" value="" placeholder="Enter your login"></p>
      <p><input type="password" name="password" value="" placeholder="Enter your password"></p>
      <p class="submit"><input type="submit" name="commit" value="Registration"></p>
    </form>
  </div>
</section>

</body>
</html>
