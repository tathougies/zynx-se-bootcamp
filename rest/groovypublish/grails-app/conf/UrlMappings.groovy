class UrlMappings {

	static mappings = {

       "/post/$postId/comments/$action"(controller: 'comment')
       // "post/$postId/comments/$comment_id"(controller: 'comments', action:'show')

		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
