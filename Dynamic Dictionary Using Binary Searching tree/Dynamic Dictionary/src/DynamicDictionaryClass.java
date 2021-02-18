
public class DynamicDictionaryClass {
BinarySearchTreeClass DD;
{
DD= new BinarySearchTreeClass();
}
public Node Search(int key)
{
	Node x= DD.Search(key);
	if (x==null) return x;
	else return x;
	}
public void Insert (int item)
{
	DD.Insert(item);
	}
public void Delete (int key)
{
	DD.Delete (key);
	}
public void Display()
{
	DD.InOrder(DD.root);
	}
}
