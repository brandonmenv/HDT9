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
/**
 *
 * @author Maria Fernanda Martinez, Adrian Martinez
 */
public class Princpal {
    private static JFrame frame;	

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        	//Frame de control


        InterfazGrafica in = new InterfazGrafica(frame);
        JFrame.setDefaultLookAndFeelDecorated(true);
        in.creandoInterfaz();
		
      
        /*
        Floyd matriz = new Floyd();
        matriz.caminoCorto();
        int seleccion;
        int opcion;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Presione 1 para buscar ruta mas corta entre dos ciudades ");
        System.out.println(" Presione 2 para el centro del grafo");
        System.out.println(" Presione 3 para Modificar un grafo ");
        System.out.println(" Presione 4 para Finalizar programa");
        seleccion = scan.nextInt();
        while(seleccion!=4){
            
            System.out.println("\nMatriz de adyacencia\n");
            matriz.D.show();
            if(seleccion==1){
                matriz.caminoCorto();
                System.out.println("Ingrese el nombre de la ciudad de salida");
                String ciudad1 = scan.next();
                System.out.println("Ingrese el nombre de la ciudad de destino");
                String ciudad2 = scan.next();
                if(matriz.D.contains(ciudad1)&&matriz.D.contains(ciudad2)){
                    System.out.println("\nLa ruta mas corta es: "+matriz.D.getEdge(ciudad1, ciudad2));
                    //FALTA MOSTRAR LAS CIUDADES INTERMEDIAS
                }
            }
            else if(seleccion==2){
                matriz.centroGrafo();
            }
            else if(seleccion==3){
                System.out.println("1. Hay interrupcion de trafico entre un par de ciudades");
                System.out.println("2. Establecer nueva conexion");
                opcion = scan.nextInt();
                if(opcion==1){
                    System.out.println("Ingrese el nombre de la ciudad de salida");
                    String ciudad1 = scan.next();
                    System.out.println("Ingrese el nombre de la ciudad de destino");
                    String ciudad2 = scan.next();
                    if(matriz.D.contains(ciudad1)&&matriz.D.contains(ciudad2)){
                        matriz.D.addEdge(ciudad1, ciudad2, 10000);
                    }
                }
                else if(opcion==2){
                    System.out.println("Ingrese el nombre de la ciudad de salida");
                    String ciudad1 = scan.next();
                    System.out.println("Ingrese el nombre de la ciudad de destino");
                    String ciudad2 = scan.next();
                    System.out.println("Ingrese la distancia entre las ciudades");
                    int distancia = scan.nextInt();
                    if(matriz.D.contains(ciudad1)&&matriz.D.contains(ciudad2)){
                        matriz.D.addEdge(ciudad1, ciudad2, distancia);
                    }
                    else{
                        matriz.D.add(ciudad1);
                        matriz.D.add(ciudad2);
                        matriz.D.addEdge(ciudad1, ciudad2, distancia);
                    }
                }
                matriz.caminoCorto();
                matriz.D.show();
            }
       
            System.out.println(" Presione 1 para buscar ruta mas corta entre dos ciudades ");
            System.out.println(" Presione 2 para el centro del grafo");
            System.out.println(" Presione 3 para Modificar un grafo ");
            System.out.println(" Presione 4 para Finalizar programa");
            seleccion = scan.nextInt();
        }
     */   
    }
     
