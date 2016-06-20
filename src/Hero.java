import java.util.Scanner;

public class Hero {
	public int health;
	public int damage;
	public String name;

	static Scanner userInput = new Scanner(System.in);
	
	public Hero(int health, int damage, String name) {
		this.health = health;
		this.damage = damage;
		this.name = name;
		
		setName();
	}

	
	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setName() {
		
	}


	public static void main(String[] args) {
		Hero yourHero = new Hero(100,20,"waki waki");
		System.out.println(yourHero);
	}
	
	
}
