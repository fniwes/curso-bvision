package gormtest

class DemoService {
	def modificar(idAlumno) {
		def alumno = Alumno.get(idAlumno)
		alumno.nombre = "Jose ${new Date()}"

		throw new RuntimeException("Algo salio horriblemente mal")
	}
}