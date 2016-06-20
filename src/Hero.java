import java.util.Scanner;

public class Hero {
	public int health;
	public int damage;
	public String name;
	public boolean hasName = false;
	public boolean alive = true;
	
	static Scanner userInput = new Scanner(System.in);
	
	public static boolean swingHit = false;
	
	public Hero() {
		
		setHealth(100);
		setDamage(20);
		
		if(userInput.hasNextLine()) {
			
			if(hasName == false) {
				
				hasName = true;
				this.setName(userInput.nextLine());
			}
		}	
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
		System.out.println("Your heros name is " + this.name);
	}
	
	public static void swing(Hero anyHero, evilHero targetHero) {
		int randomNumber = (int) (Math.random() * 2) + 1;
		
		System.out.println(anyHero.getName() + " swings");
		System.out.println(randomNumber);
		if(randomNumber == 1) {
			targetHero.health -= anyHero.damage;
			System.out.println(anyHero.name + " hits " + targetHero.name + " for " + anyHero.damage);
		}
		else {
			System.out.println(anyHero.name + " missed");
		}
		
	}
	

	public static void main(String[] args) {
		System.out.println("welcome to my text rpg game");
		System.out.println("Enter a name for your Hero:");
		
		Hero yourHero = new Hero();
		evilHero theEnemy = new evilHero();
		
		if(userInput.hasNext("health")) {
						
			System.out.println(yourHero.name+"'s health is  " + yourHero.health);
			userInput.hasNextLine();
				
		}
		else if(userInput.hasNext("swing")){
				swing(yourHero, theEnemy);
		}
		userInput.hasNextLine();
	}
		
	
	
}
