class Estudiante(Usuario):
    def __init__(self, nombre, ID, carnet, tipo, carrera):
        super().__init__(nombre, ID, carnet)
        self.carrera = carrera

    @staticmethod
    def mostrar():
        # operaciones del método mostrar
        pass
