package oppS;

interface Course
{
	void course();
}

interface Faculty
{
	void faculty();
}
class Impl implements Course,Faculty
{
	@Override
	public void course() {
		System.out.println("Course");
	}
	
	@Override
	public
	void faculty() {
		System.out.println("Faculty");
	}
}
public class Abstract
{
	public static void main(String[] args) {
		Impl impl = new Impl();
		impl.course();
		impl.faculty();
	}
}