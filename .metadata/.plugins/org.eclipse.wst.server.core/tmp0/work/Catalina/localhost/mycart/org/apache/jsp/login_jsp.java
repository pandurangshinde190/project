/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2022-01-24 05:58:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.tagplugins.jstl.core.Out;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/components/common_css_js.jsp", Long.valueOf(1640660129915L));
    _jspx_dependants.put("/components/message.jsp", Long.valueOf(1642992085887L));
    _jspx_dependants.put("/components/navbar.jsp", Long.valueOf(1640663700542L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.jasper.tagplugins.jstl.core.Out");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>User Login ->MyCart</title>\r\n");
      out.write("<!-- Css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- JavaScript -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("<script src=\"js/script.js\"></script>\r\n");
      out.write("-->");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark custom-bg\">\r\n");
      out.write("	\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("	\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"index.jsp\">MyCart</a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarSupportedContent\"\r\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.jsp\">Home\r\n");
      out.write("						<span class=\"sr-only\">(current)</span>\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> categories </a>\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">Action</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("					href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("					href=\"register.jsp\">Register</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("				<div class=\"card mt-3\">\r\n");
      out.write("				\r\n");
      out.write("					<div class=\"card-header custom-bg text-white\">\r\n");
      out.write("						<h1>Login here</h1>\r\n");
      out.write("					</div>\r\n");
      out.write("					");
      out.write('\r');
      out.write('\n');

String message = (String) session.getAttribute("message");
if (message != null) {
	//prints
	//out.println(message);

      out.write("\r\n");
      out.write("<div class=\"alert alert-success alert-dismissible fade show\"\r\n");
      out.write("	role=\"alert\">\r\n");
      out.write("	<strong>");
      out.print( message );
      out.write("</strong> \r\n");
      out.write("	<button type=\"button\" class=\"close\" data-dismiss=\"alert\"\r\n");
      out.write("		aria-label=\"Close\">\r\n");
      out.write("		<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("	</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");

session.removeAttribute("message");
}

      out.write("\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<form action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\">Email address</label> <input name=\"email\"\r\n");
      out.write("									type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\"\r\n");
      out.write("									aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\r\n");
      out.write("								<small id=\"emailHelp\" class=\"form-text text-muted\">We'll\r\n");
      out.write("									never share your email with anyone else.</small>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputPassword1\">Password</label> <input name=\"password\"\r\n");
      out.write("									type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\"\r\n");
      out.write("									placeholder=\"Password\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<a href=\"register.jsp\"class=\"text-center d-block mb-2\">If not registereds click here..</a>\r\n");
      out.write("							<div class=\"container text-center\">\r\n");
      out.write("								<button type=\"submit\" class=\"btn btn-primary border-0 custom-bg\">Submit</button>\r\n");
      out.write("								<button type=\"reset\" class=\"btn btn-primary border-0 custom-bg\">Reset</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
