
public class Fish extends Animal {
	
	public Fish(int age, int weightInPounds, int heightInInches, String species) {
		super(age, weightInPounds, heightInInches, species);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("Swimming...");
	}

	public void move() {
		System.out.println("Fish is moving fins...");
	}
	
}
