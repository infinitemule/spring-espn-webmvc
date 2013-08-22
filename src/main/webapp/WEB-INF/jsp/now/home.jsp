<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="app"  tagdir="/WEB-INF/tags/app"  %>
<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"  %>
<app:view>
  <app:head title="ESPN Now">
    <style>
      .feed {
        border-top: 1px solid #ddd;
        padding: 10px 0;  
      }    
      .feed a {
        text-decoration: none;
        font-size: 24px;
        font-weight: bold;
        color: #000;
      }
    </style>
  </app:head>   
  <app:content>
    <h1>ESPN Now</h1>
    <div>
      <c:forEach var="feed" items="${feeds}">
    
      <div class="feed">        
        <a target="_blank" href="${feed.webLink}">${feed.title}</a>
        <p><fmt:formatDate value="${feed.published}" pattern="h:mm a - dd MMM"/></p>
        <p style="font-size: 18px;">${feed.description}</p>        
      </div>
      
      </c:forEach>
      
    </div>
  </app:content>      
</app:view>
