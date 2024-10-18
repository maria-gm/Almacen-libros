package modelo;

import com.coti.tools.Esdia;

public class App {
    private Almacen almacen;
    private int ritmoLectura=1; //Ritmo de lectura que se da por defecto
        public static void main(String[] args) throws Exception {
        App app =new App();
        app.menu();
        String prompt="Seleccione una opción (1-5):";
        int index=Esdia.readInt(prompt);
        while (index!=5){
            switch(index){
             case 1: 
             app.menu1();
             break;
             case 2: 
             app.menu2();
             break;
             case 3 :
             app.menu3();
             break;
             case 4: 
             app.menu4();
             break;
             // case default para que si ingresamos un numero que no sea del 1 al 5 vuelva a pedirte un número
             default: String promtIndex="ingrese un número del 1 al 5";
                         index=Esdia.readInt(promtIndex);
                         break;
            }
             app.menu();
             index=Esdia.readInt("Seleccione una opción (1-5):");
            }
        
    }

public void menu() {
    System.out.println("| ---------------------------------------------------|");
    System.out.println("| MIS LIBROS                                         |");
    System.out.println("|----------------------------------------------------|");
    System.out.println("    1) Nuevo almacén de libros");
    System.out.println("    2) Establecer ritmo de lectura (páginas por minuto)");
    System.out.println("    3) Añadir un nuevo libro al almacén");
    System.out.println("    4) Mostrar información actual de libros");
    System.out.println("    5) Salir (se borrará toda la información)");
    System.out.println("|----------------------------------------------------|");
    
}
//crea un nuevo almacen de libros del tamaño que le digas con todos los datos null
public void menu1(){
        String promptTamaño="Ingrese el tamaño del nuevo almacén de libros:";
        int tamaño = Esdia.readInt(promptTamaño);
        almacen = new Almacen(tamaño);
        System.out.println("Se ha creado un nuevo almacén de tamaño " + tamaño);
    }


// ritmo lectura en paginas minuto
public void menu2(){
    String promptRitmo="establezca su ritmo de lectura (páginas/min)";
    int ritmoLectura=Esdia.readInt(promptRitmo);
    System.out.println("El ritmo de lectura se establcera a "+ritmoLectura+". Si desea cambiarlo vuelva a este menu.");
}

// Añadir un libro al almacen
public void menu3(){
   if (almacen==null){
        System.out.println("Antes debes ir al menu 1 para crear un almacén ");} 
   else{
        String promptTitulo = "Introduzca el título del libro: ";
        String titulo = Esdia.readString(promptTitulo);
        
        String promptNombre = "Introduzca el nombre del autor: ";
        String nombre = Esdia.readString(promptNombre);
        
        String promptApellidos = "Introduzca los apellidos del autor: ";
        String apellidos = Esdia.readString(promptApellidos);
       
        String promptPremio = "¿El autor ha ganado el Premio Planeta? (true/false):";
        boolean premioPlaneta = Esdia.yesOrNo(promptPremio);
        
        String promptAnio = "Introduzca el año de publicación:";
        int anioPublicacion = Esdia.readInt(promptAnio);

        String promptPaginas = "Introduzca el número de páginas:";
        int paginas = Esdia.readInt(promptPaginas);
        
        String promptPrecio = "Introduzca el precio:";
        double precio = Esdia.readDouble(promptPrecio);
        
        Autor autor = new Autor(nombre, apellidos, premioPlaneta);
        Libro libro = new Libro(titulo, autor, anioPublicacion, paginas, precio);
        
        almacen.añadirLibro(libro); 
        System.out.println("Libro añadido al almacén.");
                }
            
}
         
// mostrar la tabla de los libros 
public void menu4(){  
    if (almacen == null) {
            System.out.println("Primero debe crear un almacén (opción 1).");
        } else if (almacen.librosAñadidos == 0) {
            System.out.println("No hay libros en el almacén.");
        } else {
            almacen.mostrarLibros(ritmoLectura);
        }}
}