<%@ page isErrorPage="true" %>
<jsp:include page="_header.jsp"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<div style="text-align: center;">
    <h2><span style="color: #8b0000; ">Ошибка! Что-то пошло не так!</span></h2>
    <br>
    <h2><span style="color: #8b0000; ">Error! Something wrong!</span></h2>
</div>
<br>
<br>
<p style="margin-left: 50px"> Возможно, у Вас не хватает прав для работы с данным функционалом. <a href="/about">Подробнее</a>
</p>
</body>
</html>
<jsp:include page="_footer.jsp"/>