package _05_Intro_to_AVL_Trees;

import _03_Intro_to_Binary_Trees.BinaryTree;
import _03_Intro_to_Binary_Trees.Node;

public class AVLTreeDemo {

    /*
     * An AVLTree is a special BinaryTree that is capable of balancing itself.
     * With a regular binary tree, depending on the elements inserted, you might
     * have a root with one very long right branch and one very long left branch
     * with nothing else in between.
     * 
     * 1.) Read through the AVLNode and AVLTree. Notice that the methods are
     * similar to those in BinaryTree with two important distinctions:
     * 
     * a) Each Node has a balance factor that keeps track of how many levels
     * "down" it is relative to the rest of the tree.
     * 
     * b) There are "rotate" helper methods used when a given node gets too
     * unbalanced(> 1 level out of sync with the rest of the tree) to rotate
     * branches back into place.
     * 
     * 2.) Create a BinaryTree and an AVLTree.
     * 
     * 3.) Insert the same values into both trees and observe how they differ
     * using the print method. Make sure the values you pick unbalance the
     * binary tree.
     * 
     * 4.) Try removing elements from both and see how they change using one of
     * the print methods.
     */

    public static void main(String[] args) {
    	BinaryTree<Integer> tr = new BinaryTree<Integer>();
    	AVLTree<Integer> ee = new AVLTree<Integer>();
    	
    	tr.insert(5);
    	Node<Integer> cowa = tr.getRoot();
    	cowa.setLeft(new Node<Integer>(6));
    	cowa.setRight(new Node<Integer>(7));
    	
    	cowa.getLeft().setLeft(new Node<Integer>(10));
    	ee.insert(5);
    	
    	AVLNode<Integer> bunga = ee.getRoot();
    	bunga.setLeft(new AVLNode<Integer>(6));
    	bunga.setRight(new AVLNode<Integer>(7));
    	bunga.getLeft().setLeft(new AVLNode<Integer>(10));
    
    	System.out.println("Binary tree:");
    	tr.printVertical();
    	System.out.println("AVL tree:");
    	ee.printVertical();
    	
    	ee.delete(5);
    	tr.delete(5);
    	
    	System.out.println(" post delete ");
    	
    	System.out.println("Binary tree:");
    	tr.printVertical();
    	System.out.println("AVL tree:");
    	ee.printVertical();
    	
    	ee.delete(6);
    	tr.delete(6);
    	
    	System.out.println(" post post delete ");
    	
    	System.out.println("Binary tree:");
    	tr.printVertical();
    	System.out.println("AVL tree:");
    	ee.printVertical();
    	
    	
    }

}
