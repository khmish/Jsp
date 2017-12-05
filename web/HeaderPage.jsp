<%-- 
    Document   : HeaderPage
    Created on : Dec 5, 2017, 10:13:37 PM
    Author     : whatup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="newpackage.*" %>
<!DOCTYPE html>
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
                <li><a href="/WebJsp/login.jsp"  style="color:white"> 
                        <% try {
                                UserTable userTable = (UserTable) session.getAttribute("UserInfo");
                                out.print("Welcome <strong>" + userTable.getName() + "</strong>");
                            } catch (Exception e) {

                            }
                        %></a></li>
                <li><a href="/Jsp/login.jsp"  style="color:white"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </div>
</nav>
