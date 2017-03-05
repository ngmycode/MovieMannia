<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript">
	function deleteUser(id) {
		var x = confirm("Are you sure you want to delete?");
		if (x) {
			document.getElementById("id").value = id;
			document.getElementById('userForm').action = "deleteUser";
			document.getElementById('userForm').submit();
		} else {
			return false;
		}
	}
	function editUser(id,userId,emial,mobile) {
		    var form=document.getElementById("userUpdateForm");
		    form.id.value = id;
		    form.userId.value = userId;
		    form.email.value = emial;
		    form.mobile.value  = mobile;
	}
	function addUser() {
	    document.getElementById("addDiv").style.display='block';
	    
}

</script>

<div id="content" style="background-color: #fff; height: 700px">
	<div  id="addDiv" align="center" style="margin-top:10%;display: none">
		<s:form id="userForm" action="addUser">
			<s:hidden key="id" id="id" value="" />
			<s:textfield name="userId" label="UserId"></s:textfield>
			<s:textfield name="password" label="Password "></s:textfield>
			<s:textfield name="email" label="Email"></s:textfield>
			<s:textfield name="mobile" label="Mobile"></s:textfield>
			<s:submit value="Submit"></s:submit>
		</s:form>
	</div>

   <div  id="updateDiv" align="center" style="margin-top:10%;display: none">
		<s:form id="userUpdateForm" action="updateUser">
			<s:hidden key="id" id="id" />
			<s:textfield name="userId" label="UserId"></s:textfield>
			<s:textfield name="email" label="Email"></s:textfield>
			<s:textfield name="mobile" label="Mobile"></s:textfield>
			<s:submit value="Submit" label="Update"></s:submit>
		</s:form>
	</div>


<div  id="addformDiv"style="margin-top:10%;margin-left:16% ">
<img src="images/add.png"  longdesc="Add User" width="25px" onclick="addUser()"  align="top" height="25px">
<span style="font-weight:bold;font-size:15px;">Add User</span>
</div>
 <div  id="formDiv" align="center" style="margin-top:1%">
	<table border="1" width="500px">
		<tr>
			<td>id</td>
			<td>UserId</td>
			<td>Email</td>
			<td>Phone</td>
			<td>update</td>
			<td>delete</td>
		</tr>

		<s:iterator value="userList">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="userId" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="mobile" /></td>
				<td><img src="images/edit.png"
				 onclick="editUser('<s:property value="id"/>','<s:property value="userId"/>','<s:property value="email"/>'
				 ,'<s:property value="mobile"/>')" 
				 width="25px" height="25px"></td>
				<td><img src="images/delete.png" width="25px"
					onclick="deleteUser('<s:property value="id"/>')" height="25px"></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</div>
