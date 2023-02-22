import org.junit.Test;
import static org.junit.Assert.*;

public class TestCirculo_CBE {
    
    @Test
    public void testArea() {
        Circulo_CBE c1 = new Circulo_CBE(7, "Circulo");
        assertEquals(153.9384, c1.area(), 0.0001);
        
        Circulo_CBE c2 = new Circulo_CBE(0, "Circulo");
        assertEquals(0, c2.area(), 0);
        
        Circulo_CBE c3 = new Circulo_CBE(-3, "Circulo");
        assertEquals(28.2743, c3.area(), 0.0001);
    }
    
    @Test
    public void testPerimetro() {
        Circulo_CBE c1 = new Circulo_CBE(7, "Circulo");
        assertEquals(43.9823, c1.perimetro(), 0.0001);
        
        Circulo_CBE c2 = new Circulo_CBE(0, "Circulo");
        assertEquals(0, c2.perimetro(), 0);
        
        Circulo_CBE c3 = new Circulo_CBE(-3, "Circulo");
        assertEquals(18.8496, c3.perimetro(), 0.0001);
    }
}