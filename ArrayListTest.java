

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayListTest{
    public ArrayListTest(){}

    @BeforeEach
    public void setUp(){}

    @AfterEach
    public void tearDown(){}
    

    @Test
    public void testPersona(){
        Persona persona1 = new Persona("Ariel", "Av Manuel Rodriguez", "Masculino", 20);
        assertEquals(persona1.getNombre(), "Ariel");
        
        assertEquals(persona1.getEdad(), 20);
        persona1.setEdad(21);
        assertEquals(persona1.getEdad(), 21);
    }
    @Test
    public void testCaja(){
        Caja<Integer> caja1 = new Caja(5, "black");
        Caja<Integer> caja2 = new Caja(8, "blue");
        Caja<Integer> caja3 = new Caja(40, "white");
        Caja<Integer> caja4 = new Caja(33, "red");
        
        assertEquals(caja1.getDato(), 5);
        caja1.setDato(90);
        assertEquals(caja1.getDato(), 90);
    }
    @Test
    public void testTupla(){
        Tupla<Integer, String> tupla1 = new Tupla(10, "red");
        assertEquals(tupla1.getKey(), 10);
        assertEquals(tupla1.getValue(), "red");
        Tupla<String, String> tupla2 = new Tupla("green", "black");
        assertEquals(tupla2.getKey(), "green");
        assertEquals(tupla2.getValue(), "black");
    }
    @Test
    public void testCajoneriaAdd(){
        Cajoneria<Integer> cajoneria1 = new Cajoneria();
        cajoneria1.add(new Caja(5, "black"));//0
        cajoneria1.add(new Caja(8, "red"));//1
        cajoneria1.add(new Caja(40, "green"));//2
        cajoneria1.add(new Caja(30, "pink"));//3
    
    }
    @Test
    public void testCajoneriaSearch(){
        Cajoneria<Integer> cajoneria1 = new Cajoneria();
        cajoneria1.add(new Caja(5, "black"));//0
        cajoneria1.add(new Caja(8, "red"));//1
        cajoneria1.add(new Caja(40, "green"));//2
        cajoneria1.add(new Caja(30, "pink"));//3
        
        Tupla<Integer, String> resultado = cajoneria1.search(40);
        assertEquals(resultado.getKey(), 2);
        assertEquals(resultado.getValue(), "green");
        resultado = cajoneria1.search(100);
        assertEquals(resultado, null);
    }
    @Test
    public void testCajoneriaRemove(){
        Cajoneria<Integer> cajoneria1 = new Cajoneria();
        cajoneria1.add(new Caja(5, "black"));//0
        cajoneria1.add(new Caja(8, "red"));//1
        cajoneria1.add(new Caja(40, "green"));//2
        cajoneria1.add(new Caja(30, "pink"));//3
        Caja<Integer> cajaEliminada = cajoneria1.remove(40);
        assertEquals(cajaEliminada.getDato(), 40);
        assertEquals(cajaEliminada.getColor(), "green");
        cajaEliminada = cajoneria1.remove(40);
        assertEquals(cajaEliminada, null);
    }
    @Test
    public void testCajoneriaToString(){
        Cajoneria<Integer> cajoneria1 = new Cajoneria();
        cajoneria1.add(new Caja(5, "black"));//0
        cajoneria1.add(new Caja(8, "red"));//1
        cajoneria1.add(new Caja(40, "green"));//2
        cajoneria1.add(new Caja(30, "pink"));//3
        assertEquals(cajoneria1.toString(), 
"5 black 0\n"+
"8 red 1\n"+
"40 green 2\n"+
"30 pink 3\n");
    }
}

