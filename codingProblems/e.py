import numpy as np
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D

# Define the parametric equations for the circles and cylinders
def circle_3d(radius, center_x, center_y, v):
    theta = np.linspace(0, 2 * np.pi, 100)
    theta, V = np.meshgrid(theta, v)
    X = center_x + radius * np.cos(theta)
    Y = center_y + radius * np.sin(theta)
    Z = V
    return X, Y, Z

def cylinder_3d(radius, height, center_x, center_y, u, v):
    theta, U = np.meshgrid(u, v)
    X = center_x + radius * np.cos(theta)
    Y = center_y + radius * np.sin(theta)
    Z = U
    return X, Y, Z

# Parameters
radius = 1
height = 2
shorter_height = height / 3  # 1/3 of the central cylinder's height

# Create a grid for v (circles) and (u, v) (cylinders)
v_circles = np.linspace(-1, 1, 10)  # For the circles
u_cylinder = np.linspace(0, 2 * np.pi, 100)  # Angle for the cylinder
v_cylinder = np.linspace(-height / 2, height / 2, 10)  # Height for the central cylinder
v_cylinder_short = np.linspace(-shorter_height / 2, shorter_height / 2, 10)  # Height for the side cylinders

# Compute the coordinates for the circles
x_circle1, y_circle1, z_circle1 = circle_3d(radius, -2.5, 0, v_circles)
x_circle2, y_circle2, z_circle2 = circle_3d(radius, 2.5, 0, v_circles)

# Compute the coordinates for the cylinders
x_cylinder, y_cylinder, z_cylinder = cylinder_3d(radius, height, 0, 0, u_cylinder, v_cylinder)
x_cylinder_short1, y_cylinder_short1, z_cylinder_short1 = cylinder_3d(radius, shorter_height, -2.5, 0, u_cylinder, v_cylinder_short)
x_cylinder_short2, y_cylinder_short2, z_cylinder_short2 = cylinder_3d(radius, shorter_height, 2.5, 0, u_cylinder, v_cylinder_short)

# Plot the shapes
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')

# Plot the first circle
ax.plot_surface(x_circle1, y_circle1, z_circle1, color='blue', alpha=0.7)

# Plot the second circle
ax.plot_surface(x_circle2, y_circle2, z_circle2, color='green', alpha=0.7)

# Plot the central cylinder
ax.plot_surface(x_cylinder, y_cylinder, z_cylinder, color='red', alpha=0.7)

# Plot the first shorter cylinder
ax.plot_surface(x_cylinder_short1, y_cylinder_short1, z_cylinder_short1, color='orange', alpha=0.7)

# Plot the second shorter cylinder
ax.plot_surface(x_cylinder_short2, y_cylinder_short2, z_cylinder_short2, color='purple', alpha=0.7)

# Set labels and title
ax.set_xlabel('X')
ax.set_ylabel('Y')
ax.set_zlabel('Z')
ax.set_title('Circles and Cylinders')

plt.show()
