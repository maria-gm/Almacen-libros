package modelo;

public class Almacen {
    Libro[] libros;
    public int librosAñadidos;
// Constructor para crear el almacen con un tamaño determinado
    public Almacen(int tamaño) {
        this.libros = new Libro[tamaño];
        this.librosAñadidos = 0;
    }

    // Método para añadir un libro al almacén
    public void añadirLibro(Libro libro) {
        if (librosAñadidos < libros.length) {
                    libros[librosAñadidos] = libro;
                    System.out.println("Libro añadido al almacén.");
                    librosAñadidos++;
                } else {
                    System.out.println("El almacén está lleno, no se pueden añadir más libros.");
                }
            }
        

    //metodo para mostrar la tabla con la info de los libros
    public void mostrarLibros(int ritmoLectura){
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| LIBROS EN EL ALMACÉN                                                                                                  |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Título            | Año Publicación | Autor             | Premio Planeta | Páginas | Tiempo lectura minutos |  Precio |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        
        int tiempoTotalLectura = 0;
        
        double valorTotalAlmacen = 0; 
        
        for (int i = 0; i<librosAñadidos; i++) {
            Libro libro = libros[i];
            String premio = libro.autor.premioPlaneta ? "Sí" : "No";
            int tiempoLectura = libro.calcularTiempoLectura(ritmoLectura);
            tiempoTotalLectura += tiempoLectura;
            valorTotalAlmacen += libro.precio;
            System.out.printf("| %-17s | %-15d | %-17s | %-14s | %-7d | %-22d |  %.2f |\n", 
                              libro.titulo, 
                              libro.anioPublicacion, 
                              libro.autor.nombre + " " + libro.autor.apellidos, 
                              premio, 
                              libro.paginas, 
                              tiempoLectura, 
                              libro.precio);        
        }
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        System.out.printf("| Tiempo de lectura total del almacén:                                                                          %d min |\n", tiempoTotalLectura);
        System.out.printf("| Valor total del almacén:                                                                                       %.2f |\n", valorTotalAlmacen);
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
    }
}
