<jsp:include page="_header.jsp"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h1>
    <div style="text-align: center;">О проекте</div>
</h1>
<p style="margin-left: 50px;"> Учебный проект студента ит-академии. Тема проекта - букинг-сервис аренды автомобилей.
    Используемые технологии:
    <br>
    - Java 11
    <br>
    - Spring boot
    <br>
    - Hibernate (в составе spring-boot-data-starter-data-jpa)
    <br>
    - Maven
    <br>
    - Git
    <br>
    - H2 Реляционная БД
</p>
<br>
Функционал по:
<br>
- Добавлению\удалению автомобилей,
<br>
- Добавлению\удалению\просмотру пользователей,
<br>
- Удалению\просмотру заказов,
<br>
- Добавлению\просмотру вида платежей
Доступен только Администраторам.
</body>
</html>
<jsp:include page="_footer.jsp"/>