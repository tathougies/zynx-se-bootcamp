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

            <g:link controller="tag" action="edit" params="[postId:post.id]"> Tag this article </g:link>

        <g:each var="comment" in="${post.comments}">
            <div class="comment">
                <p>${comment.comment}</p>
                <p>Made by: ${comment.who.name} on ${comment.dateCreated}</p>
            </div>
        </g:each>

        <g:each var="tag" in="${post.tags}">
            <div class="tag">
                <p>${tag.tag}</p>
            </div>
        </g:each>
    </body>
</html>