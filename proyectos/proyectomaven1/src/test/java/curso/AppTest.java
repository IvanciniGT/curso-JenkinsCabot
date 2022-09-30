package curso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void sumarPositivos() {
        int resultado=App.sumar(3,8);
        assertEquals( 11, resultado );
    }
    @Test
    public void sumarNegativos() {
        int resultado=App.sumar(-3,-8);
        assertEquals( -11, resultado );
    }
    @Test
    public void sumarCero() {
        int resultado=App.sumar(3,0);
        assertEquals( 3, resultado );
    }
    @Test
    public void sumarNegativoPrimero() {
        int resultado=App.sumar(-3,8);
        assertEquals( 5, resultado );
    }
    @Test
    public void sumarNegativoSegundo() {
        int resultado=App.sumar(3,-8);
        assertEquals( -5, resultado );
    }    
    
    @Test
    public void restarPositivos() {
        int resultado=App.restar(3,8);
        assertEquals( -5, resultado );
    }
    @Test
    public void restarNegativos() {
        int resultado=App.restar(-3,-8);
        assertEquals( 5, resultado );
    }
    @Test
    public void restarCero() {
        int resultado=App.restar(3,0);
        assertEquals( 3, resultado );
    }
    @Test
    public void restarNegativoPrimero() {
        int resultado=App.restar(-3,8);
        assertEquals( -11, resultado );
    }
    @Test
    public void restarNegativoSegundo() {
        int resultado=App.restar(3,-8);
        assertEquals( 11, resultado );
    }
}
