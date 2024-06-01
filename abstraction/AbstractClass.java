package abstraction;

abstract class Vechile{
	abstract void Speed();
	public void type() {
		System.out.println("Ferrari is a sport car");
	}
}
class BMW extends Vechile{//inherit
	public void Speed() {
		System.out.println("BMW is Luxurious Car");
	}
}
public class AbstractClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW car = new BMW();
		car.Speed();
		car.type();
		

	}

}
