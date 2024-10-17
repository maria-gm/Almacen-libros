package modelo;
public class Almacen {
    Libro[] libros;
    int librosAñadidos;
// Constructor para crear el almacen con un tamaño determinado
    public Almacen(int tamaño) {
        this.libros = new Libro[tamaño];
        this.librosAñadidos = 0;
    }

    // Método para añadir un libro al almacén
    public void añadirLibro(Libro libro) {
        if (librosAñadidos < libros.length) {
            libros[librosAñadidos] = libro;
            librosAñadidos++;
        } else {
            System.out.println("El almacén está lleno, no se pueden añadir más libros.");
        }
    }

}
