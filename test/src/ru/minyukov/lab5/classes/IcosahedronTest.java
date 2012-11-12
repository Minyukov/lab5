package src.ru.minyukov.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.minyukov.lab5.Icosahedron;

public class IcosahedronTest {
    @Test
    public void testGetRadSphere(){
        System.out.print("Проверка метода getRadSphere()");
        Icosahedron i = new Icosahedron(3);
        assertEquals((Math.sqrt((5+Math.sqrt(5))/8))*3,i.getRadSphere(),0.00001);
    }
}
 
