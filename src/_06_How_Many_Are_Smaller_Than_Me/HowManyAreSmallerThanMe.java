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
    	
    	alltoleftof(smaller, avlTree, me);
    	
    	System.out.println("smaller nums "+smaller);	
        return smaller;

    }
    
    int alltoleftof(int smaller, AVLTree<Integer> avlTree, int me) {
    	AVLNode<Integer> n = avlTree.search(me).getLeft();
    	if( n != null) {
    		smaller = smaller + 1;
    	}
    	while(n != null ) {
    		n = n.getLeft();
    		System.out.println(n);
    		smaller = smaller +1;
    	}
    	return smaller;
    }
    
   
    	
    

}
