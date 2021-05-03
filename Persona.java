

public class Persona{
    private String nombre, direccion, sexo;
    private int edad;
    
    public Persona(){
    }
    public Persona(String n, String dir, String sexo, int edad){
        this.nombre = n;
        this.direccion = dir;
        this.sexo = sexo;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getSexo(){
        return sexo;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nuevoNombre ){
        nombre = nuevoNombre;
    }
    public void setDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
    }
    public void setSexo(String nuevoSexo){
         sexo = nuevoSexo;
    }
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }
}
