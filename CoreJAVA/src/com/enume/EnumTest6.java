package com.enume;

enum Moviese {
	Pathaan, sir, Hit, Geme_over, Lost;
	}
	public class EnumTest6 {
	  public static void main(String[] args) {
	    System.out.println(EnumTest.getMovie("Sir"));
	  }
	  public static Movie getMovie(String s) {
	    return Enum.valueOf(Movie.class, s.toLowerCase());
	  }
	  public static Movie getMovie(int n){
	    return Movie.values()[n];
	  }
	}