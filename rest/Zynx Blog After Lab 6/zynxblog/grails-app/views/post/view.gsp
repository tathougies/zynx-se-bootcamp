<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<title>${post.title}</title>
</head>
<body>
<h1>${post.title}</h1>
<p>${post.teaser}</p>
<div>${post.content}</div>

<g:link controller="comment" action="edit" params="[postId:post.id]"> Comment on this article </g:link>

<g:each in="${post.comments}" var="comment">
<div class="comment">
<p>${comment.comment}</p>
<p>Made by: ${comment.who.name} on ${comment.dateCreated}</p>
</div>
</g:each>

</body>
</html>
