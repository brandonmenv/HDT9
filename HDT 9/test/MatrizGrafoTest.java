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
public class MatrizGrafoTest {
    
    public MatrizGrafoTest() {
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
     * Test of add method, of class MatrizGrafo.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object label = null;
        MatrizGrafo instance = new MatrizGrafo();
        instance.add(label);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEdge method, of class MatrizGrafo.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        Object vtx1 = null;
        Object vtx2 = null;
        Object label = null;
        MatrizGrafo instance = new MatrizGrafo();
        instance.addEdge(vtx1, vtx2, label);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class MatrizGrafo.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        MatrizGrafo instance = new MatrizGrafo();
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class MatrizGrafo.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int label = 0;
        MatrizGrafo instance = new MatrizGrafo();
        Object expResult = null;
        Object result = instance.get(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdge method, of class MatrizGrafo.
     */
    @Test
    public void testGetEdge() {
        System.out.println("getEdge");
        Object label1 = null;
        Object label2 = null;
        MatrizGrafo instance = new MatrizGrafo();
        int expResult = 0;
        int result = instance.getEdge(label1, label2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class MatrizGrafo.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object label = null;
        MatrizGrafo instance = new MatrizGrafo();
        boolean expResult = false;
        boolean result = instance.contains(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MatrizGrafo.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MatrizGrafo instance = new MatrizGrafo();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
