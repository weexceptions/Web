package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/homestylesheet.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>            \n");
      out.write("        \n");
      out.write(".navbar-brand {\n");
      out.write("  height: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav >li >a {\n");
      out.write("  padding-top: 10px;\n");
      out.write("  padding-bottom: 10px;\n");
      out.write("}\n");
      out.write(".navbar-toggle {\n");
      out.write("  padding: 5px;\n");
      out.write("  margin: 25px 15px 25px 0;\n");
      out.write("}        \n");
      out.write("            #frame1{\n");
      out.write("                border: 1px solid black; margin-left: 1px; float: left; margin-top: 0px;\n");
      out.write("            }\n");
      out.write("            #frame2{\n");
      out.write("                border: 1px solid black; margin-right: 1px; float:right; margin-top: 0px\n");
      out.write("            }\n");
      out.write("            #frame3{\n");
      out.write("                border: 1px solid black; margin-left: 1px; margin-right: 1px; margin-top: 2px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" id=\"siteheader\">\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar3\">\n");
      out.write("          <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("        <a class=\"navbar-brand\"><img src=\"Images/logo2.png\" width=\"20%\" height=\"120\"  alt=\"StayHealthy\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"navbar3\" class=\"navbar-collapse collapse\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("          <li><a target=\"\" href=\"#\">About Us</a></li>\n");
      out.write("          <li><a target=\"\" href=\"#\">Contact Us</a></li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Help Desk<span class=\"caret\"></span></a>\n");
      out.write("            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("              <li><a href=\"#\">FAQs</a></li>\n");
      out.write("              <li><a href=\"#\">Enquiry Desk</a></li>\n");
      out.write("              <li><a href=\"#\">Doctor's  Help</a></li>\n");
      out.write("               </ul>\n");
      out.write("          </li>\n");
      out.write("                    <li><a target=\"\" href=\"#\">SignUp</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!--/.nav-collapse -->\n");
      out.write("    </div>\n");
      out.write("    <!--/.container-fluid -->\n");
      out.write("  </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" id=\"container\">\n");
      out.write("            <IFRAME src=\"\" id=\"frame1\" name=\"NavigationFrame\" width=\"29%\" height=\"800\" > </IFRAME>\n");
      out.write("            <IFRAME src=\"\" id=\"frame2\" name=\"ContentFrame\" width=\"70%\" height=\"800\" ><h1>Content</h1></IFRAME>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" id=\"footer\">\n");
      out.write("            <IFRAME src=\"\" id=\"frame3\" name=\"FooterFrame\" width=\"100%\" height=\"50\"><h1>Footer</h1></IFRAME>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            \n");
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
