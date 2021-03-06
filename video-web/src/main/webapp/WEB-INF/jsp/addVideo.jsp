<%--
  Created by IntelliJ IDEA.
  User: YZL
  Date: 2019/6/27
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加视频资源</title>
</head>
<body>

    <h1 style="align-content: center">视频后台添加视频资源</h1>
    <form action="/addVideo" style="font-size: 14px;align-content: center" method="post"
          ENCTYPE="multipart/form-data">
        <table>
            <tr>
                <td>视频名称:</td>
                <td><input type="text" name=videoName></td>
            </tr>
            <tr>
                <td>视频类型:</td>
                <td><select name="videoTypeId" style="width: 170px;">
                    <c:forEach items="${videoTypeList}" var="p">
                        <option value="${p.id}">${p.typeName}</option>
                    </c:forEach>

                </select></td>
            </tr>
            <tr>
                <td>优酷播放URL:</td>
                <td><textarea rows="10" cols="30" name="videoHtml"></textarea></td>
            </tr>
            <tr>
                <td>上传封面:</td>
                <td><input type="file" name="file"></td>
            </tr>
            <tr> <td colspan="2"><input type="submit" value="提交"></td></tr>
        </table>
    </form>

</body>
</html>
