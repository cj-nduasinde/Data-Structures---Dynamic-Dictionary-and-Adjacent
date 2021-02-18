
public class PriorityQUsingHeapClass {
MaxHeapClass PQ;
{
	PQ= new MaxHeapClass();
	}
public void extract()
{
	PQ.extractMax();
	}
public void insert(int item)
{
	PQ.heapInsert(item);
}
public void display()
{
	PQ.printHeap();
	}
}
