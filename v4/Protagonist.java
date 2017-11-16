// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, expanded
// 2017-11-13
 
public abstract class Protagonist extends Character {
    private String _name = "James";
    public Protagonist() {
	health = 125;
	strength = 40;
	defense = 20;
	atkRate = 0.5;
    }
    public Protagonist (String name) {
	this();
	_name = name;
    }
    
    public abstract String about();
    public abstract void normalize();
    public abstract void specialize();

    public String getName() {
	return name;
    }

    
}//end class Protagonist
