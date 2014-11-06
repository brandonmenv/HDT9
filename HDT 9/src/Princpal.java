/**
 * Principal.java
 * 
 * @author Brandon Mendez -13087
 * @author Alejandro Díaz - 13082
 * 
 * Descripcion: Programa principal que resuelve la hoja de trabajo 9 
 * de algoritmos y estructura de Datos
 * 
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Princpal {
    private static JFrame frame;	

    public static void main(String[] args){
        //Frame de control
        InterfazGrafica in = new InterfazGrafica(frame);
        JFrame.setDefaultLookAndFeelDecorated(true);
        in.creandoInterfaz();
    }
}     
