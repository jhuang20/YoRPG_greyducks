 // Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW30 -- Ye Olde Role Playing Game, Expanded
 // 2017-11-13

public class Character {
	
    //instance vars
    protected int health;
    protected int strength;
    protected int defense;
    protected double atkRate;
	protected String name;

    public boolean isAlive() {
		return (health > 0);
    }
	
    //retrieves the value of the "defense" variable
    public int getDefense() {
		return defense;
    }
	
    //retrieves the value of the "name" variable
    public String getName() {
		return name;
    }
	
    //lowers your "health" by a specified amount(by subtracting the damage from health)
    public void lowerHP (int damage) {
		health -= damage;
    }
	
    //attack(Monster x)-- sets the damage of the Character(Object type character),using the specified formula
    public int attack (Character x) {
		int damage = (int)( (strength * atkRate) - x.getDefense() );//calculates the amount of damage you take
		x.lowerHP(damage);//lowers YOUR hp by "damage"
		return damage;//returns the amount of damge done
    }
	
	//Methods to be filled by classes
	public void specialize() {
	}
	
	public void normalize() {
	}
	
	//Choosing your class
	public String about (int isClass) {
		if (isClass == 1) {
			return "\n An honorable warrior that will slay all evil beings. \n";
		}
		else if (isClass == 2) {
			return "\n A wizard trained in the arts of magic. \n";
		}
		else if (isClass == 3) {
			return "\n A marksman from the woods that hunts for a living. \n";
		}
		else {
			return "";
		}
	}
}
