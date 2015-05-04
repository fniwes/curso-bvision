package gormtest

class DemoController {
    def demoService

    def index() {
    }

    def add() {
    	def alumno = new Alumno()
    	alumno.nombre = "Fernando ${new Date()}"
    	alumno.save()
    }

    def edit(int id) {
    	def alumno = Alumno.get(id)
    	alumno.nombre = "Sebastian ${new Date()}"
        def pepe = Alumno.where { nombre: 'Fernando' }
    }

    def editService(int id) {
        demoService.modificar(id)
    }
}
