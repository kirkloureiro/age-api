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
		name="exame.tipoExame" />
		<s:textfield label="Observacao" name="exame.observacao" />
		<s:submit cssClass="button-register" value="Create" />
	</s:form>


   
<%-- 	<s:property value="message" /> --%>
	
	<h3>Exames</h3>

	<table>
		<s:iterator var="exame" value="exames">
			<tr>
				<td><s:property /></td>
				
				<td>
					<s:form action="deleteExame.action">
						<s:hidden name="exameId" value="%{#exame.id}" />
						<s:submit value="Remove" />
					</s:form>
				</td>
				
				<td>
					<s:form action="updateExame.action">
						<s:hidden name="exame.id" value="%{#exame.id}" />
						<s:hidden label="Nome Cliente" name="exame.nomeExame" value="%{#exame.nomeExame}" />
						<s:hidden label="Tipo Exame" name="exame.tipoExame" value="%{#exame.tipoExame}" />
						<s:hidden label="Observacao" name="exame.observacao"  value="%{#exame.observacao}"  />

						<s:submit value="Edit" />
					</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>


</body>
</html>