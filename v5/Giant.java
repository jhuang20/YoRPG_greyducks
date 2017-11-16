// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13
 
public class Giant extends Monster {
   
    public Giant() {
	this.name = name;
	health = 200;
	strength = 75;
	defense = 25;
	atkRate = 0.5;
    }
    public String about() {
	return "the mean green killing machine is after you! Good luck on your gith against this powerful opponent!";
    }
}
