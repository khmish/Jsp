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
        <title>Admin</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>

        <%@include file="HeaderPage.jsp" %><%--    ---------------------------------HeaderPage-------- --%>
        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav"><%--    ---------------------------------sidenav-------- --%>
                </div>
                <div class="col-sm-8 text-left"><%--  ********************** code******************--%>
                    
                    

                </div><%--  ********************************************************************************--%>
                <div class="col-sm-2 sidenav"><%--    ---------------------------------AdsPage-------- --%>
                    <%@include file="AdsPage.jsp" %>
                </div>
            </div>
        </div>

        <%@include file="FooterPage.jsp" %><%--    ---------------------------------FooterPage-------- --%>

    </body>
</html>
