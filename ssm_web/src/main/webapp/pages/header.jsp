<%@ page import="org.springframework.security.core.userdetails.UserDetails" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<%
    String username = "null";
    try {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        username = userDetails.getUsername();
    } catch (Exception e) {

    }
%>

<!-- page header -->
<header class="main-header">
    <!-- Logo -->
    <a href="all-admin-index.html" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>Cash</b></span> <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>Cash 2.0 </b> System</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas"
           role="button"> <span class="sr-only">Toggle navigation</span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">

                <li class="dropdown user user-menu"><a href="#"
                                                       class="dropdown-toggle" data-toggle="dropdown"> <img
                        src="${pageContext.request.contextPath}/img/user1.jpg"
                        class="user-image" alt="User Image"> <span class="hidden-xs">
							<%=username%>
					</span>

                </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header"><img
                                src="${pageContext.request.contextPath}/img/user1.jpg"
                                class="img-circle" alt="User Image"></li>

                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="#" class="btn btn-default btn-flat">Reset password</a>
                            </div>
                            <div class="pull-right">
                                <a href="${pageContext.request.contextPath}/logout.do"
                                   class="btn btn-default btn-flat">Login out</a>
                            </div>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>
</header>
<!-- page header /-->