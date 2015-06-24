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
    <title></title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<section class="container">
  <div class="login">
    <h1>Welcome to Organizer</h1>

 <table>
<tr>
      <td>
    <form method="post" action="/sgnin.jsp">
      <input type="submit" name="sgnin" value="SignIn">
    </form>
  </td>
    <td>
    <form method="post" action="/sgnup.jsp">
      <input type="submit" name="sgnup" value="SignUp">
    </form>
  </td>
</tr>
 </table>
</div>
  </div>
</section>
</body>
</html>
