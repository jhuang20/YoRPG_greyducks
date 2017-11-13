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
    private String name;
  
    //constructor that initializes instace vars
    public Monster() {
	this.name = name;
	health = 150;
	defense = 20;
	atkRate = 1;
    strength = (int)(Math.random() * 45) + 20;
  }
  
  //isAlive()--returns true if Monster still has health left
  public boolean isAlive() {
    return (health >0);
  }
//getDefense(),getName() are accessors that retrieve value of defense and value of name respectively.
  public int getDefense() {
    return defense;
  }
  public String getName() {
    return name;
  }
	//lowers your "health" by a specified amount(by subtracting the damage from health)
  public void lowerHP(int damage) {
    health-=damage;
  }
  //attack(Protagonist x)-- sets the damage of the protagonist(Object type protagonist),using the specified formula
  public int attack(Protagonist x) {
      int damage = (int)((strength * atkRate) - x.defense); //calculates the amount of damage you take
    x.lowerHP(damage); //lowers YOUR hp by "damage"
    return damage; //returns the amount of damge done
  }

  public static void main (String[] args) {
  }
}
