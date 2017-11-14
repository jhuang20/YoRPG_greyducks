// Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW31 -- Ye Olde Role Playing Game, Expanded
 // 2017-11-13
public class Troll extends Monster {
    public Troll() {
	health=200;
	strength=25;
	defense=60;
	atkRate=1;
    }
    public static String about() {
	return "Ye olde troll from the fables. The legends have hinted at its prescence for ages. Do you have what it takes to slay ye monster?";
    }
}
