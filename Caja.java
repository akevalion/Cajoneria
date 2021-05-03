
public class Caja<T>{
    private T dato;
    private String color;
    public Caja(){
    }
    public Caja(T dato, String color){
        this.dato = dato;
        this.color = color;
    }
    public T getDato(){
        return dato;
    }
    public String getColor(){
        return color;
    }
    public void setDato(T nuevoDato){
        dato = nuevoDato;
    }
    public void setColor(String nuevoColor){
        color = nuevoColor;
    }
}