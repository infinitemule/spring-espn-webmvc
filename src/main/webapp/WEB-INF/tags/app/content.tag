<%@ taglib prefix="app"  tagdir="/WEB-INF/tags/app"  %>
<body>
  <div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Spring ESPN</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li class="active"><a href="#">ESPN Now</a></li>
          <li><a href="#about">Headlines</a></li>
          <li><a href="#contact">Athletes</a></li>
          <li><a href="#contact">Teams</a></li>
        </ul>
      </div><!--/.nav-collapse -->
    </div>
  </div>
  <div class="container">
    <div>    
      <jsp:doBody/>
    </div>
  </div>
  <script src="js/jquery-2.0.3.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>