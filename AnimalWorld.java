package strategyexample;

public class AnimalWorld {

	public static void main(String[] args) {
		
		Jump jump = new Jump();
		Swim swim = new Swim();
		Walk walk = new Walk();
		
		Fox fox = new Fox();
		fox.move(5); //invoke default behaviour
		fox.setBehaviour(swim); //change behaviour
		fox.move(10); //invoke new behaviour
		
		Salmon salmon = new Salmon();
		salmon.move(20); //invoke default behaviour
		salmon.setBehaviour(jump);//change behaviour
		salmon.move(3);//invoke new behaviour
		
		Hare hare = new Hare();
		hare.setBehaviour(jump);//change behaviour
		hare.move(7);///invoke new behaviour 
		hare.setBehaviour(walk);//change behaviour
		hare.move(2);//invoke new behaviour
	}
}

