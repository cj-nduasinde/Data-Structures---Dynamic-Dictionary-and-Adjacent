public class PriorityQUsingSortedArrayClass {
SortedArrayClass PQ;
PriorityQUsingSortedArrayClass()
{
	PQ= new SortedArrayClass(100);
	}
public int extract()
{
	int x = PQ.extractMax();
	return x;
	}
public void insert(int item)
{
	PQ.insertion(item);
}
public void display()
{
	PQ.display();
	}
}




