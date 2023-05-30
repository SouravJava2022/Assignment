<%@ page language="java" isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
  <center>
    <table >
     <c:forEach var="name" items="${requestScope.List}" >
        <tr><th>Blog Title</th></tr>
        <tr><td><textarea rows="1" cols="30"><c:out value="${name.getTitle()}"/></textarea></td></tr>
        <tr><th>Blog Description</th></tr>
        <tr><td><textarea rows="2" cols="30"><c:out value="${name.getDescription()}"/></textarea></td></tr>
        <tr><th>Blog Content</th></tr>
        <tr><td><textarea rows="10" cols="30"><c:out value="${name.getContent()}"/></textarea></td></tr>
      
     </c:forEach>
    </table>
     </center>
</body>
</html>