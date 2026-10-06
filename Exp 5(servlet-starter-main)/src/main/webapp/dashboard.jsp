<%@ page language="java" %>
<% 
    if(session.getAttribute("useremail")== null){
        response.sendRedirect("login.jsp?message=Login First");
    }
%>
<html>
<body>
    <h2>Dashboard</h2>
    <h4>Welcome, <%= session.getAttribute("username") %></h4>
    <p>Email Id: <%= session.getAttribute("useremail") %></p>
    <a href="logout">Logout</a>
</body>
</html>
