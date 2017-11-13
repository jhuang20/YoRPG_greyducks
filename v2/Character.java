 // Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW30 -- Ye Olde Role Playing Game, Improved
 // 2017-11-10

public class Character {
	
    //instance vars
    public int health;
    public int strength;
    public int defense;
    public double atkRate;

    public boolean isAlive() {
		return (health > 0);
    }
	
    //retrieves the value of the "defense" variable
    public int getDefense() {
		return defense;
    }
		
    //lowers your "health" by a specified amount(by subtracting the damage from health)
    public void lowerHP (int damage) {
		health -= damage;
    }
	
    //attack(Character x)-- sets the damage of the Character(Object type character),using the specified formula
    public int attack (Character x) {
		int damage = (int)( (strength * atkRate) - x.getDefense() );//calculates the amount of damage you take
		x.lowerHP(damage);//lowers YOUR hp by "damage"
		return damage;//returns the amount of damge done
    }
	
}
