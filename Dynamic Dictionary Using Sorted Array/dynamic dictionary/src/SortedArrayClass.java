

import java.util.*;

public class SortedArrayClass
{
	public static int[] arr;
	private int arraySize;

	public SortedArrayClass(int scale)
	{
		arr = new int[scale];
		arraySize = 0;
	}

	public final int get(int i)
	{
		return arr[i];
	}

	public final int BinarySearch(int Key)
	{
		int k = 0;
		int lower = 0;
		int upper = arraySize - 1;
		while (lower < upper)
		{
			k = (lower + upper + 1) / 2;
			if (Key == arr[k])
				break;
			if (Key < arr[k])
				upper = k - 1;
			else
				lower = k + 1;
		};
		if (lower == upper) k = lower; 
		if (Key == arr[k])
			return k;
		else 
		{
			System.out.println("There is no such item!");
			return -1;
		}
	}

	public final void insertion(int Item)
	{
		if (arraySize == arr.length) 
			System.out.println("It is full!");
		else
		{
			int Key = Item; /*Item is used as the key here */
			if (arraySize == 0)
				arr[0] = Item;
			/* find the position for inserting the given key */	
		    int position = 0;
		    while (position < arraySize && Key > arr[position])
			   position++;	
		    
			for (int i = arraySize; i > position; i--)
				arr[i] = arr[i - 1];
			arr[position] = Item;
			arraySize = arraySize + 1;
		}
	}

	public final void deletion(int Key)
	{
		if (arraySize == 0)
			System.out.println("It is empty!");
		else
		{
			int position = BinarySearch(Key);
			if (position != -1)
			{
				for (int i = position; i < arraySize - 1; i++)
					arr[i] = arr[i + 1];
				arraySize = arraySize - 1;
			}
		}
	}
	
	
	public final void display()
	{
		if  (arraySize == 0) 
			System.out.println("It is empty!");
		else 
			for (int i = 0; i < arraySize; i++)
			{
				System.out.println(arr[i]);
			};
	}
	
}



