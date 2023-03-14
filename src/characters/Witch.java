package characters;

public class Witch {
	
	private String name;
	private int health;
	private int damage;
	private int potionEffectMin;
	private int potionEffectMax;
	
	
	public Witch(String name, int health, int damage, int potionEffectMin, int potionEffectMax) {
		super();
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.potionEffectMin = potionEffectMin;
		this.potionEffectMax = potionEffectMax;
		output("My potions can cause damage from " + potionEffectMin + " up to " + potionEffectMax);
	}

	
	public void output(String text) {
		System.out.println(characterOutput() + "<<" + text + ">>");
	}


	private String characterOutput() {
		return "Witch " + name + " : ";
	}
	
	
	
}

