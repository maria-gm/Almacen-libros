package modelo;

import java.util.Scanner;


public class App {
    private Almacen almacen;
    private int ritmo_lectura=1; //Ritmo de lectura que se da por defecto
        public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        App app =new App();
        app.menu();
        int index=sc.nextInt();
        while (index!=5){
            switch(index){
             case 1: app.menu1();
             break;
             case 2: app.menu2();
             break;
             case 3 :app.menu3();
             break;
             case 4: app.menu4();
             break;
             // case default para que si ingresamos un numero que no sea del 1 al 5 vuelva a pedirte un número
             default: System.out.println("ingrese un número del 1 al 4 o 5 para salir del programa")
             break;
            }
             app.menu();
             index=sc.nextInt();}
        
        sc.close();
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
    System.out.println("Seleccione una opción (1-4):");

}
//crea un nuevo almacen de libros con todos los datos null
public void menu1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del nuevo almacén de libros:");
        int tamaño = sc.nextInt();
        almacen = new Almacen(tamaño);
        System.out.println("Se ha creado un nuevo almacén de tamaño " + tamaño);
        sc.close();
    }


// ritmo lectura en paginas minuto
public void menu2(){
    Scanner sc =new Scanner(System.in);
    System.out.println("establezca su ritmo de lectura (páginas/min)");
    int ritmo_lectura=sc.nextInt();
    System.out.println("El ritmo de lectura se establcera a "+ritmo_lectura+". Si desea cambiarlo vuelva a este menu.");
    sc.close();
}

// Añadir un libro al almacen , habra que crear un objeto almacen 
public void menu3(){
   if (almacen==null){System.out.println("Antes debes ir al menu 1 para crear un almacén ");} 
   else{Scanner sc=new Scanner(System.in); 
        System.out.println("Introduzca el título del libro");
        String título=sc.nextLine();
        System.out.println("Introduzca el nombre del autor");
        String nombre=sc.nextLine();
        System.out.println("Introduzca los apellidos del autor"); 
        String apellidos=sc.nextLine(); 
        System.out.println("¿El autor ha ganado el Premio Planeta? (true/false):");
        boolean premioPlaneta = sc.nextBoolean();
        System.out.println("Introduzca el año de publicación");
        int año_Publicación=sc.nextInt();
        System.out.println("Introduzca el número de páginas");
        int número_páginas=sc.nextInt();
        System.out.println("Introduzca el precio"); 
        Double precio=sc.nextDouble();
        Autor autor = new Autor(nombre, apellidos, premioPlaneta);
        Libro libro = new Libro(título, autor, año_Publicación, numeroPaginas, precio);
        almacen.añadirLibro(libro);
        System.out.println("Libro añadido al almacén.");
        sc.close();
   }

}

// mostrar la tabla de los libros 
public void menu4(){
System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
System.out.println("| LIBROS EN EL ALMACÉN                                                                                                  |");
System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
System.out.println("| Título            | Año Publicación |  Autor             | Premio Planeta | Páginas | Tiempo lectura minutos |  Precio|");
System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
// aquí habría que añadir un bucle for 
System.out.println("|Tiempo de lectura total del almacén:                                                                                   |");
System.out.println("|Valor total del almacén:                                                                                               |");
System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");


}
}