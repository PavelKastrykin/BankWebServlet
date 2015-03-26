
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Parser result</title>
</head>
<body>
<table>
  <tr> <th>IBAN</th> <th>Bank name</th> <th>Country</th> <th>Account type</th> <th>Depositor name</th>
    <th>Account ID</th> <th>Amount</th> <th>Annual profit</th> <th>Term</th> </tr>
  <c:forEach var="account" items="${content}" >
    <tr> <td>${account.IBAN}</td> <td>${account.bankName}</td> <td>${account.country}</td> <td>${account.typeOfAccount}</td>
      <td>${account.depositor}</td> <td>${account.accountID}</td> <td>${account.amount}</td> <td>${account.annualProfit}</td>
      <td>${account.term}</td> </tr>
  </c:forEach>
</table>
</body>
</html>
