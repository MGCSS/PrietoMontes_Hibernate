package hibernate;

import modelo.Experto;
import org.junit.Test;
import static org.junit.Assert.*;

public class ManejaExpertoTest 
{
    private final ManejaExperto me;
    
    public ManejaExpertoTest()
    {
        me = new ManejaExperto();
    }
   
    /* @Test
    public void testGuardaExperto() 
    {
        System.out.println("guardaExperto");
        
        me.guardaExperto(new Experto("E009", "Alguien", "España", "Mecánica"));
    } */
    
    /* @Test
    public void testObtenExperto() 
    {
        System.out.println("obtenExperto");
        
        String idExperto = "E009";
        Experto result = me.obtenExperto(idExperto);
        
        assertEquals(idExperto, result.getCodExperto());
    } */

    /* @Test
    public void testEliminaExperto() 
    {
        System.out.println("eliminaExperto");
        
        Experto experto = new Experto("E009", "Otro", "Argentina", "Ingeniería Informática");
       
        me.eliminaExperto(experto);
    } */

    /* @Test
    public void testActualizaExperto()
    {
        System.out.println("actualizaExperto");
        
        Experto experto = new Experto("E009", "Otro", "Argentina", "Ingeniería Informática");
        
        me.actualizaExperto(experto);
    } */

    /* @Test
    public void testObtenNombreYEspecialidad() 
    {
        System.out.println("obtenNombreYEspecialidad");
        ManejaExperto instance = new ManejaExperto();
        instance.obtenNombreYEspecialidad();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testListaConParametro() 
    {
        System.out.println("listaConParametro");
        String keyword = "";
        ManejaExperto instance = new ManejaExperto();
        instance.listaConParametro(keyword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testObtenCasos() 
    {
        System.out.println("obtenCasos");
        ManejaExperto instance = new ManejaExperto();
        instance.obtenCasos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
}
