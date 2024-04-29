package probaprobinha;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest 
{
    
    @Test
    public void setAndGetAge()
    {
       Estudiante e = new  Estudiante();
       e.setEdad(44);
       assertEquals(e.getEdad(),44);
    }

    @Test
    public void setAndGetName(){
        Estudiante e= new Estudiante();
        e.setNombre("Paco");
        assertEquals(e.getNombre(),"Paco");    
    }

    @Test
    public void setAndGetCalificacion(){
        Estudiante e = new Estudiante();
        e.setCalificacion(5.4);
        assertEquals(e.getCalificacion(),5.4);
    }

    @Test
    public void checkAproved(){
        Estudiante e= new Estudiante();
        e.setCalificacion(5.4);
        assertTrue(e.aprobo());
    }

    @Test
    public void checkNotAproved(){
        Estudiante e= new Estudiante();
        e.setCalificacion(4.9);
        assertFalse(e.aprobo());
    }
    
    @Test
    public void checkUniversitary(){
        Estudiante e = new Estudiante();
        e.setEdad(19);
        assertTrue(e.esUniversitario());
    }

    @Test
    public void checkNotUniversitary(){
        Estudiante e= new Estudiante();
        e.setEdad(17);
        assertFalse( e.esUniversitario());
    }

    @Test
    public void probarEdadEscolar(){
        Estudiante e= new Estudiante();
        e.setEdad(18);
        assertEquals(1,e.edadEscolar());
    }
}
