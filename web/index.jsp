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
      <input type="hidden" name="filename" value="index.jsp"/>
      <input type="hidden" name="parserType" id="parserType"/>
      <p><input type="submit" value="SAX" onclick='setControllerType("SAX_COMMAND")'/>
      <p><input type="submit" value="STAX" onclick='setControllerType("STAX_COMMAND")'/>
      <p><input type="submit" value="DOM" onclick='setControllerType("DOM_COMMAND")'/>
    </form>
  </body>
</html>
