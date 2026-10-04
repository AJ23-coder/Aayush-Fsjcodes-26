<%@ page language="java" %>
<%@ page import="java.util.Date" %>
<html>
<body>
    <h2>Welcome</h2>
    <h3>Good Morning, <%= request.getParameter("name") %></h3>
    <p>Email Id: <% out.print(request.getParameter("email")); %></p>
    <h4>Date and Time: <%= new Date() %></h4>
</body>
</html>
