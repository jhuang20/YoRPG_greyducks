 // Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW30 -- Ye Olde Role Playing Game, Expanded
 // 2017-11-13
 
 public class Knight extends Protagonist {
	 
	 public Knight (String name) {
		 this.name = name;
		 health = 300;
		 strength = 50;
		 defense = 50;
		 atkRate = 1.0;
	 }
	 
	 public void specialize() {
		 defense = 75;
		 strength = 75;
	 }
	 
	 public void normalize() {
		 defense = 50;
		 strength = 50;
	 }
	 public String about() {
return "Ye olde knight in shining armor. Has saved many a woman with his chivalry. HEalthy, young, and ready to fight.";
}
 }
