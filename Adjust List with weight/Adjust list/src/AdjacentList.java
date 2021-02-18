import java.util.Scanner;

public class AdjacentList {
	
	
	    public static void main(String[] args)
	    {
	        int vertices, edges, v1, v2, w;
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Enter the number of vertices - ");
	        vertices = in.nextInt();
	        System.out.print("Enter the number of edges - ");
	        edges = in.nextInt();
	        
	        // Creating Adjacency List. Size is made |V| + 1 to
	        // use the array by 1-indexing, for simplicity
	        Node[] adjacencyList = new Node[vertices + 1];
	        
	        System.out.println("Enter " + edges + " edges. Three integers v1, v2, w -");
	        
	        for (int i = 0; i < edges; ++i) {
	            // Scanning edge v1 -> v2 of weight 'w'
	            v1 = in.nextInt();
	            v2 = in.nextInt();
	            w = in.nextInt();
	            
	            // Adding edge v1 -> v2
	            adjacencyList[v1] = addEdge(adjacencyList[v1], new Node(v2, w));
	            
	            // To add edge v2 -> v1, uncomment line below
	            // adjacencyList[v2] = addEdge(adjacencyList[v2], v1, w);
	        }
	        
	        // Printing adjacency list
	        print(adjacencyList);
	    }
	  
	    
	    /**
	     * Adds a new node in the linked list. Follows head insertion for O(1) performance.
	     * 
	     * @param oldHead head of the linked list to which new node is to be added
	     * @param newEdge new edge to be added
	     * @return new head of the linked list
	     */
	    public static Node addEdge(Node oldHead, Node newEdge)
	    {
	        // Add the new node to the start of linked list
	        newEdge.next = oldHead;
	        
	        return newEdge;
	    }
	    
	    
	    public static void print(Node[] adjacencyList)
	    {
	        for (int i = 1; i < adjacencyList.length; ++i) {
	            Node trav = adjacencyList[i];
	            
	            System.out.print("adjacencyList[" + i + "] -> ");
	            
	            while (trav != null) {
	                System.out.print(trav.vertex + "(" + trav.weight + ") -> ");
	                trav = trav.next;
	            }
	            
	            System.out.println("NULL");
	        }
	    }
}
