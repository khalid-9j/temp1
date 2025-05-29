
public class Animal {
	String habitat;
	String sound;
	double weight;
	
	public Animal(String habitat, String sound, double weight) {
		this.habitat = habitat;
		this.sound = sound;
		this.weight = weight;
	}
	
	public Animal() {}
	
@Override
	public String toString() {
		return "Animal [habitat=" + habitat + ", sound=" + sound + ", weight=" + weight + "]";
	}

public static void main (String args []) {
	Animal dog = new Animal("street", "bow-bow", 20);
	Animal lion = new Animal("forest", "roar", 60);
	Animal cat = new Animal("home", "mew-mew", 10);

	System.out.println(dog.toString());
}
}