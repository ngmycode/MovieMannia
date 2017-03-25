show offer
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



  <div>
	<table border="1" width="500px">
		<tr>
			<td>id</td>
			<td>Description</td>
			<td>Date Created</td>
			
		</tr>

		<s:iterator value="offerList">
			<tr>
				<td><s:property value="offer_id" /></td>
				<td><s:property value="offer_desc" /></td>
				<td><s:property value="date_created" /></td>
				
  </tr>
  </s:iterator>
	</table>
	</div>