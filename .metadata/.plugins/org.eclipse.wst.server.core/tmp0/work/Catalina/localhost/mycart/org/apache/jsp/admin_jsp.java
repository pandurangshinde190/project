/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2022-05-05 10:23:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.learn.entities.Category;
import java.util.List;
import com.learn.helper.FactoryProvider;
import com.learn.dao.CategoryDao;
import com.learn.entities.User;
import com.learn.entities.User;
import org.apache.jasper.tagplugins.jstl.core.Out;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/components/common_css_js.jsp", Long.valueOf(1651740149898L));
    _jspx_dependants.put("/components/message.jsp", Long.valueOf(1649008584366L));
    _jspx_dependants.put("/components/navbar.jsp", Long.valueOf(1651738473087L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.learn.helper.FactoryProvider");
    _jspx_imports_classes.add("com.learn.entities.Category");
    _jspx_imports_classes.add("com.learn.dao.CategoryDao");
    _jspx_imports_classes.add("com.learn.entities.User");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

User user = (User) session.getAttribute("current-user");
if (user == null) {
	session.setAttribute("message", "You are not logged in!!");
	response.sendRedirect("login.jsp");
	return;
} else {
	if (user.getUserType().equals("normal")) {
		session.setAttribute("message", "You are not admin ! Do not access this page");
		response.sendRedirect("login.jsp");
		return;
	}
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Admin Panel</title>\n");
      out.write("<!-- Css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("<!-- JavaScript -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\" integrity=\"sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<script src=\"js/script.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      out.write('\n');

User user1 = (User) session.getAttribute("current-user");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark custom-bg\">\n");
      out.write("\n");
      out.write("	<div class=\"container\">\n");
      out.write("\n");
      out.write("		<a class=\"navbar-brand\" href=\"index.jsp\">MyCart</a>\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("			data-target=\"#navbarSupportedContent\"\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("			aria-label=\"Toggle navigation\">\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("		</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("					href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span>\n");
      out.write("				</a></li>\n");
      out.write("				<li class=\"nav-item dropdown\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> categories </a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">Action</a> <a\n");
      out.write("							class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("						<div class=\"dropdown-divider\"></div>\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("					</div></li>\n");
      out.write("			</ul>\n");
      out.write("			<ul class=\"navbar-nav ml-auto\">\n");
      out.write("			\n");
      out.write("				<li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#!\" data-toggle=\"modal\" data-target=\"#cart\">  <i class=\"fa fa-cart-plus\"  style=\"font-size: 20px;\"></i> <span class=\"ml-0 cart-items\">( 0 )</span>  </a>\n");
      out.write("                </li>\n");
      out.write("			\n");
      out.write("			\n");
      out.write("				<!--Conditional Rendering  -->\n");
      out.write("				");

				if (user1 == null) {
				
      out.write("\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("					href=\"login.jsp\">Login</a></li>\n");
      out.write("\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("					href=\"register.jsp\">Register</a></li>\n");
      out.write("\n");
      out.write("				");

				} else {
				
      out.write("\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#!\">");
      out.print(user1.getUserName());
      out.write("</a></li>\n");
      out.write("\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\" href=\"LogoutServlet\">Logout</a></li>\n");
      out.write("				");

				}
				
      out.write("\n");
      out.write("\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</nav>");
      out.write("\n");
      out.write("	<div class=\"container admin\">\n");
      out.write("		<div class=contaiiner-fluid mt-3>\n");
      out.write("			");
      out.write('\n');

String message = (String) session.getAttribute("message");
if (message != null) {
	//prints
	//out.println(message);

      out.write("\n");
      out.write("<div class=\"alert alert-success alert-dismissible fade show\"\n");
      out.write("	role=\"alert\">\n");
      out.write("	<strong>");
      out.print( message );
      out.write("</strong> \n");
      out.write("	<button type=\"button\" class=\"close\" data-dismiss=\"alert\"\n");
      out.write("		aria-label=\"Close\">\n");
      out.write("		<span aria-hidden=\"true\">&times;</span>\n");
      out.write("	</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");

session.removeAttribute("message");
}

      out.write("\n");
      out.write("		</div>\n");
      out.write("		<div class=\"row mt-3\">\n");
      out.write("			<!-- First col -->\n");
      out.write("			<div class=\"col-md-4\">\n");
      out.write("				<!-- first box -->\n");
      out.write("				<div class=\"card\">\n");
      out.write("					<div class=\"card-body text-center\">\n");
      out.write("						<div class=\"container\">\n");
      out.write("							<img style=\"max-width: 125px\" class=\"img-fluid rounded-circle\"\n");
      out.write("								alt=\"user_icon\" src=\"img/seo-and-web.png\">\n");
      out.write("						</div>\n");
      out.write("						<h1>23443</h1>\n");
      out.write("						<h1 class=\"text-uppercase text-muted\">User</h1>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<!-- Second col -->\n");
      out.write("			<div class=\"col-md-4\">\n");
      out.write("				<!-- second box -->\n");
      out.write("				<div class=\"card\">\n");
      out.write("					<div class=\"card-body text-center\">\n");
      out.write("						<div class=\"container\">\n");
      out.write("							<img style=\"max-width: 125px\" class=\"img-fluid rounded-circle\"\n");
      out.write("								alt=\"categories_icon\" src=\"img/list.png\">\n");
      out.write("						</div>\n");
      out.write("						<h1>23953</h1>\n");
      out.write("						<h1 class=\"text-uppercase text-muted\">Categories</h1>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<!-- Third col -->\n");
      out.write("			<div class=\"col-md-4\">\n");
      out.write("				<!-- third box -->\n");
      out.write("				<div class=\"card\">\n");
      out.write("					<div class=\"card-body text-center\">\n");
      out.write("						<div class=\"container\">\n");
      out.write("							<img style=\"max-width: 125px\" class=\"img-fluid rounded-circle\"\n");
      out.write("								alt=\"product\" src=\"img/product.png\">\n");
      out.write("						</div>\n");
      out.write("						<h1>53435</h1>\n");
      out.write("						<h1 class=\"text-uppercase text-muted\">Products</h1>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<!-- Second row -->\n");
      out.write("		<div class=\"row mt-3\">\n");
      out.write("			<div class=\"col-md-6\">\n");
      out.write("				<!--Second row: first box -->\n");
      out.write("				<div class=\"card\" data-toggle=\"modal\" data-target=\"#add-category-modal\">\n");
      out.write("					<div class=\"card-body text-center\">\n");
      out.write("						<div class=\"container\">\n");
      out.write("							<img style=\"max-width: 125px\" class=\"img-fluid rounded-circle\"\n");
      out.write("								alt=\"product\" src=\"img/keys.png\">\n");
      out.write("						</div>\n");
      out.write("						<p class=\"mt-2\">Click here to add new Category</p>\n");
      out.write("						<h1 class=\"text-uppercase text-muted\">Add Category</h1>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-md-6\">\n");
      out.write("				<!--Second row: second box -->\n");
      out.write("				<div class=\"card\" data-toggle=\"modal\" data-target=\"#add-product-modal\">\n");
      out.write("					<div class=\"card-body text-center\">\n");
      out.write("						<div class=\"container\">\n");
      out.write("							<img style=\"max-width: 125px\" class=\"img-fluid rounded-circle\"\n");
      out.write("								alt=\"product\" src=\"img/plus.png\">\n");
      out.write("						</div>\n");
      out.write("						<p class=\"mt-2\">Click here to add new Product</p>\n");
      out.write("						<h1 class=\"text-uppercase text-muted\">Add Products</h1>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<!--add category modal-->\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"add-category-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header custom-bg text-white\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Fill category details</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <form action=\"ProductOperationServlet\" method=\"POST\">\n");
      out.write("        <input type=\"hidden\" name=\"operation\" value=\"addCategory\">\n");
      out.write("        	<div class=\"form-group\">\n");
      out.write("        	<input type=\"text\" class=\"form-control\" name=\"catTitle\" placeholder=\"Enter Category Title\" required/>\n");
      out.write("        	</div>\n");
      out.write("        	<div class=\"form-group\">\n");
      out.write("              <textarea style=\"height: 300px;\" class=\"form-control\" placeholder=\"Enter category description\" name=\"catDescription\" required></textarea>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"cotnainer text-center\">\n");
      out.write("        		<button class=\"btn btn-outline-success\">Add Category</button>\n");
      out.write("          		<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("           </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("	<!--End add category modal-->\n");
      out.write("	\n");
      out.write("		<!--+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++-->\n");
      out.write("       <!--product modal-->\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"add-product-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header custom-bg text-white\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Product details</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <!--form-->\n");
      out.write("                        <form action=\"ProductOperationServlet\" method=\"POST\" enctype=\"multipart/form-data\"> \n");
      out.write("                        <input type=\"hidden\" name=\"operation\" value=\"addProduct\">            \n");
      out.write("                            <!--product title-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Enter title of product\" name=\"pName\" required />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--product description-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea style=\"height: 150px;\" class=\"form-control\" placeholder=\"Enter product description\" name=\"pDesc\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--product price-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"number\" class=\"form-control\" placeholder=\"Enter price of product\" name=\"pPrice\" required />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--product discount-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"number\" class=\"form-control\" placeholder=\"Enter product discount\" name=\"pDiscount\" required />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--product quantity-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"number\" class=\"form-control\" placeholder=\"Enter product Quantity\" name=\"pQuantity\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <!--product category-->\n");
      out.write("                            ");
 CategoryDao cdao=new CategoryDao(FactoryProvider.getFactory());
                            	List<Category> list=cdao.getCategories();
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("							<div class=\"form-group\">\n");
      out.write("                               <select name=\"catId\" class=\"form-control\" id=\"\">\n");
      out.write("                               		");
 for (Category c : list) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( c.getCategoryId());
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print( c.getCategoryTitle());
      out.write(" </option>\n");
      out.write("                                    ");
}
                                    
      out.write("\n");
      out.write("                               </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--product file-->\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"pPic\">Select Picture of product</label>  \n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"file\" id=\"pPic\" name=\"pPic\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <!--submit button-->\n");
      out.write("                            <div class=\"container text-center\">\n");
      out.write("                                <button class=\"btn btn-outline-success\">Add product</button>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <!--end form-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--End product modal-->\n");
      out.write("\n");
      out.write("</body>\n");
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
