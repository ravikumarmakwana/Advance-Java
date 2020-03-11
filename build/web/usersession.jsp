<%
    if(session.getAttribute("login")==null)
        response.sendRedirect("login.jsp");
%>