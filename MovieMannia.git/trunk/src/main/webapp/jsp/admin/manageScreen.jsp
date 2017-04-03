<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript">
	function deleteScreen(id) {
		var x = confirm("Are you sure you want to delete?");
		if (x) {
			document.getElementById("id").value = id;
			document.getElementById('userForm').action = "deleteUser";
			document.getElementById('userForm').submit();
		} else {
			return false;
		}
	}
	function editUser(id,theaterId,theaterName) {
		 document.getElementById("updateDiv").style.display='block';
		    var form=document.getElementById("theaterUpdateForm");
		    form.id.value = id;
		    form.theaterId.value = theaterId;
		    form.theaterName.value = theaterName;
	}
	function addScreen() {
		resetScreen();
	    document.getElementById("addDiv").style.display='block';
	    document.getElementById("updateDiv").style.display='none';
}
  
	function resetScreen(){
		var form=document.getElementById("screenForm");
	    form.screenId.value = '';
	    form.screenCode.value = '';
	    form.totalSeat.value = '';
	  
	}
	
	
</script>

<div id="content" style="background-color: #fff; height: 700px">
	<div id="addDiv" align="center" style="margin-top: 10%; display: none">
		<s:form id="screenForm" action="addScreen">
			<s:hidden key="id" id="id" value="" />
			<s:textfield name="screenId" label="Screen Id"></s:textfield>
			<s:textfield name="screenCode" label="Screen Code "></s:textfield>
			<s:select label="Theater"  name="theater" list="theaterList" listKey="theaterId" listValue="theaterName" />
			<s:textfield name="totalSeat" label="total Seat"></s:textfield>
			<s:submit value="Submit"></s:submit>
		</s:form>
	</div>

	<div id="updateDiv" align="center"
		style="margin-top: 10%; display: none">
		<s:form id="theaterUpdateForm" action="updateTheater">
			<s:hidden key="id" id="id" />
			<s:textfield name="theaterId" label="theaterId"></s:textfield>
			<s:textfield name="theaterName" label="Theater Name "></s:textfield>
			<s:submit value="Submit" label="Update"></s:submit>
		</s:form>
	</div>

<div>
	<s:form id="searchForm" action="searchScreen">
	<s:select label="Theater"  name="theater" list="theaterList" listKey="theaterId" listValue="theaterName" />
	<s:submit value="Submit"></s:submit>
	</s:form>
	<div>
	




	<div id="addformDiv" style="margin-top: 10%; margin-left: 16%">
		<img src="images/add.png" longdesc="Add Screen" width="25px"
			onclick="addScreen()" align="top" height="25px"> <span
			style="font-weight: bold; font-size: 15px;">Add Screen</span>
	</div>
	
	
	</div>
	<div id="formDiv" align="center" style="margin-top: 1%">
		<table border="1" width="500px">
			<tr>
				<td>Screen Id</td>
				<td>Screen Code</td>
				<td>total Seat</td>
				
				<td>update</td>
				<td>delete</td>
			</tr>

			<s:iterator value="screenList">
				<tr>
					<td><s:property value="screenId" /></td>
					<td><s:property value="screenCode" /></td>
					<td><s:property value="totalSeat" /></td>
					
					<td><img src="images/edit.png"
						onclick="editUser('<s:property value="id"/>','<s:property value="screenId"/>','<s:property value="screenCode"/>')"
						width="25px" height="25px"></td>
					<td><img src="images/delete.png" width="25px"
						onclick="deleteScreen('<s:property value="id"/>')" height="25px"></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</div>
