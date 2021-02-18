
public class DynamicDictionaryClass {
SortedArrayClass DD;
{
DD= new SortedArrayClass(20);
}
public int Search(int key)
{
	int x = DD.BinarySearch(key );
	if(x == 0)
		return -999999;
	else 
		return x;
	
	 
	}
public void Insertion (int item)
{
	DD.insertion (item);
	}
public void Deletion (int key)
{
	DD.deletion (key);
	}
public void Display()
{
	DD.display();
	}
}



