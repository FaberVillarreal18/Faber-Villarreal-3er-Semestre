class Funcionario(Usuario):
    def __init__(self, nombre, ID, carnet):
        super().__init__(nombre, ID, carnet)

    @staticmethod
    def reservar():
        # operación del método
        pass

    @staticmethod
    def eliminar_reserva():
        # operación del método
        pass