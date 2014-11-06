/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Math.E;
import static java.lang.StrictMath.E;
import static javafx.scene.input.KeyCode.V;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Alejo
 */
public class InterfazGrafoTest {
    
    public InterfazGrafoTest() {
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
     * Test of add method, of class InterfazGrafo.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object ciudad1 = "Guatemala";
        InterfazGrafo instance = new InterfazGrafoImpl();
        instance.add(ciudad1);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addEdge method, of class InterfazGrafo.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        Object vtx1 = "Guatemala";
        Object vtx2 = "Flores";
        Object label = 0;
        InterfazGrafo instance = new InterfazGrafoImpl();
        instance.addEdge(vtx1, vtx2, label);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class InterfazGrafo.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        InterfazGrafo instance = new InterfazGrafoImpl();
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class InterfazGrafo.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int label = 0;
        InterfazGrafo instance = new InterfazGrafoImpl();
        Object expResult = "Guatemala";
        Object result = instance.get(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEdge method, of class InterfazGrafo.
     */
    @Test
    public void testGetEdge() {
        System.out.println("getEdge");
        Object label1 = "Guatemala";
        Object label2 = "Flores";
        InterfazGrafo instance = new InterfazGrafoImpl();
        int expResult = 0;
        int result = instance.getEdge(label1, label2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class InterfazGrafo.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object label = null;
        InterfazGrafo instance = new InterfazGrafoImpl();
        boolean expResult = false;
        boolean result = instance.contains(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class InterfazGrafo.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        InterfazGrafo instance = new InterfazGrafoImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    public class InterfazGrafoImpl implements InterfazGrafo {

        public void add(Object label) {
        }

        public void addEdge(Object vtx1, Object vtx2, Object label) {
        }

        public void show() {
        }

        public Object get(int label) {
            return null;
        }

        public int getEdge(Object label1, Object label2) {
            return 0;
        }

        public boolean contains(Object label) {
            return false;
        }

        public int size() {
            return 0;
        }

        
    }
    
}
