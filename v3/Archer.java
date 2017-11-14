// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

public class Archer extends Protagonist {
	 
    public Archer (String name) {
		this.name = name;
		health = 100;
		strength = 50;
		defense = 25;
		atkRate = 2;
    }
	 
    public void specialize() {
		defense = 10;
		strength = 200;
    }
	 
    public void normalize() {
		defense = 20;
		strength = 100;
    }

}
