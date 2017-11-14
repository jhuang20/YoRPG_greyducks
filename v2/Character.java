 // Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW30 -- Ye Olde Role Playing Game, Improved
 // 2017-11-10

/*public class Character {
	
    //instance vars
    public int health;
    public int strength;
    public int defense;
    public double atkRate;*/

    /*public boolean isAlive() {
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
		}*/
    public class Character
{

  //this feels like a bad idea... but the compiler made me do it!
  public int _hitPts;
  public int _strength;
  public int _defense;
  public double _attack;


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public int getDefense() { return _defense; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    boolean isAlive() -- tell whether I am alive
    post: returns boolean indicated alive or dead
    =============================================*/
  public boolean isAlive()
  {
    return _hitPts > 0;
  }


  /*=============================================
    void lowerHP(int) -- lowers life by input value
    pre:  Input >= 0
    post: Life instance var is lowered by input ammount.
    =============================================*/
  public void lowerHP( int damageInflicted )
  {
    _hitPts = _hitPts - damageInflicted;
  }


  /*=============================================
    int attack(Protagonist) -- simulates attack on a Protagonist
    pre:  Input not null
    post: Calculates damage to be inflicted, flooring at 0.
    Calls opponent's lowerHP() method to inflict damage.
    Returns damage dealt.
    =============================================*/
  public int attack( Character opponent )
  {
    int damage = (int)( (_strength * _attack) - opponent.getDefense() );
    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
      damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }//end attack
    
	
}
