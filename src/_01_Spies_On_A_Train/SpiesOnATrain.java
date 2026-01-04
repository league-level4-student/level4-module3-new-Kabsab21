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
    	String spy = null;
    	ArrayList<CharSequence> names = new ArrayList<CharSequence>();
    	ArrayList<String> evidence = new ArrayList<String>();
    	HashMap<CharSequence, Integer> map = new HashMap<>();
    
   
    	while( train.getHead().getNext() != null) {
    		names.add(train.getHead().getValue().toString().subSequence(0, train.getHead().getValue().toString().length()));
    
    		CharSequence rest = train.getHead().getValue().questionPassenger().subSequence(37, train.getHead().getValue().questionPassenger().length());
    		evidence.add(rest.toString());
    		System.out.println(rest);
    		train.setHead(train.getHead().getNext());
    		
    	}
    	for( int n = 0; n < names.size(); n++) {
    		map.put(names.get(n), 0);
    		
    		}
    	for( int n = 0; n < evidence.size(); n++) {
    		for( int i = 0; i < names.size(); i++) {
    	    	if( evidence.get(n).contains(names.get(i))) {
    	    	//	System.out.println(names.get(i));
    	    		map.put(names.get(i), map.get(names.get(i))+1);
    	    //	System.out.println(map);
    	    		
    	    	}
    		}
    		
    		
    	}
    	
    	for(int i = 0; i < map.size(); i++) {
    		
    		map.get(names.get(i));
    		System.out.println("name"+names.get(i)+" metnions"+map.get(names.get(i)));
    		if( i != map.size()-1) {
    		System.out.println("name next mentions"+names.get(i+1)+" "+map.get(names.get(i+1)));
    		}
    		if( map.get(names.get(i)) == 3) {
    			spy = names.get(i).toString();
    			System.out.println(names.get(i).toString());
    			break;
    		}
    	}
    
 
        return spy;

    }
    
    
    
    
   

}
