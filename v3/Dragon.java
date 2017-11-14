// Team Greyducks -- Addison Huang, James Huang, Frank Chen
 // APCS1 pd1
 // HW31 -- Ye Olde Role Playing Game, Expanded
 // 2017-11-13

public class Dragon extends Monster {

    public Dragon() {
	health = 500;
	strength = 50;
	defense = 50;
	atkRate = 2;
    }

    public static String about() {
	return "Ye olde dragon from the myths. It is reborn and stronger than ever. Do you have what it takes to slay ye monster?";
    }
}
	
