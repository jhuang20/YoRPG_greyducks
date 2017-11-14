 // Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW30 -- Ye Olde Role Playing Game, Expanded
 // 2017-11-13
 
 public class Mage extends Protagonist {
	 
	 public Mage (String name) {
		 this.name = name;
		 health = 100;
		 strength = 80;
		 defense = 20;
		 atkRate = 0.25;
	 }
	 
	 public void specialize() {
		 defense = 10;
		 strength = 160;
	 }
	 
	 public void normalize() {
		 defense = 20;
		 strength = 80;
	 }
	 
 }
