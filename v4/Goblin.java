// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13
 
public class Goblin extends Monster {
	
    public Goblin () {
	this.name = name;
	health = 100;
	strength = 25;
	defense = 25;
	atkRate = 1.5;
    }
    public String about() {
	return "A nuisance on your travel has appeared. The legendary goblin will make your day a terrible one, can you emerge unscathed?";
    }
	
}
