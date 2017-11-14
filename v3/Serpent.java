// Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW31 -- Ye Olde Role Playing Game, Expanded
 // 2017-11-13
public class Serpent extends Monster {
    public Serpent() {
	health=300;
	strength=50;
	defense=70;
	atkRate=3;
    }
    public static String about() {
	return "the old snek returns from your deepest nightmares into reality. Can you face this formidable slippery foe?";
    }
}
