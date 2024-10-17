package modelo;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        App app =new App();
        app.menu();
        int index=sc.nextInt();
        while (index!=5){
            
            if (index==1){
                app.menu1();
            }
            if (index==2){
                app.menu2();
            }
            if (index==3){
                app.menu3();
            }
            if (index==4){
                app.menu4();
            }
            app.menu();
            index=sc.nextInt();
        }
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
    Almacen[] almacen= new  Almacen[0];
    System.out.println("Se ha abierto un nuevo almacén, seleccione el menu 3 para añadir libros");
    }


// ritmo lectura en paginas minuto
public void menu2(){
    Scanner sc =new Scanner(System.in);
    System.out.println("establezca su ritmo de lectura (páginas/min)");
    int ritmo_lectura=sc.nextInt();
    sc.close();
}

// Añadir un libro al almacen , habra que crear un objeto almacen 
public void menu3(){
   Scanner sc=new Scanner(System.in);
   Libro() libro=new Libro(){String autor;
    String título;
    int año_Publicación;
    int número_páginas;
    Double precio;
    };
   Autor() autor =new Autor(){String nombre; String apellidos; boolean premioPlaneta;}
Almacen almacen[]= new Almacen[0];
  System.out.println("Introduzca el título del libro");
   título=sc.nextLine();
   System.out.println("Introduzca el nombre del autor");
   nombre=sc.nextLine();
   System.out.println("Introduzca los apellidos del autor"); 
   apellidos=sc.nextLine();
   System.out.println("Introduzca el año de publicación");
   año_Publicación=sc.nextInt();
   System.out.println("Introduzca el número de páginas");
   número_páginas=sc.nextInt();
   System.out.println("Introduzca el precio"); 
   precio=c.nextDouble();
   sc.close();
 

   

 
    

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