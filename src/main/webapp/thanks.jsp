<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/main.css" type="text/css"/>
</head>
<body>
    <h1>Thanks for joining our email list</h1>

    <p>Here is the information that you entered:</p>

    <label>First Name:</label>
    <span>${sessionScope.surveyDTO.firstName}</span><br>

    <label>Last Name:</label>
    <span>${sessionScope.surveyDTO.lastName}</span><br>

    <label>Email:</label>
    <span>${sessionScope.surveyDTO.email}</span><br>

    <label>Date of Birth:</label>
    <span>${sessionScope.surveyDTO.dateOfBirth}</span><br>

    <label>Hear About Us:</label>
    <span>${sessionScope.surveyDTO.hearAboutUs}</span><br>

    <label>Wants Updates:</label>
    <span>${sessionScope.surveyDTO.wantsUpdates}</span><br>

    <label>Wants Email:</label>
    <span>${sessionScope.surveyDTO.wantsEmail}</span><br>

    <label>Contact Via:</label>
    <span>${sessionScope.surveyDTO.contactVia}</span><br>

    <p>To enter another email address, click on the Back
    button in your browser or the Return button shown below.</p>

    <form action="${pageContext.request.contextPath}/emailList" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>