package gormtest

class MyTagLib {
	static namespace = "bvision"

	def mostrarAlumnos =  { attrs, body ->
		out << render(template: "listado", model: [alumnos: Alumno.list()])
	}
}