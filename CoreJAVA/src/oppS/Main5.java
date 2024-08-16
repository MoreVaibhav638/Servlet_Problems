package oppS;

interface NIT
{
  void department();
  default void course()
  {
    System.out.println("Java");
  }
}
class impl implements NIT
{
  public void department()
  {
    System.out.println("Software");
  }
  //override default method
  public void course()
  {
    System.out.println("Python");
  }
}
public class Abstract
{
  public static void main(String[] args)
  {
    Impl impl  = new Impl();
    impl.department();
    impl.course();
  }
}