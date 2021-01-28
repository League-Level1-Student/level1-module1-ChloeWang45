package _06_duck;

public class Duck {

	int numberOfFriends;
	String favoriteFood;
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	void quack() {
		System.out.println("Duck: 'quack quack'");
	}
	
	void waddle() {
		System.out.println("Duck: waddles around");
	}
}
