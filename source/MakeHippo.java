abstract class Animal {
	private String name;

	public String getName(){
		return name;
	}

	public Animal(String theName){
		name=theName;
	}
}

class Hippo extends Animal{
	public Hippo(String name){
		super(name);
	}
}

public class MakeHippo{
	public static void main(String[] args){
		Hippo h = new Hippo("Hippie");
		System.out.println(h.getName());
	}
}
