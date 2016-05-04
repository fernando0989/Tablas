package escuela;

public class Alumno {

    String nombre;
    String apellido;
    String numeroC;

    public Alumno(){
        
    }
    public Alumno(String nombre, String apellido, String numeroC) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroC = numeroC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public String getNumeroC() {
        return numeroC;
    }
    public String[] getFilas(){
        String fila[]=new String[3];
        fila[0]=numeroC;
        fila[1]=nombre;
        fila[2]=apellido;
        return fila;
    }
    
}
