package namespaced

class NamespacedController {

	static namespace = 'namespaced'

	def index() {
		render "I'm a namespaced controller!"
	}

}
