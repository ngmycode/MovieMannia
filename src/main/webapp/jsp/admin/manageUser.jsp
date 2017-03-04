<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
 <%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div id="content" style=" background-color: #fff ;height: 700px"> 
 <div align="center" style="margin-top: 10%">
<s:form action="addUser">
<s:textfield name="userId" label="UserId" ></s:textfield>
<s:textfield name="password" label="Password " ></s:textfield>
<s:textfield name="email" label="Email" ></s:textfield>
<s:textfield name="mobile" label="Mobile" ></s:textfield>
<s:submit value="Submit"  ></s:submit><s:reset value="reset" ></s:reset>
</s:form>
 </div>

<table border="1"  width="500px" align="center">
<tr>
<td>UserId</td>
<td>Email</td>
<td>Phone</td>
<td>update</td>
<td>delete</td>

</tr>
 
 <s:iterator  value="userList">  
<tr>
<td><s:property value="userId"/></td>
<td><s:property value="email"/></td>  
<td><s:property value="mobile"/></td>  
<td><img src="images/edit.png" width="25px" height="25px" ></td>
<td><img src="images/delete.png" width="25px" height="25px"></td>
</tr>

</s:iterator> 
</table> 
</div> 