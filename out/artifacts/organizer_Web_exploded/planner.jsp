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
    <script type="text/javascript">
        function AddTask(){
//              (document.getElementById('i1').style.display='none');
            //  <input type="submit" name="sgnup" value="Change">
            document.getElementById('pl10').style.display='none';
            document.getElementById('pl15').innerHTML='<form method="post" action="/iuhiuhiuhiuhiuhiuhiuh"><input class="pl1" id="pass4" type="text" name="taskname" required><textarea wrap="soft" name="taskdescription" required></textarea><input class="pl1" id="pass4" type="text" name="taskprogress" required><input id="pl11" type="submit" name="sgnup" value="Add new task" style="display: inline;"></form>'
            //document.getElementById('pl14').style.textAlign='center';
        }
    </script>
</head>
<body>
<table width="100%">
  <tr>
    <td class="pl1" colspan="3" width="auto" height="auto">
      <h1>Hello, ${userName}!</h1>
    </td>
  </tr>
  <tr>
    <td class="pl">
<section class="container1">
  <div class="login">
  <h1>
Here is your information:
  </h1>
      <form>
    <table>
      <tr>
        <td class="pl3">
          Your name:
        </td>
        <td class="pl3">
          <input class="pl1" type="text" name="sgn1" value=${userName}>
        </td>

      </tr><tr>
        <td class="pl3">
          Your surname:
        </td>
        <td class="pl3">

          <input class="pl1" type="text" name="sgn1" value=${userSurName}>
        </td>

      </tr><tr>
        <td class="pl3">
          Your login:
        </td>
        <td class="pl3">
          <input class="pl1" type="text" name="sgn1" value=${userLogin}>
        </td>
      </tr>
      <tr>
        <td colspan="3">
          <script type="text/javascript">
            function changeName(){
//              (document.getElementById('i1').style.display='none');
          //  <input type="submit" name="sgnup" value="Change">
              document.getElementById('pass1').style.display='block';
            }
          </script>
          <input class="pl1" id="pass3" type="password" name="password1" style="display: none;">
          <input class="pl1" id="pass2" type="password" name="password1" style="display: none;">
          <input class="pl1" id="pass1" type="password" name="password1" style="display: none;">
          <input type="button" name="sgnup" onclick="changeName()" value="Change password">
            <input type="submit" name="sgnup" value="Change">

        </td>
      </tr>
    </table>
      </form>
    </div>
</section>
    </td>
    <td class="pl">
<section class="container1">
  <div class="login">
  <h1>
    Here is your tasks:
  </h1>
    <table>

        <div id="pl15">
      <tr>
        <td>
            <input id="pl10" type="button" onclick="AddTask()" name="sgnup" value="Add new task" >
        </td>
      </tr>
        </div>

    </table>
    </div>
</section>
    </td>
    <td class="pl">
<section class="container1">
  <div class="login">
  <h1>
Here is your events:
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
