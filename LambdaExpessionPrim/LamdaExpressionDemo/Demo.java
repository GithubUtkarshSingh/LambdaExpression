package LamdaExpressionDemo;
interface S
{
	public int Square(int n);
}
/*class S1 implements S
{
	public int Square(int n)
	{
		return n*n;
	}
}*/
public class Demo 
{
	public static void main(String[] args) 
	{
		/*S s=new S1();
		s.Square(45);*/
		
		S i=(n)->n*n;
		System.out.println(i.Square(10));
	}

}
