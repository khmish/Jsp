package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import newpackage.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>log in</title>\n");
      out.write("        ");

            try{
            String user=request.getParameter("userName");
            String pass=request.getParameter("pwsd");
            
            if((user.length()>0 ) &&(pass.length()>0 ))
            {
                DBfunctions db= new DBfunctions();
                UserTable table= new UserTable(user, pass,"","");
                
                if(db.login(table))
                {
                    session.setAttribute("UserInfo",db.getUserTable(table));
                    response.sendRedirect("infoUser.jsp");
                }
            }
            }catch(Exception e){
                
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">Log in</div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form class=\"form-horizontal\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"user\">User Name:</label>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input class=\"form-control\" id=\"user\" placeholder=\"Enter user\" name=\"userName\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"pwd\">Password:</label>\n");
      out.write("                            <div class=\"col-sm-6\">          \n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"pwsd\" placeholder=\"Enter password\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">        \n");
      out.write("                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                <div class=\"checkbox\">\n");
      out.write("                                    <label><input type=\"checkbox\"/> Remember me</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">        \n");
      out.write("                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-info\" onclick=\"\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
