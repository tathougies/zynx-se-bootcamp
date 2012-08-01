<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<title>Create Tag</title>
  </head>
<body>
<h1>Create a tag</h1>
  <div id="validationerrors">
      <g:renderErrors bean="${tag}"/>
</div>
  <g:form controller="tag" action="save">
      <g:hiddenField name="postId" value="${postId}"/>
<dl>
          <dt>Add your tag:</dt>
<dd>
<g:textArea name="tag" value="${tag.tag}" rows="20" cols="50"/>
</dd>
      </dl>
<g:submitButton name="submit" value="Save"/>
</g:form>
  </body>
</html>
