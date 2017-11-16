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
		 atkRate = 0.5;
	 }
	 
	 public void specialize() {
		 defense = 10;
		 strength = 160;
	 }
	 
	 public void normalize() {
		 defense = 20;
		 strength = 80;
	 }
	 public String about() {
return "He may be a man at the end of his years; in fact, he can barely get out of bed on a good day, but he sure knows the lay of land and the various spells that can be conjured out of thin air. DOn't underestimate this man.";
}
 }
