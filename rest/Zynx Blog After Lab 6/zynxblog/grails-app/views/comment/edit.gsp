<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<title>Create Comment</title>
  </head>
<body>
<h1>Create a comment</h1>
  <div id="validationerrors">
      <g:renderErrors bean="${comment}"/>
<g:renderErrors bean="${comment.who}"/>
</div>
  <g:form controller="comment" action="save">
      <g:hiddenField name="postId" value="${postId}"/>
<dl>
<dt>Your name:</dt>
          <dd>
          <g:textField name="who.name" value="${comment.who.name}"/>
</dd>
          <dt>Your email:</dt>
<dd>
<g:textField name="who.email" value="${comment.who.email}"/>
</dd>
          <dt>Your website/blog:</dt>
          <dd>
          <g:textField name="who.url" value="${comment.who.url}"/>
</dd>
          <dt>Add your comment:</dt>
<dd>
<g:textArea name="comment" value="${comment.comment}" rows="20" cols="50"/>
</dd>
      </dl>
<g:submitButton name="submit" value="Save"/>
</g:form>
  </body>
</html>
