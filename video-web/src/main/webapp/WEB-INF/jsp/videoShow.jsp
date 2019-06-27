<%--
  Created by IntelliJ IDEA.
  User: YZL
  Date: 2019/6/27
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${videoInfos.videoName}</title>
</head>
<body>
<center>
    <h1>${videoInfos.videoName}</h1>
    <iframe height=600 width=600 src='${videoInfos.videoHtml}'
            frameborder=0'allowfullscreen'></iframe>
</center>

</body>
</html>

