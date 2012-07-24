package groovypublish

class TagController {
    def edit = {
        render(view:'edit',
                model:[
                        tag:new Tag(),
                        postId:params.postId])
    }
    def save = {
        def tag = new Tag(params)
        def post = Post.get(params.postId)
        post.tags.add(tag)
        if(post.save() && tag.save()) {
            redirect(
                    controller:'post',
                    action:'view',
                    id:params.postId)
        } else {
            render(view:'edit',
                    model:[tag:tag,
                            postId:params.postId])
        }
    }
}
