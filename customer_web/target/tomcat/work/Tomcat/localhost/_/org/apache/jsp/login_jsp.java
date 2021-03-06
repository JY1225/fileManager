/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-07-12 02:15:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <title>MEIKO - CUSTOMER | Log in</title>\n");
      out.write("\n");
      out.write("    <meta\n");
      out.write("            content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"\n");
      out.write("            name=\"viewport\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/ionicons/css/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/adminLTE/css/AdminLTE.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/iCheck/square/blue.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"hold-transition login-page\">\n");
      out.write("<div class=\"login-box\">\n");
      out.write("    <div class=\"login-logo\">\n");
      out.write("        <a href=\"all-admin-index.html\"><b>MEIKO</b>客户管理系统</a>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.login-logo -->\n");
      out.write("    <div class=\"login-box-body\">\n");
      out.write("        <p class=\"login-box-msg\">登录系统</p>\n");
      out.write("\n");
      out.write("        <form action=\"./login\" method=\"post\">\n");
      out.write("            <div class=\"form-group has-feedback\">\n");
      out.write("                <input type=\"text\" name=\"username\" class=\"form-control\"\n");
      out.write("                       placeholder=\"用户名\"> <span\n");
      out.write("                    class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group has-feedback\">\n");
      out.write("                <input type=\"password\" name=\"password\" class=\"form-control\"\n");
      out.write("                       placeholder=\"密码\"> <span\n");
      out.write("                    class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-8\">\n");
      out.write("                    <div class=\"checkbox icheck\">\n");
      out.write("                        <label><input type=\"checkbox\"> 记住 下次自动登录</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col -->\n");
      out.write("                <div class=\"col-xs-4\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">登录</button>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col -->\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("       <!--  <a href=\"#\">忘记密码</a><br> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.login-box-body -->\n");
      out.write("</div>\n");
      out.write("<!-- /.login-box -->\n");
      out.write("\n");
      out.write("<!-- jQuery 2.2.3 -->\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<!-- iCheck -->\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/iCheck/icheck.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(function() {\n");
      out.write("        $('input').iCheck({\n");
      out.write("            checkboxClass : 'icheckbox_square-blue',\n");
      out.write("            radioClass : 'iradio_square-blue',\n");
      out.write("            increaseArea : '20%' // optional\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
