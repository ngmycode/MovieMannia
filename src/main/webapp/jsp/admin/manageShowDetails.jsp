<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript"><!---->
	function deleteShowDetails(id) {
		var x = confirm("Are you sure you want to delete?");
		if (x) {
			document.getElementById("id").value = id;
			document.getElementById('showDetailsForm').action = "deleteShowDetails";
			document.getElementById('showDetailsForm').submit();
		} else {
			return false;
		}
	}
	function editUser(id,movieId,movieName) {
		 document.getElementById("updateDiv").style.display='block';
		    var form=document.getElementById("movieUpdateForm");
		    form.id.value = id;
		    form.movieId.value = movieId;
		    form.movieName.value = movieName;
	}
	function addShowDetails() {
		resetShowDetails();
	    document.getElementById("addDiv").style.display='block';
	    document.getElementById("updateDiv").style.display='none';
}
  
	function resetShowDetails(){
		var form=document.getElementById("showDetailsForm");
	    form.showId.value = '';
	    form.showTime.value = '';
	    form.date.value = '';
	    form.date.price = '';
	  
	}
	
	
</script>

<div id="content" style="background-color: #fff; height: 700px">
	<div id="addDiv" align="center" style="margin-top: 10%; display: none">
		<s:form id="showDetailsForm" action="addShowDetails">
			<s:hidden key="id" id="id" value="" />
			<s:textfield name="showId" label="Show Id"></s:textfield>
			<s:textfield name="showTime" label="Show Time "></s:textfield>
			<s:textfield name="date" label="Date "></s:textfield>
			<s:textfield name="price" label="Price "></s:textfield>
			<s:select label="Movie"  name="movie" list="movieList" listKey="movieId" listValue="movieName" />
		
			<s:submit value="Submit"></s:submit>
		</s:form>
	</div>

	<div id="updateDiv" align="center"
		style="margin-top: 10%; display: none">
		<s:form id="movieUpdateForm" action="updateMovie">
			<s:hidden key="id" id="id" />
			<s:textfield name="movieId" label="movieId"></s:textfield>
			<s:textfield name="movieName" label="Movie Name "></s:textfield>
			<s:submit value="Submit" label="Update"></s:submit>
		</s:form>
	</div>

<div>
	<s:form id="searchForm" action="searchShowDetails">
	<s:select label="Movie"  name="movie" list="movieList" listKey="movieId" listValue="movieName" />
	<s:submit value="Submit"></s:submit>
	</s:form>
	<div>
	




	<div id="addformDiv" style="margin-top: 10%; margin-left: 16%">
		<img src="images/add.png" longdesc="Add ShowDetails" width="25px"
			onclick="addShowDetails()" align="top" height="25px"> <span
			style="font-weight: bold; font-size: 15px;">Add ShowDetails</span>
	</div>
	
	
	</div>
	<div id="formDiv" align="center" style="margin-top: 1%">
		<table border="1" width="500px">
			<tr>
				<td>Show Id</td>
				<td>Show Time</td>
				<td>Date</td>
				<td>Price</td>
				
				<td>update</td>
				<td>delete</td>
			</tr>

			<s:iterator value="showDetailsList">
				<tr>
					<td><s:property value="showId" /></td>
					<td><s:property value="showTime" /></td>
					<td><s:property value="date" /></td>
					<td><s:property value="price" /></td>
					<td><img src="images/edit.png"
						onclick="editUser('<s:property value="id"/>','<s:property value="showId"/>','<s:property value="showTime"/>')"
						width="25px" height="25px"></td>
					<td><img src="images/delete.png" width="25px"
						onclick="deleteShowDetails('<s:property value="id"/>')" height="25px"></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</div>
