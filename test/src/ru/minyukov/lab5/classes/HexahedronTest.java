package src.ru.minyukov.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.minyukov.lab5.Hexahedron;

public class HexahedronTest {
    
    @Test
    public void testgetdiagonal(){
        System.out.print("Проверка метода getdiagonal()");
        Hexahedron h = new Hexahedron(3);
        assertEquals(Math.sqrt(3)*3,h.getdiagonal(),0.00001);
    }
}
 
