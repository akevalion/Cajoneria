import java.util.*;
public class Cajoneria<T>{
    private ArrayList<Caja<T>> lista;
    public Cajoneria(){
        lista = new ArrayList();
    }
    public void add(Caja<T> nuevaCaja){
        lista.add(nuevaCaja);
    }
    public Tupla<Integer, String> search (T datoBuscado){
        int index = this.indexOf(datoBuscado);
        if(index == -1) return null;
        Caja<T> caja = lista.get(index);
        return new Tupla(index, caja.getColor() );
    }
    public int indexOf(T datoBuscado){
        for(int k = 0; k < lista.size(); k ++ ){
            Caja<T> caja = lista.get(k);
            if(caja.getDato().equals(datoBuscado)){
                return k;
            }
        }
        return -1;
    }
    public Caja<T> remove(T datoAEliminar){
        int index = this.indexOf(datoAEliminar);
        if(index == -1) return null;
        return lista.remove(index);
    }
    public String toString(){
        String result = "";
        for(int k = 0 ; k < lista.size(); k++){
            Caja<T> caja = lista.get(k);
            result = result + caja.getDato()+" "+caja.getColor()+" "+k+"\n";
        }
        return result;
    }
}
