class UrlMappings {

	static mappings = {
		"/icecreams"(resources: "icecream")
		"/icecreams/search(.$format)?"(controller: "icecream", action: "search")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
