package namespaced

class UrlMappings {

    static mappings = {

				"/namespaced" (controller: 'namespaced', action: 'index', namespace: 'namespaced')

				"/namespaced-should-not-work-but-works" (controller: 'namespaced', action: 'index')

				"/namespaced-should-not-work" (controller: 'namespaced', action: 'index', namespace: 'unknown')

				"/ordinary" (controller: 'ordinary', action: 'index')

				"/ordinary-should-not-work" (controller: 'ordinary', action: 'index', namespace: 'unknown')

			"/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
