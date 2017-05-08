package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Header</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/homestylesheet.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write(".navbar-brand {\n");
      out.write("  padding: 0px;\n");
      out.write("}\n");
      out.write(".navbar-brand>img {\n");
      out.write("  height: 100%;\n");
      out.write("  padding: 15px;\n");
      out.write("  width: auto;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <nav class=\"navbar navbar-default\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar1\">\n");
      out.write("          <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("          <a class=\"navbar-brand\"><img src=\"\" alt=\"Dispute Bills\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"navbar1\" class=\"navbar-collapse collapse\">\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("          <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("          <li><a href=\"#\">About</a></li>\n");
      out.write("          <li><a href=\"#\">Contact</a></li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("              <li><a href=\"#\">Action</a></li>\n");
      out.write("              <li><a href=\"#\">Another action</a></li>\n");
      out.write("              <li><a href=\"#\">Something else here</a></li>\n");
      out.write("              <li class=\"divider\"></li>\n");
      out.write("              <li class=\"dropdown-header\">Nav header</li>\n");
      out.write("              <li><a href=\"#\">Separated link</a></li>\n");
      out.write("              <li><a href=\"#\">One more separated link</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!--/.nav-collapse -->\n");
      out.write("    </div>\n");
      out.write("    <!--/.container-fluid -->\n");
      out.write("  </nav>\n");
      out.write("</div>\n");
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
