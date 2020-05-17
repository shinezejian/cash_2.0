<%@ page import="org.springframework.security.core.userdetails.UserDetails" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%
    //obtain user information
    UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
            .getAuthentication()
            .getPrincipal();
    String username = userDetails.getUsername();

%>

<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user1.jpg"
                     class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><%=username%>
                </p>
                <a href="${pageContext.request.contextPath}/user/findByUserName.do?username=<%=username%>"><i
                        class="fa fa-circle text-success"></i> online</a>
            </div>
        </div>

        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">Menu</li>
            <li id="admin-index"><a
                    href="${pageContext.request.contextPath}/pages/main.jsp"><i
                    class="fa fa-list-alt"></i> <span>Home</span></a></li>

            <!--Cash Manager -->
            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>Cash</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/product/findAll.do?page=1&size=4">
                        <i class="fa fa-circle-o"></i> Address
                    </a></li>

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> Customer
                    </a></li>

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> Article
                    </a></li>

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4"> <i
                            class="fa fa-circle-o"></i> Close
                    </a></li>

                </ul>
            </li>
            <!--Cash Manager -->

            <!--System Manager -->
            <li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
                <span>System Manager</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>


            </a>
                <ul class="treeview-menu">
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/user/findAll.do"> <i
                            class="fa fa-circle-o"></i> User manager
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/role/findAll.do"> <i
                            class="fa fa-circle-o"></i> Role manager
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/permission/findAll.do">
                        <i class="fa fa-circle-o"></i> Access control
                    </a></li>
                    <%--					<security:authorize access="hasAuthority('ROLE_SUPER')">--%>
                    <%--					<li id="system-setting"><a--%>
                    <%--						href="${pageContext.request.contextPath}/sysLog/findAllInPages.do?page=1&size=10"> <i--%>
                    <%--							class="fa fa-circle-o"></i> Access logs--%>
                    <%--					</a>--%>
                    <%--					</li>--%>
                    <%--					</security:authorize>--%>
                </ul>
            </li>
            <!--System Manager -->
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>