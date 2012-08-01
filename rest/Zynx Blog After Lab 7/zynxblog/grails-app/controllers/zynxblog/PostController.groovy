package zynxblog

class PostController {

    static defaultAction = 'list'

    def list = {
        [posts:Post.list(sort:'lastUpdated',
                order:'desc')]
/*        render(
                view:'list',
                model:[posts:Post.list(
                        sort:'lastUpdated',
                        order:'desc')])*/
    }
    def edit = {
        def post = Post.get(params.id)
        if(!post) {
            post = new Post()
        }
        [post:post]
    }

    def view = {
        [post:Post.get(params.id)]
    }
    def save = {
        def post = loadPost(params.id)
        post.properties = params
        if(post.save()) {
            redirect(action:'list')
        } else {
            render(view:'edit', model:[post:post])
        }
    }

    private loadPost(id) {
        def post = new Post();
        if(id) {
            post = Post.get(id)
        }
        return post
    }

}
