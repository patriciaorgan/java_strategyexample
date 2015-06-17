package strategyexample;

public class Jump implements Behaviour {

	@Override
	public void run(int dist) {
		System.out.println(" I jump " + dist + " meters");
	}
}

