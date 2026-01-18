package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

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
    	Stream.of(clues).forEach((clue)-> System.out.println(clue));
    	String spy = null;
    	ArrayList<CharSequence> names = new ArrayList<CharSequence>();
    	ArrayList<String> evidence = new ArrayList<String>();
    	HashMap<CharSequence, Integer> map = new HashMap<>();
    	String regex = "I saw (\\w*)";
    	Pattern pattern = Pattern.compile(regex);
   
    	while( train.getHead().getNext() != null) {
    	
    		//names.add(train.getHead().getValue().toString().subSequence(0, train.getHead().getValue().toString().length()));
    
    		String rest = (String)(train.getHead().getValue().questionPassenger().subSequence(37, train.getHead().getValue().questionPassenger().length()));
    		evidence.add(rest.toString());
    	
    		System.out.println("string: " + rest);
    		train.setHead(train.getHead().getNext());
    		
    		Matcher matcher = pattern.matcher(rest);
    		if(matcher.find()) {
    			System.out.println(matcher.group(1));
    			
    		}
    		
    		names.add(matcher.group(1));
    	}
    	for( int n = 0; n < names.size(); n++) {
    		map.put(names.get(n), 0);
    		
    		}
    	for( int n = 0; n < evidence.size(); n++) {
    		for( int i = 0; i < clues.length; i++) {
    	    	if( evidence.get(n).contains(clues[i])) {
    	    	//	System.out.println(names.get(i));
    	    	
    	    //	System.out.println(map);
    	    		for(CharSequence name : map.keySet()) {
    	    	    	if( evidence.get(n).contains(name)) {
    	    	    	
    	    	    		map.put(name, map.get(name)+1);
    	    	  
    	    	    		
    	    	    	}
    	    		}
    	    	}
    		}
    		
    		
    	}
    	
    	int mostMentions = 0;
    	for(CharSequence name : map.keySet()) {
    		
    		map.get(name );
    		System.out.println("name "+name+" metnions "+map.get(name));
//    		if(  != map.size()-1) {
//    		System.out.println("name next mentions"+name+" "+map.get(name));
//    		}
    		if( map.get(name) > mostMentions ){
    			spy = name.toString();
    			mostMentions = map.get(name);
    			System.out.println(name.toString());
    			//break;
    		}
    	}
    
 
        return spy;

    }
    
    
    
    
   

}
