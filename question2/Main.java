package question2;

import java.util.Scanner;

import question2.Nodes.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		//Nodes.BinarySearchTree tree = new Nodes.BinarySearchTree();
		
	        BinarySearchTree tree = new BinarySearchTree();

	        tree.insert(40);
	        tree.insert(20);
	        tree.insert(60);
	        tree.insert(10);
	        tree.insert(30);
	        tree.insert(50);
	        tree.insert(70);
	        
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the sum u wat to find");
				int target = sc.nextInt();

				tree.isPairPresent(tree.root, target);
			}
		}
	}

