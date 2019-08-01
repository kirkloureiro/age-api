<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>

	<s:form action="createExame.action" method="post">
		<s:textfield label="Nome Cliente" name="exame.nomeExame" />
	    <s:select  label="Tipo Exame"  
		list="#{'MAMOGRAFIA':'MAMOGRAFIA', 'RESSONANCIA':'RESSONANCIA', 'ULTRASOM':'ULTRASOM'}" 
		name="" />
		<s:textfield label="Observacao" name="exame.observacao" />
		<s:submit cssClass="button-register" value="Create" />
	</s:form>


   
	<s:property value="message" />
  </body>
</html>