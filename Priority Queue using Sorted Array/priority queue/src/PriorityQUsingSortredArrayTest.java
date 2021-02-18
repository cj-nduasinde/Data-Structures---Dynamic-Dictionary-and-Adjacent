import java.util.Scanner;

public class PriorityQUsingSortredArrayTest {
	


	
	
		public static void main(String args[])
		{     int item;
			int key;
	
			PriorityQUsingSortedArrayClass PqArr = new PriorityQUsingSortedArrayClass(); /* create an empty heap */

			System.out.println("Enter the number of items:");
			int n = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.printf("Enter %1$s items:" + "\r\n", n);
			for (int i = 0; i < n; i++) 
			{
				 item = Integer.parseInt(new Scanner(System.in).nextLine());
				PqArr.insert(item);
			};
			
			System.out.println("Display the items before build the max array:");
			PqArr.display();
			
			
	        /* Test the operations of the max heap */
			System.out.println("Enter 1 for extract maximum element, 2 for Insert");
			int s = Integer.parseInt(new Scanner(System.in).nextLine());
			while (s == 1 || s == 2)
			{
				if (s == 1)
				{
					int max = PqArr.extract();
					if (max != -999999)
					{
						System.out.println("The extracted maximum element is:" );
						System.out.println(max);
						System.out.println("The elements in the array after extraction:");
					    PqArr.display();
					};
				};
				if (s == 2)
				{
					System.out.println("Insert a new item to the array:");
					int newItem = Integer.parseInt(new Scanner(System.in).nextLine());
				    PqArr.insert(newItem);
					System.out.println("The elements in the array after insertion:");
					PqArr.display();
				};
				System.out.println("Enter 1 for extract maximum element, 2 for Insert");
				s = Integer.parseInt(new Scanner(System.in).nextLine());
			}
		}
	}


	
	
		
