<%@attribute name="title" required="true" %>
<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core" %> 
<head>
  <title>Spring ESPN - ${title}</title>
    
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
  <link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">
    
  <style>
    body {
      padding-top: 50px;
    }
    .content {
      padding: 40px 15px;
      text-align: center;
    }    
  </style>
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--
    [if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]
    -->  
  <jsp:doBody/>
</head>
