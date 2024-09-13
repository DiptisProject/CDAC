package Assignment5;
//question 3
public class Animal {
	
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name+ " is eating");
	}
    
	public void sleep() {
		System.out.println(name+ " is sleeping");
	}
}
