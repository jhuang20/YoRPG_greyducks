// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08
 
public class Protagonist extends Character{
    //instance vars
    private String name;
    private int health;
    private int strength;
    public int defense;
    private double atkRate;
    //constructor : takes string input to name the protagonist
    public Protagonist (String name) {
	this.name = name;
	//default attributes
	health = 125;
	strength = 100;
	defense = 40;
	atkRate = 0.4;
    }
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

    //retrieves the value of the "name" variable
    public String getName() {
	return name;
    }
        //specialize() -- decreases your defense but increases your attack
    public void specialize() {
	defense -= 20;
	strength += 50;
    }
    //normalize() -- returns you back to your original state after you specialize
    public void normalize() {
	defense += 20;
	strength -= 50;
    }
	 
}
