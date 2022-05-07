package kr.hs.dgsw.java.dept1.d0427;

public class Zoo {
	
	public void bread(Animal animal) {
		animal.printSound();
	}
	
//	public void bread(Cat cat) {
//		cat.printSound();
//	}
//	
//	public void bread(Horse horse) {
//		horse.printSound();
//	}

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Dog dog = new Dog();
		zoo.bread(dog);
		
		Cat cat = new Cat();
		zoo.bread(cat);
		
		Horse horse = new Horse();
		zoo.bread(horse);
	}
}
