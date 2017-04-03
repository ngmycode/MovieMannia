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
	    form.movieId.value = '';
	    form.movieName.value = '';
	    form.language.value = '';
	    form.certificate.value = '';
	    form.releaseDate.value = '';
	    form.length.value = '';
	    form.actor.value = '';
	}
	
	
</script>

<div id="content" style="background-color: #fff; height: auto">
	<div id="addDiv" align="center" style="margin-top: 10%; display: none">
		<s:form id="movieForm" action="addMovie">
			<s:hidden key="id" id="id" value="" />
			<s:textfield name="movieId" label="Movie Id" placeholder="Movie Id"></s:textfield>
			<s:textfield name="movieName" label="Movie Name" placeholder="Movie Name"></s:textfield>
			<s:select label="Screen"  name="screen" list="screenList" listKey="screenId" listValue="screenCode" />
			<s:textfield name="language" label="Language" placeholder="Language"></s:textfield>
			<s:textfield name="certificate" label="Certificate" placeholder="Certificate"></s:textfield>
			<s:textfield name="releaseDate" label="Release Date " placeholder="Release Date" ></s:textfield>
			<s:textfield name="length" label="Length" placeholder="Length"></s:textfield>
			<s:textfield name="actor" label="Actor " placeholder="Actor"></s:textfield>
			<s:submit value="Submit"></s:submit>
		</s:form>
	</div>

	<div id="updateDiv" align="center"
		style="margin-top: 10%; display: none">
		<s:form id="screenUpdateForm" action="updateScreen">
			<s:hidden key="id" id="id" />
			<s:textfield name="screenId" label="screenId"></s:textfield>
			<s:textfield name="screenCode" label="Screen Code "></s:textfield>
			<s:submit value="Submit" label="Update"></s:submit>
		</s:form>
	</div>

<div>
	<s:form id="searchForm" action="searchMovie">
	<s:select label="Screen"  name="screen" list="screenList" listKey="screenId" listValue="screenCode" />
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
				<td>Movie Id</td>
				<td>Movie Name</td>
				<td>Language</td>
				<td>Certificate</td>
				<td>Release Date</td>
				<td>Length</td>
					<td>Actor</td>
			</tr>

			<s:iterator value="movieList">
				<tr>
					<td><s:property value="movieId" /></td>
					<td><s:property value="movieName" /></td>
					<td><s:property value="language" /></td>
					<td><s:property value="certificate" /></td>
					<td><s:property value="releaseDate" /></td>
					<td><s:property value="length" /></td>
					<td><s:property value="actor" /></td>
					<td><img src="images/edit.png"
						onclick="editUser('<s:property value="id"/>','<s:property value="movieId"/>','<s:property value="movieName"/>')"
						width="25px" height="25px"></td>
					<td><img src="images/delete.png" width="25px"
						onclick="deleteMovie('<s:property value="id"/>')" height="25px"></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</div>
