<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 38279
  Date: 2019/3/14
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<aside class="main-sidebar">
    <section class="sidebar">
        <div class="user-panel">
            <div class="pull-left image">
                <img src="./img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><security:authentication property="principal.username"></security:authentication></p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>

        <ul class="sidebar-menu">
            <li class="header">菜单</li>
            <li id="admin-index">
                <a href="./pages/index.jsp">
                    <i class="fa fa-dashboard"></i> <span>首页</span>
                </a>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-cogs"></i>
                    <span>系统管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li>
                        <a href="${pageContext.request.contextPath}/user/findAll">
                            <i class="fa fa-circle-o"></i> 用户管理
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/role/findAll">
                            <i class="fa fa-circle-o"></i> 角色管理
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/permission/findAll">
                            <i class="fa fa-circle-o"></i> 资源权限管理
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/syslog/findAll">
                            <i class="fa fa-circle-o"></i> 访问日志
                        </a>
                    </li>
                </ul>
            </li>
            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>基础数据</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">
                    <li>
                        <a href="${pageContext.request.contextPath}/file/findAll">
                            <i class="fa fa-circle-o"></i> 文件管理
                        </a>
                    </li>
                    <%-- <li>
                        <a href="${pageContext.request.contextPath}/orders/findAll?page=1&pageSize=3">
                            <i class="fa fa-circle-o"></i> xxxx
                        </a>
                    </li> --%>
                </ul>
            </li>

        </ul>
    </section>
</aside>
