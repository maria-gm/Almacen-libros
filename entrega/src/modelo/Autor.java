package modelo;

public class Autor {
private String nombre;
private String apellidos;
private boolean premioPlaneta; 
public Autor(String nombre, String apellidos, boolean premioPlaneta) {
        nombre="desconocido";
        apellidos="desconocido";
        premioPlaneta=false;
        }
//Getter
public String  getNombre() {
    return nombre;
}

public String getApellidos() {
    return apellidos;
}
public boolean getPremio(){
    return premioPlaneta;
}

//Setter
public void setNombre(String nombre){
    this.nombre=nombre;
}
public void setApellido( String apellidos) {
   this.apellidos=apellidos;
   }
public void setPremio( boolean premioPlaneta) {
    this.premioPlaneta=premioPlaneta;
    }
}
