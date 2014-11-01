
/**
 * @author Alejandro Diaz 13082
 * @author Brandon Mendez 13087
 * Interfaz de grafo extraida del libro Java Structures
 */
public interface InterfazGrafo<V,E> {

    public void add(V label);
    // pre: label is a non-null label for vertex
    // post: a vertex with label is added to graph
    // if vertex with label is already in graph, no action
    public void addEdge(V vtx1, V vtx2, E label);
    // pre: vtx1 and vtx2 are labels of existing vertices
    // post: an edge (possibly directed) is inserted between
    // vtx1 and vtx2.
    public void show();

    public V get(int label);
    // post: returns actual label of indicated vertex
    public int getEdge(V label1, V label2);
    // post: returns actual edge between vertices
    public boolean contains(V label);
    // post: returns true iff vertex with "equals" label exists
    public int size();
    // post: returns the number of vertices in graph
    
}