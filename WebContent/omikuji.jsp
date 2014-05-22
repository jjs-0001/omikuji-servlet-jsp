<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">
<title>今日の運勢</title>
</head>
<body>

<b><p class="text-center">今日の運勢</p></b>
<H1><p class="text-center">
  <%= request.getAttribute("result") %>
</p></H1>
<p class="text-center">
  <%= request.getAttribute("hyouka") %>
</p>

</body>
</html>