// Team Greyducks -- Addison Huang, James Huang, Frank Chen
// APCS1 pd1
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2017-11-13

/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Protagonist and a Monster will be instantiated...
    private Protagonist pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
    private int playerClass; //Added this for HW30
    private int monsterClass; //Added this for HW30
    private int playerSpecial;//added for hw30
    private String monsterName;
    public String name;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Protagonist
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	String starter="";
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	
        	
	/*//instantiate the player's character
	  pat = new Protagonist();//should give pat attributes from Protagonist( name)*/
	s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	//Choosing your class
	s = "Choose your class: \n";
	s += "\t1: Knight \n";
	s += "\t2: Mage \n";
	s += "\t3: Archer \n";
	s += "Selection:";
	System.out.print( s );
	
	try {
	    playerClass = Integer.parseInt (in.readLine());
	}
	catch ( IOException e ) { }
	//Class confirmation
	if (playerClass == 1) {
	    pat = new Knight(name);//
	}
	else if (playerClass == 2) {
	    pat = new Mage(name);//
	}
	else {
	    pat = new Archer(name);//
	}
	s= "A kind anonymous soul has bestowed upon you a gift! Choose wisely from one of the gifts";
	s+="\n 1. Health Freak: health boost(gain 30% health) (side effect: lose 15% defense and offense) \n";
	s+="\n 2. Strong Boi: weapon boost(gain 30% offense)(side effect: lose 25% defense) \n";
	s+="\n 3. Tank: defense boost(gain 50% defense) (side effect: lose 25% health and offense) \n";
	s+="\n 4. I don't believe in potions \n";
	s+="Selection: ";
	System.out.print(s);
	try {
	    playerSpecial=Integer.parseInt(in.readLine());
	    
	}
	catch (IOException e) { }
	if (playerSpecial==1) {
	    pat.health=(int) (1.3*pat.health);
	    pat.defense=(int) (.85*pat.defense);
	    pat.strength=(int) (.85*pat.strength);
	}
	else if (playerSpecial==2) {
	   
	    pat.defense=(int) (.75*pat.defense);
	    pat.strength=(int) (1.3*pat.strength);
	}
	else if (playerSpecial==3) {
	    pat.health=(int) (.75*pat.health);
	    pat.defense=(int) (1.5*pat.defense);
	    pat.strength=(int) (.75*pat.strength);
	}
	s="Your player stats";
	s+="\n Your name:"+name;
	s+="\n Potion pack:"+playerSpecial;
	s+="\n Health:"+pat.health;
	s+="\n Offense:"+pat.strength;
	s+="\n Defense:"+pat.defense;
	System.out.print(s);
	System.out.println( pat.aboutClass(playerClass) );
	
	
   
    }//end newGame()
    


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Protagonist pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );
		
		
	    //Monster Randomization Process
	    monsterClass = (int)(Math.random() * 10);
		
	    if (monsterClass <= 1) {
		smaug = new Dragon ();//
		monsterName = "The Dragon";
	    }
	    else if (monsterClass <= 5) {
		smaug = new Giant ();//
		monsterName = "The Giant";
	    }
	    else {
		smaug = new Goblin ();//
		monsterName = "The Goblin";
	    }
	    System.out.println( smaug.aboutMonster(monsterClass) ); 

	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "\n" + monsterName + " attacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

    
	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
	 
    }//end main

}//end class YoRPG


