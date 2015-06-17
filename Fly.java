package strategyexample;

public class Fly implements Behaviour {

	@Override
	public void run(int dist) {
		System.out.println(" I fly " + dist + " meters");
	}
}

