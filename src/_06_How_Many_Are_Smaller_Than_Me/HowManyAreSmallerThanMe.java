package _06_How_Many_Are_Smaller_Than_Me;

import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

    /*
     * Given an AVLTree filled with the random numbers from 1 to 20, and a
     * single number within the AVL Tree, figure out how many numbers in the
     * AVLTree are smaller than the provided number and return the result.
     * 
     * You may want to create a helper method to search through the AVLTree and
     * count iteratively or recursively.
     */

    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
    	int smaller = 0;
    	System.out.println(me);
    	avlTree.printVertical();
    	
    	int r = alltoleftof(smaller, avlTree, me);	
    	int ar = getsmaller( avlTree, me);
    	smaller = r + ar;
    	
    	 
    	System.out.println("smaller children "+r);	
    	System.out.println("smaller probably not chudren"+ar);	
    
        return smaller;

    }
    
    int alltoleftof(int smaller, AVLTree<Integer> avlTree, int me) {
    	AVLNode<Integer> n = avlTree.search(me).getLeft();
    	
    	while(n != null ) {
    		n = n.getLeft();
    	
    		smaller = smaller +1;
    	}
    	return smaller;
    }
    
    int getsmaller( AVLTree<Integer> avlTree, int me) {
    	AVLNode<Integer> n = avlTree.getRoot();
    	AVLNode<Integer> m = avlTree.getRoot();
    	int ar = 0;
    	
    	while(n != null ) {
    		System.out.println("jajajajja "+n.getValue());
    		
    		if( n.getValue() < me) {
    			ar= ar+1;
    			System.out.println("ar added 1");
    			if( n.getRight() != null && n.getRight().getValue() < me ) {
    				ar = ar+1;
    				System.out.println("ar added 2");
    			}
    		}
    		
    		n = n.getLeft();

    	}
    	
    	while(m != null ) {
    		System.out.println("jajajajja r"+m.getValue());
    		
    		if( m.getValue() < me && m != avlTree.getRoot()) {
    			ar= ar+1;
    			System.out.println("ar added 1");
    			
    			if(  m.getLeft() != null && m.getLeft().getValue() < me && m != avlTree.getRoot()) {
    				ar = ar+1;
    				System.out.println("ar added 2");
    			}
    			
    		}
    		
    		
    		
    		m = m.getRight();

    	}
    	
    	
    	return ar ;
    }
    
   
   
    	
    

}
