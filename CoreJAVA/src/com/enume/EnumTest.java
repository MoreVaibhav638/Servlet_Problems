package com.enume;
enum Movie
{
	Pathaan, Sir,Hit, Geme_over, Lost;
	Movie() {	
	}
	public void movieMethod() 
	{
		System.out.println(Movie.this);
	}
}

public class EnumTest {

	public static void main(String[] args) {
		Movie movie[] = Movie.values();
		movie[2].movieMethod();
	}

	public static char[] getMovie(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
