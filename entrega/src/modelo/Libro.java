package modelo;

public class Libro {
public String título;
public Autor autor;
public int año_publicación;
public int páginas;
Double precio;

    
public Libro(String titulo, Autor autor, int añoPublicacion, int numeroPaginas, double precio) {
    título="desconocido";
    this.autor=autor ;
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
// calculo del ritmo de lectura
public int calcularTiempoLectura(int ritmoLectura){
    return páginas/ritmoLectura;
}
}


