
<%-- 
    Document   : index
    Created on : May 4, 2017, 10:53:29 AM
    Author     : Akshay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/homestylesheet.css">
        <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        
        <style>            
        
.navbar-brand {
  height: 100px;
}

.nav >li >a {
  padding-top: 10px;
  padding-bottom: 10px;
}
.navbar-toggle {
  padding: 5px;
  margin: 25px 15px 25px 0;
}        
            #frame1{
                border: 1px solid black; margin-left: 1px; float: left; margin-top: 0px;
            }
            #frame2{
                border: 1px solid black; margin-right: 1px; float:right; margin-top: 0px
            }
            #frame3{
                border: 1px solid black; margin-left: 1px; margin-right: 1px; margin-top: 2px;
            }
            body{
                background-color: #46b8da;    
                }
</style>
    </head>
    <body>
        <div class="container">
            <div class="row" id="siteheader">
<nav class="navbar navbar-inverse navbar-static-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar3">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand"><img src="Images/logo2.png" width="20%" height="100%"  alt="StayHealthy">
        </a>
      </div>
      <div id="navbar3" class="navbar-collapse collapse">
        <ul class="nav navbar-nav navbar-right">
          <li class="active"><a href="#">Home</a></li>
          <li><a target="" href="#">About Us</a></li>
          <li><a target="" href="#">Contact Us</a></li>
          <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Help Desk<span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="#">FAQs</a></li>
              <li><a href="#">Enquiry Desk</a></li>
              <li><a href="#">Doctor's  Help</a></li>
               </ul>
          </li>
                    <li><a target="" href="#">SignUp</a></li>
        </ul>
      </div>
      <!--/.nav-collapse -->
    </div>
    <!--/.container-fluid -->
  </nav>
            </div>
            <div class="row" id="container">
                <IFRAME seamless="seamless" scrolling="no" src="left.jsp" id="frame1" scrollig="no" name="NavigationFrame" width="29%" height="800" > </IFRAME>
            <IFRAME seamless="seamless" src="" id="frame2" name="ContentFrame" width="70%" height="800" ><h1>Content</h1></IFRAME>
            </div>
            
        <footer>
        <div class="container-fluid" style="background-color: black">
    <div class="row">
    <div class="col-lg-12 text-danger text-center text-muted">
    <p class="pull-right">
    <a href="#">Back to top</a></p>
        <p>
        &copy; 2017 &middot; StayHealthy &middot; <a href="privacypolicy.htm">Privacy</a> &middot; <a href="#">Terms</a>
        </p>
    </div>
    </div>
    </div>
    </footer>

        </div>
    </body>
</html>
