package characters;

public class Worrior {
	
	private String name;
	private int health;
	private int damage;
	private int potionEffect = 1;
	
	public Worrior(String name, int health, int damage, int potionEffect) {
		super();
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.potionEffect = potionEffect;
	}
	
	public String getName() {
		return name;
	}
	
	public void output(String text) {
		System.out.println(characterOutput() + "<<" + text + ">>");
	}

	private String characterOutput() {
		
		return "Worrior" + name + " : ";
	}
	
	public void attack(Leader guts) {
		System.out.println(name + "attacks" + guts.getName());
		guts.attackRecieved(damage/3);
	}
	
	
}
