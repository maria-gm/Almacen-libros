package modelo;

public class Autor {
public String nombre;
public String apellidos;
public boolean premioPlaneta; 
public Autor(String nombre, String apellidos, boolean premioPlaneta) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.premioPlaneta=premioPlaneta;
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
