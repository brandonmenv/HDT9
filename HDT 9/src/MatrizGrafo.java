/**
 *
 * @author Alejo
 */

import java.util.Vector;
public class MatrizGrafo<V,E> implements InterfazGrafo {

    private Vector vertices = new Vector();
    private int[][] arcos= new int [25][25];
    
    public MatrizGrafo()
    {
        for(int i=0;i<25;i++){
            for(int j=0;j<25;j++){
                if(i==j){
                    arcos[i][j]=0;
                }
                else{
                    arcos[i][j]=10000;
                }
            }
        }
    }
    @Override
    public void add(Object label) 
    {
        if(!vertices.contains(label))
        {
            vertices.add(label);
        }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEdge(Object vtx1, Object vtx2, Object label)
    {
        int i = vertices.indexOf(vtx1);
        int j = vertices.indexOf(vtx2);        
        String tmp = ""+label;
        int peso = Integer.parseInt(tmp);
        arcos[i][j]=peso;   
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() 
    {
        
         for(int i=0;i<vertices.size();i++){
            for(int j=0;j<vertices.size();j++)
            {
                System.out.print(""+arcos[i][j]+" ");
            }
   
        }   
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int label) {
       
        return (V)vertices.get(label);
        //return null;
        
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEdge(Object label1, Object label2)
    {
        return arcos[vertices.indexOf(label1)][vertices.indexOf(label2)];
        //return 0;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object label) 
    {
        return vertices.contains(label);
        //return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size()
    {
         return vertices.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
