<%@taglib uri="/struts-tags" prefix="s"%>

<%-- <a href="<s:url action="friendsLink"/>" >Friends</a><br>
<a href="<s:url action="officeLink"/>" >The Office</a><br> --%>
<div id="sidebar">
<div id="menu"  >
      <ul>
        <li class="first"><a href="#">Manage User</a></li>
        <li><a href="#">Search Movie</a></li>
        <li><a href="#">Book Ticket</a></li>
        <li><a href="#">View History</a></li>
      </ul>
 </div>
 <!-- end menu -->
    <div id="login">
      <h2 class="title1">Login</h2>
      <form id="form1" method="post" action="#">
        <fieldset>
        <label for="inputtext1">Username:</label>
        <input id="inputtext1" type="text" name="inputtext1" value="" />
        <label for="inputtext2">Password:</label>
        <input id="inputtext2" type="password" name="inputtext2" value="" />
        <input id="inputsubmit1" type="submit" name="inputsubmit1" value="Sign In" />
        <p><a href="#">Forgot your password?</a><br />
          <a href="#">Register for Free!</a></p>
        </fieldset>
      </form>
    </div> 
 </div>