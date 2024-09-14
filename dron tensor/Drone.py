import numpy as np
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d.art3d import Poly3DCollection

# Definir las dimensiones de la ventana de edición
window_width = 800
window_height = 600

# Crear la figura y el eje 3D
fig = plt.figure(figsize=(8, 6))
ax = fig.add_subplot(111, projection='3d')

# Definir las dimensiones del dron
drone_width = 2
drone_height = 1
drone_depth = 1

# Lista para almacenar el dron que se está dibujando
drone_body = None

# Función para dibujar el dron
def draw_drone(x, y, z):
    global drone_body

    # Crear los vértices del dron
    vertices = np.array([
        [x - drone_width/2, y - drone_height/2, z - drone_depth/2],
        [x - drone_width/2, y + drone_height/2, z - drone_depth/2],
        [x + drone_width/2, y + drone_height/2, z - drone_depth/2],
        [x + drone_width/2, y - drone_height/2, z - drone_depth/2],
        [x - drone_width/2, y - drone_height/2, z + drone_depth/2],
        [x - drone_width/2, y + drone_height/2, z + drone_depth/2],
        [x + drone_width/2, y + drone_height/2, z + drone_depth/2],
        [x + drone_width/2, y - drone_height/2, z + drone_depth/2]
    ])

    # Crear las caras del dron
    faces = [
        [vertices[0], vertices[1], vertices[2], vertices[3]],  # Cara inferior
        [vertices[4], vertices[5], vertices[6], vertices[7]],  # Cara superior
        [vertices[0], vertices[1], vertices[5], vertices[4]],  # Cara lateral izquierda
        [vertices[2], vertices[3], vertices[7], vertices[6]],  # Cara lateral derecha
        [vertices[1], vertices[2], vertices[6], vertices[5]],  # Cara frontal
        [vertices[0], vertices[3], vertices[7], vertices[4]]   # Cara trasera
    ]

    # Dibujar el dron, eliminar el anterior si existe
    if drone_body:
        drone_body.remove()

    drone_body = Poly3DCollection(faces, color='blue', alpha=0.6)
    ax.add_collection3d(drone_body)

# Función para simular el recorrido del dron sin detenerse
def simulate_drone(area, speed):
    # Generar una trayectoria continua
    t = np.linspace(0, 4 * np.pi, 500)  # Aumentamos el número de puntos
    x = np.sin(t) * area
    y = np.cos(t) * area
    z = np.linspace(0, 10, 500)

    # Dibujar el recorrido del dron
    for i in range(len(x)):
        draw_drone(x[i], y[i], z[i])
        
        # Mantener las mismas configuraciones de los ejes
        ax.set_xlim([-10, 10])
        ax.set_ylim([-10, 10])
        ax.set_zlim([0, 10])
        ax.set_xlabel('X')
        ax.set_ylabel('Y')
        ax.set_zlabel('Z')
        ax.set_title('Simulación del recorrido del dron')

        # Actualizar el gráfico sin detenerse
        plt.pause(0.01)

# Ejemplo de uso
area = 5
speed = 1
simulate_drone(area, speed)
plt.show()
