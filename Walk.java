package strategyexample;

public class Walk implements Behaviour {

	@Override
	public void run(int dist) {
		System.out.println(" I walk " + dist + " meters");
	}

}
