 // Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW28 -- Ye Olde Role Playing Game
 // 2017-11-08

public class Monster extends Character{
  //instace vars
  private int health;
  private int strength;
  private int defense;
  private double atkRate;
  
    //constructor that initializes instace vars
    public Monster() {
	health = 150;
	defense = 20;
	atkRate = 1;
    strength = (int)(Math.random() * 45) + 20;
  }
	
    //attack(Character x)-- sets the damage of the Character(Object type character),using the specified formula
    public int attack (Protagonist x) {
		int damage = (int)( (strength * atkRate) - x.getDefense() );//calculates the amount of damage you take
		x.lowerHP(damage);//lowers YOUR hp by "damage"
		return damage;//returns the amount of damge done
    }
}
