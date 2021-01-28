package _06_duck;

public class Dog {

	int numberOfFriends;
	String favoriteActivity;
	
	Dog(String favoriteActivity, int numberOfFriends) {
	       this.favoriteActivity = favoriteActivity;
	       this.numberOfFriends = numberOfFriends;
	}
	void bark() {
		System.out.println("Dog: 'bark bark'");
	}
	
	void run() {
		System.out.println("Dog: runs around");
	}
}
