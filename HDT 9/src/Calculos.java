
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 */
public class Calculos {

    public LectorArchivo archivo= new LectorArchivo();
    public InterfazGrafo grafo;
    public int[][] matriz;
    public int[] vector;
    public int centroGrafo;
    public int minimo=10000;
    
    public Calculos(){
        
        try {
            archivo.obtenerArchivo("C:\\Users\\Alejo\\Documents\\4to Semestre\\Algoritmos\\HDT9\\HDT 9\\src\\cuidades.txt");
            archivo.arregloNombres();
            grafo = archivo.matrizCostos();
            matriz = new int[25][25];
            vector = new int[25];
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        for(int i=0;i<archivo.grafo.size();i++)
        {
            for(int j=0;j<archivo.grafo.size();j++)
            {
                matriz[i][j]=0;
            }
        }
    }
    
    public void caminoCorto(){
        for(int k=0;k<archivo.grafo.size();k++){
            for(int i=0;i<archivo.grafo.size();i++){
                for(int j=0;j<archivo.grafo.size();j++){
                    if(grafo.getEdge(archivo.grafo.get(i),archivo.grafo.get(j))>(grafo.getEdge(archivo.grafo.get(i), archivo.grafo.get(k))+grafo.getEdge(archivo.grafo.get(k), archivo.grafo.get(j)))){
                        grafo.addEdge(archivo.grafo.get(i), archivo.grafo.get(j), (grafo.getEdge(archivo.grafo.get(i), archivo.grafo.get(k))+grafo.getEdge(archivo.grafo.get(k), archivo.grafo.get(j))));
                        matriz[i][j]=k;
                    }
                }
            }
        }
        grafo.show();
    }
    
    public void centroGrafo(){
        caminoCorto();
        int n=0;       
        for(int i=0;i<grafo.size();i++){
            for(int j=0;j<grafo.size()-1;j++){
                int num1=grafo.getEdge(grafo.get(j), grafo.get(i));
                n=j;
                n++;
                int num2=grafo.getEdge(grafo.get(n), grafo.get(i));
                if(num1>num2){
                    vector[i]=num1;
                }
                else{
                    vector[i]=num2;
                }
            }
            n++;
        }
        
        
        for(int i=0;i<grafo.size();i++){
            int num1=vector[i];
            if(num1<minimo){
                centroGrafo=i;
                minimo=num1;
            }
        }
        System.out.println("\nEl centro del grafo es: "+grafo.get(centroGrafo)+"\n");
        
    }
}
