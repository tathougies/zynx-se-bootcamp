package zynxblog

class TagController {
    def edit = {
        render(view:'edit',
                model:[ tag:new Tag(),
                        postId:params.postId])
    }
    def save = {
        def post = Post.get(params.postId)
        def tag = new Tag(params)
        post.tags.add(tag)
        if(post.save() && tag.save()) {
            redirect(
                    controller:'post',
                    action:'view',
                    id:params.postId)
        } else {
            render(view:'edit',
                    model:[tag: tag,
                            postId:params.postId])
        }
    }
}