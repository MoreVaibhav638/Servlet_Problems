package oppS;

class Car
{
	static int speed;
	int accelerate;
}
class Vehicle extends Car
{
	public void accelerate(){
		speed = 100;
		accelerate = 50;
	}
}
class Toyota extends Car
{
	public void accelerate() {
		speed = 130;
		accelerate = 55;
	}
}
class Benz extends Car
{
	public void accelerate() {
		speed = 120;
		accelerate = 56;
	}
}

class Tata extends Vehicle
{
	public void accelerate() {
		super.accelerate();
	}
}
public class Poly
{
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		Car benz = new Benz();
		
		Car tata = new Tata();

		Toyota toyota = new Toyota();		
		System.out.println(vehicle.speed+benz.speed+tata.speed+toyota.accelerate);
	}
}