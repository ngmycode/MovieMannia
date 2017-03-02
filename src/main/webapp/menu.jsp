<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
function validate(){
	
	document.getElementById('userId').value=document.getElementById('id').value;
	document.getElementById('password').value=document.getElementById('pass').value;
	document.getElementById('loginForm').submit();
	
}



</script>
<%-- <a href="<s:url action="friendsLink"/>" >Friends</a><br>
<a href="<s:url action="officeLink"/>" >The Office</a><br> --%>
<div id="sidebar">
<!-- <div id="login">
      <h2 class="title1">Search Movie</h2>
      <form id="form1" method="post" action="#">
        <fieldset>
        <label for="inputtext1">Username:</label>
        <input id="inputtext1" type="text" name="inputtext1" value="" />
        <label for="inputtext2">Password:</label>
        <input id="inputtext2" type="password" name="inputtext2" value="" />
        <input id="inputsubmit1" type="submit" name="inputsubmit1" value="Sign In" />
        </fieldset>
      </form>
    </div> 
 -->
    <div id="login" style="height: 475px">
      <h2 class="title1">Login</h2>
      <s:form action="login" id="loginForm" onsubmit="validate()">
      <s:hidden name="userId" id="userId"  />
       <s:hidden name="password" id="password"  />
        <fieldset>
        <label for="inputtext1">Username:</label>
        <input id="id" type="text" name="id" value="" />
        <label for="inputtext2">Password:</label>
        <input id="pass" type="password" name="pass" value="" />
        <input id="inputsubmit1" type="submit" name="inputsubmit1" value="Sign In" />
        <p><a href="#">Forgot your password?</a><br />
          <a href="#">Register for Free!</a></p>
        </fieldset>
        </s:form>
    </div>
     <div id="login">
      <!-- <h2 class="title1">Search Movie</h2>
      <form id="form1" method="post" action="#">
        <fieldset>
        <label for="inputtext1">Username:</label>
        <input id="inputtext1" type="text" name="inputtext1" value="" />
        <label for="inputtext2">Password:</label>
        <input id="inputtext2" type="password" name="inputtext2" value="" />
        <input id="inputsubmit1" type="submit" name="inputsubmit1" value="Sign In" />
        </fieldset>
      </form> -->
    </div>  
 </div>