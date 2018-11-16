<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body>
  <%@ page errorPage="Receive.jsp" %>

  <%
    int fn = Integer.parseInt(request.getParameter("t1"));    
    int sn = Integer.parseInt(request.getParameter("t2"));    
  %>

    <h3>Your first number is <%= fn %> and second number is <%= sn %>. <br>
    Quotient is <%= fn/sn %> </h3>.

</body>