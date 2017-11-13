 // Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW30 -- Ye Olde Role Playing Game, Expanded
 // 2017-11-13
 
 public class Knight extends Character {
	 
	 public Knight (String name) {
		 this.name = name;
		 health = 300;
		 strength = 50;
		 defense = 50;
		 atkRate = 0.5;
	 }
	 
	 public void specialize() {
		 defense = 75;
		 strength = 75;
	 }
	 
	 public void normalize() {
		 defense = 50;
		 strength = 50;
	 }
	 
 }