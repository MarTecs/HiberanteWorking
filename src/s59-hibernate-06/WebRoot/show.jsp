<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${map.list }" var="goods">
	${goods.goodsid }${goods.goodsname }<br>
</c:forEach>
<a href="goods.do?method=fenye&page=${map.page+1 }&size=${map.size}">下一页</a>

