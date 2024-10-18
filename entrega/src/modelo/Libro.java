package modelo;

public class Libro {
public String titulo;
public Autor autor;
public int anioPublicacion;
public int paginas;
double precio;

    
public Libro(String titulo, Autor autor, int anioPublicacion, int paginas, double precio) {
    this.titulo=titulo;
    this.autor=autor ;
    this.anioPublicacion=anioPublicacion;
    this.paginas=paginas;
    this.precio=precio;
    
    }

//Getter
public String  getTitulo() {
return titulo;
}

public int getAnio(){
return anioPublicacion;
}
public int getPaginas(){
return paginas;
}
public double getPrecio(){
return precio;
}

//Setter
public void setTitulo(String titulo){
this.titulo=titulo;
}
public void setAño( int anioPublicacion) {
this.anioPublicacion=anioPublicacion;
}
public void setPáginas( int paginas) {
this.paginas=paginas;
}
public void setPrecio(double precio){
this.precio=precio;
}
// calculo del ritmo de lectura
public int calcularTiempoLectura(int ritmoLectura){
    return paginas/ritmoLectura;
}
}


