<%-- 标签 --%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="config" uri="/WEB-INF/tlds/config.tld"%>
<%-- 项目路径 --%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<c:set var="staticPath" value="${basePath}/resources"></c:set>
<c:set var="adminPath" value="${basePath}/${config:getAdminPath()}" />