// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, expanded
// 2017-11-08
 
public class Protagonist extends Character
{
    public String name;


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Protagonist()
    {
        health = 125;
	strength = 100;
	defense = 40;
	atkRate = .4;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Protagonist( String _name ) {
	this();
	name = _name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      int attack(Monster) -- simulates attack on instance of class Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
      Calls opponent's lowerHP() method to inflict damage. 
      Returns damage dealt.
      =============================================*/
    public int attack( Monster opponent )
    {

	int damage = (int)( (strength * atkRate) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack


    //prepare a Protagonist for a special attack
    public void specialize()
    {
	atkRate = .75;
	defense = 20;
    }


    //revert to normal mode
    public void normalize()
    {
	atkRate = .4;
	defense = 40;
    }

}//end class Protagonist
