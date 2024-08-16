package com.enume;
enum Movies
{
	Pathaan, Sir,Hit, Geme_over, Lost;	
	Movies() {
	}
}
public class EnumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie movies[] = Movie.values();
		for(Movie mov : movies) 
		{
			System.out.println(mov);
		}
	}

}
