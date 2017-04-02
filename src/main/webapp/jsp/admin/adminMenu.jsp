
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"><meta name="author" content="">
 
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <title>Movie Mannia</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">

    
</head>
<body>  <div class="brand">Movie Mannia</div>
    <div class="address-bar"> <br>Book Movie  Anytime ! Anywhere ! </br></div>

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
            
                <a class="navbar-brand" href="index.html">Movie Mannia</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="welcome.jsp">Home</a>
                    </li>
                    <li> <br></br>
                    <div class="dropdown" style="position:relative">
                   
                        <a href="#" data-toggle="dropdown">Manage Utilities  <span class="caret"></span></a>
                      
  
  <ul class="dropdown-menu">
    <li><a href="<s:url action="manageUser"/>">User</a></li>
    <li><a href="#">Movies</a></li>
    <li><a href="<s:url action="manageCity"/>">Cities</a></li>
     <li><a href="#">Theater</a></li>
    <li><a href="#">Offer</a></li>
  </ul>
</div>
                        
                    </li>
                    <li>
                        <a href="#">Generate Report</a>
                    </li>
                    
                   
                     <li>
                       
   <button class="btn btn-secondary" data-toggle="modal" data-target="#">
    Logout</button>
   
                    </li>
                </ul>
            </div>
           </div>
            <!-- /.navbar-collapse -->
       </nav>
         <div class="container"></div>
         </body>
        