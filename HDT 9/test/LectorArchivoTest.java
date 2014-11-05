/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejo
 */
public class LectorArchivoTest {
    
    public LectorArchivoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerArchivo method, of class LectorArchivo.
     */
    @Test
    public void testObtenerArchivo() throws Exception {
        System.out.println("obtenerArchivo");
        String direccion = "";
        LectorArchivo instance = new LectorArchivo();
        instance.obtenerArchivo(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arregloNombres method, of class LectorArchivo.
     */
    @Test
    public void testArregloNombres() throws Exception {
        System.out.println("arregloNombres");
        LectorArchivo instance = new LectorArchivo();
        InterfazGrafo expResult = null;
        InterfazGrafo result = instance.arregloNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of matrizCostos method, of class LectorArchivo.
     */
    @Test
    public void testMatrizCostos() throws Exception {
        System.out.println("matrizCostos");
        LectorArchivo instance = new LectorArchivo();
        InterfazGrafo expResult = null;
        InterfazGrafo result = instance.matrizCostos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
