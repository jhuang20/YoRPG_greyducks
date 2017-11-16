// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

public abstract class Monster extends Character {

    public Monster() {
	this.name = name;
	health = 150;
	strength = 20 + (int)( Math.random() * 45 ); // [20,65)
	defense = 20;
	atkRate = 1;
    }

    public abstract String about();

}//end class Monster
