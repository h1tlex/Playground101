package characters;

public class Leader {
	
	private String name;
	private int health;
	private int damage;
	private Village village;
	
	public Leader(String name, int health, int damage) {
		super();
		this.name = name;
		this.health = health;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}
	
	
	public int getHealth() {
		return health;
	}


	
	public void healthSatuts() {
		System.out.println(characterOutput() + "Current health is " + getHealth());
	}
	
	public void output(String text) {
		System.out.println(characterOutput() + "<<" + text + ">>");
	}

	private String characterOutput() {
		
		return "Leader " + name + " from the village " + village.getName() + " : ";
	}
	
	public void attackRecieved(int attackDamage) {
		health-=attackDamage;
		if (health>0) {
			output("I'm hurt");
			healthSatuts();
		}
		else {
			output("Dead");
		}
	}
	
}
