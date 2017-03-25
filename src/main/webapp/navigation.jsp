<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>

<nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
                <a class="navbar-brand" href="index.html">Movie Mannia</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="index.jsp">Home</a>
                    </li>
                    <li>
                        <a href="welcome.jsp#searchbox">Search Movie</a>
                    </li>
                    <li>
                        <a href="contact.html">Contact</a>
                    </li>
                    <li>
                         <a href="<s:url action="showOffer"/>">Offers</a>
                    </li>
                     <li>
                       
   <button class="btn btn-primary" data-toggle="modal" data-target="#myModal">
    Login/Register</button>
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
    aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    ×</button>
                <h4 class="modal-title" id="myModalLabel">
                    Login/Registration - </h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-8" style="border-right: 1px dotted #C2C2C2;padding-right: 30px;">
                        <!-- Nav tabs -->
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#Login" data-toggle="tab">Login</a></li>
                            <li><a href="#Registration" data-toggle="tab">Registration</a></li>
                        </ul>
                        <!-- Tab panes -->
                        <div class="tab-content" >
                            <div class="tab-pane active" id="Login" >
                            <div id="login">
                            <s:form action="login" id="loginForm" onsubmit="validate()">
      <s:hidden name="userId" id="userId"  />
       <s:hidden name="password" id="password"  />
                                <form role="form" class="form-horizontal">
                                <div class="form-group">
                                 <label for="inputtext1" class="col-sm-2 control-label">
                                    
                                        Email</label>
                                    <div class="col-sm-10">
                                     <input id="id" type="text" name="id" class="form-control"  placeholder="Email" />
                                                                            </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputtext2" class="col-sm-2 control-label">
                                        Password</label>
                                    <div class="col-sm-10">
                                    <input id="pass" type="password" name="pass" class="form-control" placeholder="Email"/>
                                                                          </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                     <input id="inputsubmit1" type="submit" name="inputsubmit1" value="Sign In" />
                                      <!--   <button type="submit" class="btn btn-primary btn-sm">
                                            Submit</button> -->
                                        <a href="javascript:;">Forgot your password?</a>
                                    </div>
                                </div>
                                
                                </form>
                                </s:form>
                                </div>
                            </div>
                           <!--  <div  id="addDiv" align="center" style="margin-top:10%;display: none">-->
		             <div class="tab-pane" id="Registration">
                            <div id="addDiv">
                            <s:form id="userForm" action="addUser">
                            <s:hidden key="id" id="id" value="" />
                                <form role="form" class="form-horizontal">
                               
                                <s:textfield name="userId" label="UserId"></s:textfield>
		
                                 <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">
                                        UserId</label>
                                    
                                           
                                            <div class="col-md-9">
                                              <input type="name" name="userId" class="form-control" id="name" placeholder="User Id" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">
                                        Email</label>
                                    <div class="col-sm-10">
                                       <input type="email" name="email" class="form-control" id="email" placeholder="Email" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="mobile" class="col-sm-2 control-label">
                                        Mobile</label>
                                    <div class="col-sm-10">
                                       <input type="mobile" name="mobile" class="form-control" id="mobile" placeholder="Mobile" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-sm-2 control-label">
                                        Password</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="password" placeholder="Password" />
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                    <s:submit value="Submit"></s:submit>
                                        <button type="button" class="btn btn-primary btn-sm">
                                            Save & Continue</button>
                                        <button type="button" class="btn btn-default btn-sm">
                                            Cancel</button>
                                    </div>
                                </div>
                                </form>
                              </s:form> 
                            </div>
                            </div>
                        </div>
                       
                    </div>
                    <div class="col-md-4">
                        <div class="row text-center sign-with">
                            <div class="col-md-12">
                                <h3>
                                    Sign in with</h3>
                            </div>
                            <div class="col-md-12">
                                <div class="btn-group btn-group-justified">
                                    <a href="#" class="btn btn-primary">Facebook</a> <a href="#" class="btn btn-danger">
                                        Google</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    
                       
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        
        <!-- /.container -->
    </nav>
<script>
$('#myModal').modal('show');

function validate(){
	
	document.getElementById('userId').value=document.getElementById('id').value;
	document.getElementById('password').value=document.getElementById('pass').value;
	document.getElementById('loginForm').submit();
	
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