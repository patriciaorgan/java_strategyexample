package strategyexample;



public abstract class Animal {

	protected Behaviour behaviour;

	public void setBehaviour(Behaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	public void move(int dist){
		
		System.out.println("I am a "+ this.getClass().getSimpleName());
		this.behaviour.run(dist);
	}
}



