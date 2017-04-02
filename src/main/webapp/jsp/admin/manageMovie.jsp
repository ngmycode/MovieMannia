<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript">
	function deleteMovie(id) {
		var x = confirm("Are you sure you want to delete?");
		if (x) {
			document.getElementById("id").value = id;
			document.getElementById('userForm').action = "deleteUser";
			document.getElementById('userForm').submit();
		} else {
			return false;
		}
	}
	function editUser(id,screenId,screenName) {
		 document.getElementById("updateDiv").style.display='block';
		    var form=document.getElementById("screenUpdateForm");
		    form.id.value = id;
		    form.screenId.value = screenId;
		    form.screenName.value = screenName;
	}
	function addMovie() {
		resetMovie();
	    document.getElementById("addDiv").style.display='block';
	    document.getElementById("updateDiv").style.display='none';
}
  
	function resetMovie(){
		var form=document.getElementById("movieForm");
	    form.movieCode.value = '';
	    form.movieName.value = '';
	    form.movieAddress.value = '';
	    form.movieEmail.value = '';
	    form.moviePhone.value = '';
	}
	
	
</script>

<div id="content" style="background-color: #fff; height: 700px">
	<div id="addDiv" align="center" style="margin-top: 10%; display: none">
		<s:form id="movieForm" action="addMovie">
			<s:hidden key="id" id="id" value="" />
			<s:textfield name="movieCode" label="Movie Code"></s:textfield>
			<s:textfield name="movieName" label="Movie Name "></s:textfield>
			<s:select label="Screen"  name="screen" list="screenList" listKey="screenId" listValue="screenName" />
			<s:textfield name="movieAddress" label="Movie Address"></s:textfield>
			<s:textfield name="movieEmail" label="Movie Email "></s:textfield>
			<s:textfield name="moviePhone" label="Movie Phone"></s:textfield>
			<s:submit value="Submit"></s:submit>
		</s:form>
	</div>

	<div id="updateDiv" align="center"
		style="margin-top: 10%; display: none">
		<s:form id="screenUpdateForm" action="updateScreen">
			<s:hidden key="id" id="id" />
			<s:textfield name="screenId" label="screenId"></s:textfield>
			<s:textfield name="screenName" label="Screen Name "></s:textfield>
			<s:submit value="Submit" label="Update"></s:submit>
		</s:form>
	</div>

<div>
	<s:form id="searchForm" action="searchMovie">
	<s:select label="Screen"  name="screen" list="screenList" listKey="screenId" listValue="screenName" />
	<s:submit value="Submit"></s:submit>
	</s:form>
	<div>
	




	<div id="addformDiv" style="margin-top: 10%; margin-left: 16%">
		<img src="images/add.png" longdesc="Add Movie" width="25px"
			onclick="addMovie()" align="top" height="25px"> <span
			style="font-weight: bold; font-size: 15px;">Add Movie</span>
	</div>
	
	
	</div>
	<div id="formDiv" align="center" style="margin-top: 1%">
		<table border="1" width="500px">
			<tr>
				<td>Movie Code</td>
				<td>Movie Name</td>
				<td>Movie Address</td>
				<td>Movie Phone</td>
				<td>update</td>
				<td>delete</td>
			</tr>

			<s:iterator value="movieList">
				<tr>
					<td><s:property value="movieCode" /></td>
					<td><s:property value="movieName" /></td>
					<td><s:property value="movieAddress" /></td>
					<td><s:property value="moviePhone" /></td>
					<td><img src="images/edit.png"
						onclick="editUser('<s:property value="id"/>','<s:property value="movieCode"/>','<s:property value="movieName"/>')"
						width="25px" height="25px"></td>
					<td><img src="images/delete.png" width="25px"
						onclick="deleteUser('<s:property value="id"/>')" height="25px"></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</div>
