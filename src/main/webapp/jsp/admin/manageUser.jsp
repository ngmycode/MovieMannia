<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<head>
 <jsp:include page="adminMenu.jsp" /> 
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    
    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

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
		 document.getElementById("updateDiv").style.display='block';
		    var form=document.getElementById("userUpdateForm");
		    form.id.value = id;
		    form.userId.value = userId;
		    form.email.value = emial;
		    form.mobile.value  = mobile;
	}
	function addUser() {
		resetUser();
	    document.getElementById("addDiv").style.display='block';
	    document.getElementById("updateDiv").style.display='none';
}
  
	function resetUser(){
		var form=document.getElementById("userForm");
	    form.id.value = '';
	    form.userId.value = '';
	    form.password.value = '';
	    form.email.value = '';
	    form.mobile.value  = '';
	}
	
	
</script>

<div class="container">

        <div class="row">
            <div class="box">
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
 <div  id="formDiv" align="center" >
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
				 onclick="editUser('<s:property value="id"/>','<s:property value="userId"/>','<s:property value="email"/>','<s:property value="mobile"/>')" 
				 width="25px" height="25px"></td>
				<td><img src="images/delete.png" width="25px"
					onclick="deleteUser('<s:property value="id"/>')" height="25px"></td>
			</tr>
		</s:iterator>
	</table>
	</div></div></div>
	</div>
</div>
</body>