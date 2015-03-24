<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index Page</title>

    <script type="application/javascript">
      function setControllerType(value) {
        document.getElementById("parserType").value = value;
      }
    </script>
  </head>
  <body>

    <form action="parserController" method="get">
      <input type="hidden" name="parserType" id="parserType"/>
      <p><input type="submit" value="SAX" onclick='setControllerType("SAX")'/>
      <p><input type="submit" value="StAX" onclick='setControllerType("StAX")'/>
      <p><input type="submit" value="error" onclick='setControllerType("error")'/>
    </form>
  </body>
</html>
