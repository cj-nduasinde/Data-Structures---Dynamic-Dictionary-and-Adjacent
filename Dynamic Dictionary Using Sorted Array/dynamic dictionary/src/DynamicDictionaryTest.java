import java.util.Scanner;

public class DynamicDictionaryTest {
	
	
		public static void main(String args[])
		{
			int n, position;
			int key;
			int item;
			
			/* Create an empty array with a space for 200 items */
			DynamicDictionaryClass MM = new DynamicDictionaryClass(); 
			
			/* insert n items to the empty array */
			System.out.println("Enter the number of items to insert:");
			n = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.printf("Enter %1$s items" + "\r\n", n);
			for (int i = 0; i < n; i++)
			{
				item = Integer.parseInt(new Scanner(System.in).nextLine());
				MM.Insertion( item);
			};
		    System.out.println("Display all items from index 0:");
			MM.Display();
			
			/* Test the operations */
			System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion");
			int s = Integer.parseInt(new Scanner(System.in).nextLine());
			while (s == 1 || s == 2 || s == 3)
			{
				if (s == 1)
				{
					System.out.println("Enter a key for search");
					key = Integer.parseInt(new Scanner(System.in).nextLine());
					position = MM.Search(key);
					if (position != -1)
					{
						System.out.printf("The index of the searching in the array is %1$s" + "\r\n", position);
						
					};
				};
				if (s == 2)
				{
					System.out.println("Enter an item for insertion");
					item = Integer.parseInt(new Scanner(System.in).nextLine());
					MM.Insertion(item);
					System.out.println("Dispay all items from index 0:");
					MM.Display();
				};
				if (s == 3)
				{
					System.out.println("Enter a key for deletion");
					key = Integer.parseInt(new Scanner(System.in).nextLine());
					MM.Deletion(key);
					System.out.println("Display all items from index 0:");
					MM.Display();
				};

				System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion");
				s = Integer.parseInt(new Scanner(System.in).nextLine());
			}
		}
	}


