<%-- 
    Document   : infoUser
    Created on : Nov 10, 2017, 11:10:49 PM
    Author     : whatup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="newpackage.*" %>
<!DOCTYPE html>
﻿<html lang="en">
<head>
  <title>Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
</head>
<body>

<nav class="nav navbar-default" style="background-color:#0099FF"  >
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" style="color:white" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li ><a href="#"  style="color:white">Home</a></li>
        <li><a href="#"  style="color:white">About</a></li>
        <li><a href="#"  style="color:white">Projects</a></li>
        <li><a href="#"  style="color:white">Contact</a></li>
        
      </ul>
      <ul class="nav navbar-nav navbar-right">
         <li><a href="/WebJsp/login.jsp"  style="color:white"> <% try{
            UserTable userTable= (UserTable)session.getAttribute("UserInfo");
            out.print("Welcome "+userTable.getName());
         }
         catch(Exception e)
         {
             
         }
         %></a></li>
        <li><a href="/Jsp/login.jsp"  style="color:white"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
          </div>
    <div class="col-sm-8 text-left"> 
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
        <p>    welcome        </p>
    </div>
    <div class="col-sm-2 sidenav">
      <div class="well">
        <p>ADS</p>
      </div>
      <div class="well">
        <p>ADS</p>
      </div>
        <div class="well">
        <p>ADS</p>
      </div>
    </div>
  </div>
</div>

<div class="container-fluid" style="background-color:#0099FF">
  <div class="container"  style="color:white">
  <h3 >Footer Text</h3>
  </div>
</div>

</body>
</html>
