package oppS;
class B
{
	  public void access(Integer x) 
	  {
	    System.out.println("Autoboxing is invoked :"+x);
	  }

	  public void access(long x)  
	  {
	    System.out.println("Widening is invoked :"+x);
	  }
}
public class Main3 {

	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.access(15);

	}

}
