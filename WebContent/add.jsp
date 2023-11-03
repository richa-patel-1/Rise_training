<%@ page
errorPage="error.jsp"
 language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
   <%--  <%@ include file="header.jsp" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Add jsp</title>
</head>
<body bgcolor="cyan">
<%!
 String clg[] ={"Daiict","parul","charusat"};

  String getName(int i)
  {
	  return clg[i];
  }

%>

<%-- <%
int i = Integer.parseInt(request.getParameter("num1"));
int j = Integer.parseInt(request.getParameter("num2"));

int k = i+j;

out.println("Jsp Output is "+k);
out.println("clg names "+clg[1]);
%> --%>
<%
 int b  = 9/0;
%>

</body>
</html>