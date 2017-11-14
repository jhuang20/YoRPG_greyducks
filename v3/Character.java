// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

public class Character {
    public int health;
    public int strength;
    public int defense;
    public double atkRate;


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return defense; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive()
    {
	return health > 0;
    }


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted )
    {
	health = health - damageInflicted;
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
	int damage = (int)( (strength * atkRate) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack

	
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
