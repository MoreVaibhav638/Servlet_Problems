package oppS;

class C
{
	  public void access(Integer x) 
	  {
	    System.out.println("Autoboxing is invoked :"+x);
	  }

	  public void access(int ...x) 
	  {
	    System.out.println("Var-Args is invoked :"+x);
	  }
}
public class Main4 {

	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.access(15);

	}

}