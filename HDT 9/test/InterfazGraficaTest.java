/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.JComponent;
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
public class InterfazGraficaTest {
    
    public InterfazGraficaTest() {
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
     * Test of panelBotones method, of class InterfazGrafica.
     */
    @Test
    public void testPanelBotones() {
        System.out.println("panelBotones");
        InterfazGrafica instance = null;
        JComponent expResult = null;
        JComponent result = instance.panelBotones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of panelResultado method, of class InterfazGrafica.
     */
    @Test
    public void testPanelResultado() {
        System.out.println("panelResultado");
        InterfazGrafica instance = null;
        JComponent expResult = null;
        JComponent result = instance.panelResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of panelBanner method, of class InterfazGrafica.
     */
    @Test
    public void testPanelBanner() {
        System.out.println("panelBanner");
        InterfazGrafica instance = null;
        JComponent expResult = null;
        JComponent result = instance.panelBanner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class InterfazGrafica.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        InterfazGrafica instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creandoInterfaz method, of class InterfazGrafica.
     */
    @Test
    public void testCreandoInterfaz() {
        System.out.println("creandoInterfaz");
        InterfazGrafica instance = null;
        instance.creandoInterfaz();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of itemStateChanged method, of class InterfazGrafica.
     */
    @Test
    public void testItemStateChanged() {
        System.out.println("itemStateChanged");
        ItemEvent a = null;
        InterfazGrafica instance = null;
        instance.itemStateChanged(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
