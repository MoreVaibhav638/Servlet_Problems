package oppS;

class Test
{
   public void access(int i)
   {
	   System.out.println("byte is executed :"+i);
   }
   public void access(short b)
   {
	   System.out.println("short is executed :"+b);
   }
}
public class Main1 {

	public static void main(String[] args)
	{
	   Test t1 = new Test();
	   t1.access(15); 
	   
	}
}

