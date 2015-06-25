<%--
  Created by IntelliJ IDEA.
  User: Общий
  Date: 23.06.2015
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<table width="100%">
  <tr>
    <td class="pl1" colspan="3" width="auto" height="auto">
      <h1>Hello, ${userLogin}!</h1>
    </td>
  </tr>
  <tr>
    <td class="pl">
<section  class="container1">
  <div  class="login">
  <h1>
Ваші особсті данні:
  </h1>
    <table>
      <tr>
        <td class="pl3">
          Ваше ім'я:
        </td>
        <td class="pl3">
          <input class="pl1" type="text" name="sgn1" value=${userName}>
        </td>
        <td class="pl3">
            <input type="submit" name="sgnup" value="Change">
        </td>
      </tr><tr>
        <td class="pl3">
          Ваше прізвище:
        </td>
        <td class="pl3">

          <input class="pl1" type="text" name="sgn1" value=${userSurName}>
        </td>
        <td class="pl3">
            <input type="submit" name="sgnup" value="Change">
        </td>
      </tr><tr>
        <td class="pl3">
          Ваш логін:
        </td>
        <td class="pl3">
          <input class="pl1" type="text" name="sgn1" value=${userLogin}>
        </td>
        <td class="pl3">
            <input type="submit" name="sgnup" value="Change">
        </td>
      </tr>
      <tr>
        <td colspan="3">
          <script type="text/javascript">
            function changeName1() {
                alert();
//              (document.getElementById('i1').style.display='none');
                document.getElementById('jjj1').innerHTML='<b>Введіть ваш старий пароль</b>';
                document.getElementById('pass1').style.display = 'block';
                document.getElementById('jjj2').innerHTML='<b>Введіть ваш новий пароль</b>';
                document.getElementById('pass2').style.display = 'block';
                document.getElementById('jjj3').innerHTML='<b>Повторіть пароль</b>';
                document.getElementById('pass3').style.display = 'block';

            }
          </script>
            <div id="jjj1"></div>
          <input class="pl1" id="pass1" type="password" name="password1" style="display: none;">
            <div id="jjj2"></div>
          <input class="pl1" id="pass2" type="password" name="password2" style="display: none;">
            <div id="jjj3"></div>
          <input class="pl1" id="pass3" type="password" name="password3" style="display: none;">


          <input type="submit"   name="sgnup" onclick="changeName1()" value="Change password">

        </td>
      </tr>
    </table>
    </div>
</section>
    </td>
    <td class="pl">
<section class="container1">
  <div class="login">
  <h1>
    Ваші задачі:
  </h1>
    <table>
      <tr>
        <td colspan="3">
          <input type="submit" name="sgnup" value="Add new task">
        </td>
      </tr>
    </table>
    </div>
</section>
    </td>
    <td class="pl">
<section class="container1">
  <div class="login">
  <h1>
Ваші події:
  </h1>
    <table>
      <tr>
        <td colspan="3">
          <input type="submit" name="sgnup" value="Add new event">
        </td>
      </tr>
    </table>
    </div>
</section>
    </td>
  </tr>
  </table>
</body>
</html>
