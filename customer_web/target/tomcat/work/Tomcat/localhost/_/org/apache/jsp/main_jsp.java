/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-07-12 02:15:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- 页面meta -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <title>MEIKO - CUSTOMER</title>\n");
      out.write("    <meta name=\"description\" content=\"AdminLTE2定制版\">\n");
      out.write("    <meta name=\"keywords\" content=\"AdminLTE2定制版\">\n");
      out.write("\n");
      out.write("    <meta content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\" name=\"viewport\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/ionicons/css/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/iCheck/square/blue.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/morris/morris.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/datepicker/datepicker3.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/datatables/dataTables.bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/treeTable/jquery.treetable.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/treeTable/jquery.treetable.theme.default.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/select2/select2.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/colorpicker/bootstrap-colorpicker.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/bootstrap-markdown/css/bootstrap-markdown.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/adminLTE/css/AdminLTE.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/adminLTE/css/skins/_all-skins.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/ionslider/ion.rangeSlider.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/ionslider/ion.rangeSlider.skinNice.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"./plugins/bootstrap-slider/slider.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- 页面头部 -->\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/header.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("\n");
      out.write("    <!-- 页面头部 /-->\n");
      out.write("\n");
      out.write("    <!-- 导航侧栏 -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/aside.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("\n");
      out.write("    <!-- 导航侧栏 /-->\n");
      out.write("\n");
      out.write("    <!-- 内容区域 -->\n");
      out.write("    <div class=\"content-wrapper\">\n");
      out.write("        <img src=\"./images/center.jpg\" width=\"100%\" height=\"100%\"/>\n");
      out.write("    </div>\n");
      out.write("    <!-- 内容区域 /-->\n");
      out.write("\n");
      out.write("    <!-- 底部导航 -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/footer.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("\n");
      out.write("    <!-- 底部导航 /-->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/jQueryUI/jquery-ui.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("</script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/raphael/raphael-min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/morris/morris.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/knob/jquery.knob.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/daterangepicker/moment.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/daterangepicker/daterangepicker.zh-CN.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/fastclick/fastclick.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/iCheck/icheck.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/adminLTE/js/app.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/treeTable/jquery.treetable.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/select2/select2.full.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/colorpicker/bootstrap-colorpicker.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap-markdown/js/bootstrap-markdown.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap-markdown/js/markdown.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap-markdown/js/to-markdown.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/ckeditor/ckeditor.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/input-mask/jquery.inputmask.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/input-mask/jquery.inputmask.date.extensions.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/input-mask/jquery.inputmask.extensions.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/datatables/dataTables.bootstrap.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/chartjs/Chart.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/flot/jquery.flot.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/flot/jquery.flot.resize.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/flot/jquery.flot.pie.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/flot/jquery.flot.categories.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/ionslider/ion.rangeSlider.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"./plugins/bootstrap-slider/bootstrap-slider.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        // 选择框\n");
      out.write("        $(\".select2\").select2();\n");
      out.write("\n");
      out.write("        // WYSIHTML5编辑器\n");
      out.write("        $(\".textarea\").wysihtml5({\n");
      out.write("            locale: 'zh-CN'\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // 设置激活菜单\n");
      out.write("    function setSidebarActive(tagUri) {\n");
      out.write("        var liObj = $(\"#\" + tagUri);\n");
      out.write("        if (liObj.length > 0) {\n");
      out.write("            liObj.parent().parent().addClass(\"active\");\n");
      out.write("            liObj.addClass(\"active\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        // 激活导航位置\n");
      out.write("        setSidebarActive(\"admin-index\");\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
