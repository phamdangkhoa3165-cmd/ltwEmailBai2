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
    <span>${surveyDTO.firstName}</span><br>

    <label>Last Name:</label>
    <span>${surveyDTO.lastName}</span><br>

    <label>Email:</label>
    <span>${surveyDTO.email}</span><br>

    <label>Date of Birth:</label>
    <span>${surveyDTO.dateOfBirth}</span><br>

    <label>Hear About Us:</label>
    <span>${surveyDTO.hearAboutUs}</span><br>

    <label>Wants Updates:</label>
    <span>${surveyDTO.wantsUpdates}</span><br>

    <label>Wants Email:</label>
    <span>${surveyDTO.wantsEmail}</span><br>

    <label>Contact Via:</label>
    <span>${surveyDTO.contactVia}</span><br>

    <p>To enter another email address, click on the Back
    button in your browser or the Return button shown below.</p>

    <form action="${pageContext.request.contextPath}/emailList" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Back">
    </form>
</body>
</html>