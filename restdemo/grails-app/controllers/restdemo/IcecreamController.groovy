package restdemo
import grails.rest.RestfulController
import grails.converters.JSON

class IcecreamController extends RestfulController {
	public IcecreamController() {
		super(Icecream)
	}

	def search() {
		def icecreams = Icecream.findAllByFlavorLike(params.query + "%")
		println "============"
		println icecreams
		println "============"
		respond icecreams
	}
}
