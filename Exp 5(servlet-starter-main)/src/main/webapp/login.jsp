<%@ page language="java" %>
<% 
    if(session.getAttribute("useremail")!= null){
        response.sendRedirect("dashboard.jsp");
    }
%>
<html>
<body>
    <h2>Login Page</h2>
    <form action="login" method="post">
        <%
            if(request.getParameter("message")!=null){
        %>
        <div>
            <p><%= request.getParameter("message") %></p>
        </div>
        <%
            }
        %>
        <div>
            <label for="email">Email ID</label>
            <input type="email" name="email" id="email">
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" name="password" id="password">
        </div>
        <div>
            <button type="submit">Login</button>
            <a href="index.jsp">Back</a>
        </div>
    </form>
</body>
</html>
