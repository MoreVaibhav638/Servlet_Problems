package oppS;

class A
{
	public void access(String x)
	  {
	    System.out.println("String is invoked :"+x);
	  }

	  public void access(Object x)
	  {
	    System.out.println("Object is invoked :"+x);
	  }
}
public class Main2 
{
   public static void main(String[] args) 
   {
	  A a1 = new A(); 
	  a1.access("Ravi");
	  a1.access(null);
   }
}
