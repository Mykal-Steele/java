import numpy as np
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D

# Define the parametric equations for the heart
def heart_3d(u, v):
    x = 16 * np.sin(u)**3
    y = 13 * np.cos(u) - 5 * np.cos(2*u) - 2 * np.cos(3*u) - np.cos(4*u)
    z = v
    return x, y, z

# Create a grid for u and v
u = np.linspace(0, 2 * np.pi, 100)
v = np.linspace(-1, 1, 10)
u, v = np.meshgrid(u, v)

# Compute the coordinates
x, y, z = heart_3d(u, v)

# Plot the 3D heart
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')
ax.plot_surface(x, y, z, color='red', alpha=0.7)

ax.set_xlabel('X')
ax.set_ylabel('Y')
ax.set_zlabel('Z')
ax.set_title('3D Heart Shape')

plt.show()
