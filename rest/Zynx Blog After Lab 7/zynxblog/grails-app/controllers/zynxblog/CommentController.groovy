package zynxblog

class CommentController {
    def edit = {
        render(view:'edit',
                model:[ comment:new Comment(),
                        postId:params.postId])
    }
    def save = {
        def comment = new Comment(params)
        comment.dateCreated = new Date();
        comment.post = Post.get(params.postId)
        if(comment.save()) {
            redirect(
                    controller:'post',
                    action:'view',
                    id:params.postId)
        } else {
            render(view:'edit',
                    model:[comment:comment,
                            postId:params.postId])
        }
    }
}

