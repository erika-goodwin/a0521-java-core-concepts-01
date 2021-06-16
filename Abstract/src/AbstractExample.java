//interface DogInterface{
//	
////	void bark();
//	
//	public void bark() {
//		System.out.println("awooo!");
//	}
//}

abstract class Dog {
	String breed;
	
	public void bark() {
		System.out.println("Woof!");
	}
	
	public abstract void poop();
	
}

class Corgi extends Dog{

	@Override
	public void poop() {
		System.out.println("unchi");
		
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		
		Corgi dog = new Corgi();
		dog.bark();
		dog.poop();

	}

}
