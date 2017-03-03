<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
 <%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div id="content" style=" background-color: #fff ;height: 550px"> 
 <div align="center" style="margin-top: 10%">
<s:form action="addUser">
<s:textfield name="userId" label="UserId" ></s:textfield>
<s:textfield name="password" label="Password " ></s:textfield>
<s:textfield name="email" label="Email" ></s:textfield>
<s:textfield name="mobile" label="Mobile" ></s:textfield>
<s:submit value="Submit"  ></s:submit><s:reset value="reset" ></s:reset>
</s:form>
 </div>
 
 <s:iterator  value="userList">  
<fieldset>  
<s:property value="userId"/><br/>  
<s:property value="password"/><br/>  
<s:property value="email"/><br/>  
<s:property value="mobile"/><br/>  
</fieldset>  
</s:iterator> 
 
</div> 