package _06_duck;

public class Runner {

	public static void main(String[] args) {
		
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		Dog pluto = new Dog("fetch", 10);
		pluto.bark();
	}
}
