package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import newpackage.*;

public final class infoUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("﻿<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"nav navbar-default\" style=\"background-color:#0099FF\"  >\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" style=\"color:white\" href=\"#\">Logo</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li ><a href=\"#\"  style=\"color:white\">Home</a></li>\n");
      out.write("        <li><a href=\"#\"  style=\"color:white\">About</a></li>\n");
      out.write("        <li><a href=\"#\"  style=\"color:white\">Projects</a></li>\n");
      out.write("        <li><a href=\"#\"  style=\"color:white\">Contact</a></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("         <li><a href=\"/WebJsp/login.jsp\"  style=\"color:white\"> ");
 try{
            UserTable userTable= (UserTable)session.getAttribute("UserInfo");
            out.print("Welcome "+userTable.getName());
         }
         catch(Exception e)
         {
             
         }
         
      out.write("</a></li>\n");
      out.write("        <li><a href=\"/Jsp/login.jsp\"  style=\"color:white\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \n");
      out.write("<div class=\"container-fluid text-center\">    \n");
      out.write("  <div class=\"row content\">\n");
      out.write("    <div class=\"col-sm-2 sidenav\">\n");
      out.write("          </div>\n");
      out.write("    <div class=\"col-sm-8 text-left\"> \n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("        <p>    welcome        </p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2 sidenav\">\n");
      out.write("      <div class=\"well\">\n");
      out.write("        <p>ADS</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"well\">\n");
      out.write("        <p>ADS</p>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"well\">\n");
      out.write("        <p>ADS</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\" style=\"background-color:#0099FF\">\n");
      out.write("  <div class=\"container\"  style=\"color:white\">\n");
      out.write("  <h3 >Footer Text</h3>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
