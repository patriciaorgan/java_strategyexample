package strategyexample;

public class Swim implements Behaviour {

	@Override
	public void run(int dist) {
		System.out.println(" I swim " + dist + " meters");
	}
}

