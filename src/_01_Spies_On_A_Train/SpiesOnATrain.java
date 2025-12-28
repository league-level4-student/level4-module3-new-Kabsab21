package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    
//    for(int i =0 ; i < clues.length; i++) {
//    	System.out.println(clues[i]);
//    }
//    
//    Node<TrainCar> current = train.getHead();
//    
//    do {
//    	System.out.println(current.getValue().questionPassenger());
//    	
//    	current = current.getNext();
//    	
//    }while(current.getNext() != null);
    	ArrayList<CharSequence> names = new ArrayList<CharSequence>();
    	ArrayList<String> evidence = new ArrayList<String>();
    
    	
    	
    	
    	
    	
    	
    	
    
    	while( train.getHead().getNext() != null) {
    		names.add(train.getHead().getValue().toString().subSequence(0, train.getHead().getValue().toString().length()));
    		System.out.println( train.getHead().getValue().questionPassenger() );
    		CharSequence rest = train.getHead().getValue().questionPassenger().subSequence(37, train.getHead().getValue().questionPassenger().length());
    		evidence.add(rest.toString());
    		train.setHead(train.getHead().getNext());
    		
    	}
    	
    	for( int n = 0; n < evidence.size(); n++) {
    		for( int i = 0; i < names.size(); i++) {
    	  //  	System.out.println(	names.get(i) );
    	    	if( evidence.get(n).contains(names.get(i))) {
    	    		System.out.println(names.get(i));
    	    	}
    		}
    		
    	}
    
    	
    	
    	
    	
    	
    	
    	
 
    	
        return "";

    }

}
