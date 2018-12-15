<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">

    <link href="/css/main.css" rel="stylesheet"/>
</head>
<body>

<form method="POST" action="/upload" enctype="multipart/form-data">
    <input type="file" name="file"/><br/>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>