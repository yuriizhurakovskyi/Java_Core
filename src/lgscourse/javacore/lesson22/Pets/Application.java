package lgscourse.javacore.lesson22.Pets;

public class Application {

	public static void main(String[] args) {
		Pets cow = () -> System.out.println("ί κξπξβΰ- Μσσσ-Μσσσ");
		Pets cat = () -> System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
		Pets dog = () -> System.out.println("ί οερ- Γΰσσσ-Γΰσσσ");
		
		voice(cow);
		voice(cat);
		voice(dog);
	}
	
	private static void voice(Pets pet) {
		pet.voice();
	}

}
