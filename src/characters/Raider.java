package characters;

public class Raider {
	
	
	private String name;
	private int health;
	private int damage;
	
	
	
	public Raider(String name, int health, int damage) {
		super();
		this.name = name;
		this.health = health;
		this.damage = damage;
		
	}

	public String getName() {
		return name;
	}
	
	
	public int getDamage() {
		return damage;
	}

	public void output(String text) {
		System.out.println(characterOutput() + "<<" + text + ">>");
	}
	
	private String characterOutput() {
		
		return "Raider " + name + " : ";
	}
	
	public void attack(Leader guts) {
		System.out.println(name + "attacks" + guts.getName());
		guts.attackRecieved(damage/3);
	}
	
//@Override	
//	public String toString() {
//		return "Raider [name=" + name + ", health=" + health + ", damage=" + damage + "]";
//	}


	public static void main(String[] args) {
		
		
	}
	
	
}





