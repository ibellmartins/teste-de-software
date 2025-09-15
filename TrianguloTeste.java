import org.junit.Test;
import static org.junit.Assert.*;

/** 
 * 
 * @author Isabella Sofia Martins - RA: 10420398 
 * 
 */
 
public class TrianguloTeste {

    @Test
    public void testarTriangulo() {
        Triangulo tri = new Triangulo();
        assertTrue(tri.verificaTriangulo(3, 5, 4)); //deve formar um triangulo 
        assertFalse(tri.verificaTriangulo(0, 0, 0)); //nao forma triangulo 
        assertFalse(tri.verificaTriangulo(-1, 4, 3)); //numeros negativos nao formam triangulos 
        assertEquals(tri.verificaTriangulo(5,5,5),true);
        assertEquals(tri.verificaTriangulo(7, -4, 2), false); 
    }

    @Test
    public void testarIsosceles() {
        Triangulo tri = new Triangulo();
        assertEquals(tri.isosceles(5,5,5),true); //forma triangulo isosceles pois devem ter PELO MENOS 2 lados iguais 
        assertEquals(tri.isosceles(4, 6, 4), true); //forma isosceles 
        assertEquals(tri.isosceles(3, 2, 4), false); //nao forma isosceles, apenas escaleno 
        assertFalse(tri.isosceles(4, 5, 3)); 
    }

    @Test
    public void testarEscaleno() {
        Triangulo tri = new Triangulo();
        assertEquals(tri.escaleno(5,5,5),false); //nao forma escaleno, apenas equilatero 
        assertEquals(tri.escaleno(4, 6, 4), false); //nao forma escaleno, apenas isosceles 
        assertEquals(tri.escaleno(4, 5, 6), true); //forma escaleno 
        assertFalse(tri.escaleno(3, 2, 2)); 
    }

    @Test
    public void testarEquilatero() {
        Triangulo tri = new Triangulo();
        assertEquals(tri.equilatero(5,5,5),true); //forma equilatero 
        assertEquals(tri.equilatero(4, 6, 4), false); //nao forma equilatero, apenas isosceles 
        assertEquals(tri.equilatero(3, 2, 4), false); //nao forma equilatero, apenas escaleno 
        assertFalse(tri.equilatero(7, 4, 4)); 
    }
}
