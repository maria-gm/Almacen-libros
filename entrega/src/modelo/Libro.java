package modelo;

public class Libro {
private String título;
private int año_publicación;
private int páginas;
private Double precio;
public Autor autor= new Autor();
    
public Libro() {
    título="desconocido";
    año_publicación=0;
    páginas=0;
    precio=0.0;
    
    }

//Getter
public String  getTítulo() {
return título;
}

public int getAño(){
return año_publicación;
}
public int getPáginas(){
return páginas;
}
public double getPrecio(){
return precio;
}

//Setter
public void setTítulo(String título){
this.título=título;
}
public void setAño( int año_publicación) {
this.año_publicación=año_publicación;
}
public void setPáginas( int páginas) {
this.páginas=páginas;
}
public void setPrecio(double precio){
this.precio=precio;
}
}


