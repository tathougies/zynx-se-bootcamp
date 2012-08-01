class UrlMappings {

	static mappings = {

        //"/post/$postId/comments/$id/$action"

		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
