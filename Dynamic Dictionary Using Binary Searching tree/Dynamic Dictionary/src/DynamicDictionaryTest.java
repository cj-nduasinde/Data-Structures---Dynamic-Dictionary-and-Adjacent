import java.util.Scanner;

public class DynamicDictionaryTest {


		  public static void main (String[] args) throws java.lang.Exception
		   {
		       int key;
		       int newItem;
		      
		       // create an empty Binary Search Tree
		  
		       DynamicDictionaryClass DD = new DynamicDictionaryClass();
		       
		      
		       // create a binary search tree of n nodes
		       System.out.println("Enter the number of items to Insert:");
		       Scanner sc = new Scanner(System.in);
		       int n = Integer.parseInt(sc.nextLine());
		       System.out.println("Enter " + n + " items \r\n");
		       for(int i = 0; i < n; i++)
		       {
		       newItem = Integer.parseInt(sc.nextLine());
		       DD.Insert(newItem);
		       };
		      
		       System.out.println("\nDisplay all items from the root:");
		       DD.Display();
		      
		       // test the operations of Binary Search Tree
		       System.out.println("\nEnter 1 for search,2 for deletion,3 for insert");
		       int s = Integer.parseInt(sc.nextLine());
		       while(s == 1 || s == 2 || s == 3 || s == 4)
		       {
		       if(s == 1)
		       {
		       System.out.println("enter the key that you want to search:");
		       key = Integer.parseInt(sc.nextLine());
		       Node node = DD.Search(key);
		       if(node != null)
		       System.out.println("The item is found: " + node.item );
		       };
		       if(s == 2)
		       {
		       System.out.println("enter the key that you want to delete:");
		       key = Integer.parseInt(sc.nextLine());
		       DD.Delete(key);
		       System.out.println("Display all items from the header:");
		       DD.Display();
		       };
		       if(s == 3)
		       {
		       System.out.println("enter the item that you want to insert:");
		       newItem = Integer.parseInt(sc.nextLine());
		       DD.Insert(newItem);
		       System.out.println("Display all items from the header:");
		       DD.Display();
		       };
		     
		       System.out.println("\r\n");
		      
		       System.out.println("Enter 1 for search,2 for deletion,3 for isert");
		       s = Integer.parseInt(sc.nextLine());
		       }
		   }
	}



