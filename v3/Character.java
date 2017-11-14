// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW31 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

public class Character {
	
    public int health;
    public int strength;
    public int defense;
    public double atkRate;
    public String name;

    public int getDefense() {
	return defense; 
    }
 
    public boolean isAlive() { 
	return health > 0; 
    }

    public void lowerHP (int damageInflicted) { 
	health = health - damageInflicted;
    }

    public int attack ( Character opponent ) {
	int damage = (int)((strength * atkRate) - opponent.getDefense());
	opponent.lowerHP (damage);
	return damage;
    }
	
    //Class Description
    public String aboutClass (int isClass) {
	if (isClass == 1) {
	    return "\n An honorable warrior that will slay all evil beings. \n";
	}
	else if (isClass == 2) {
	    return "\n A wizard trained in the arts of magic. \n";
	}
	else if (isClass == 3) {
	    return "\n A marksman from the woods that hunts for a living. \n";
	}
	else {
	    return "";
	}
    }
	
    //Monster Description
    public String aboutMonster (int isMonster) {
	if (isMonster == 1) {
	    return "\n It's a Dragon! The firebreathing terror we all fear the most! \n";
	}
	else if (isMonster == 2) {
	    return "\n Look out! It's a Giant! Make sure to keep an eye on its giant club! \n";
	}
	else {
	    return "\n It's just a Goblin! We should be okay as long as we're careful... \n";
	}
    }
}
