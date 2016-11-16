<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib tagdir="/WEB-INF/tags/page" prefix="page" %>

<%
    int number = 1; %>
<page:header/>
HEELO REVERS JSP
${requestScope.nick}
<%=number%>

<page:footer/>