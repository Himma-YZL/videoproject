<%--
  Created by IntelliJ IDEA.
  User: YZL
  Date: 2019/6/26
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>后台管理系统</title>
</head>
<body>
    <h1 style="align-content: center">视频后台管理系统</h1>
    <table style="align-content: center">
        <thead>
            <tr>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${videoInfos}" var="v">
                <tr>
                    <th><img src="${v.videoUrl}"></th>
                    <th>${v.videoName}</th>
                    <th>${v.typeName}</th>
                    <th><a href="/videoShow?id=${v.id}" style="text-decoration: none">预览</a></th>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
