package question2;

import java.util.ArrayList;

public class Nodes {
	static class Node {
		 
	    int data;
	    Node left, right;
	 
	    Node(int d)
	    {
	        data = d;
	        left = right = null;
	    }
	}
	 
	static class BinarySearchTree {
	 
	    // Root
	    Node root;

	    BinarySearchTree()
	    {
	        root = null;
	    }
	 
	    //Inorder traversal
	    void inorder()
	    {
	        inorderUtil(this.root);
	    }
	 
	    // Utility function for inorder traversal
	    void inorderUtil(Node node)
	    {
	        if (node == null)
	            return;
	 
	        inorderUtil(node.left);
	        System.out.print(node.data + " ");
	        inorderUtil(node.right);
	    }
	 
	    //calling insertRec()
	    void insert(int key)
	    {
	        root = insertRec(root, key);
	    }
	 
	    //recursive function
	    Node insertRec(Node root, int data)
	    {
	 
	        //If the tree is empty, return a new node
	        if (root == null) {
	            root = new Node(data);
	            return root;
	        }
	 
	      //else
	        if (data < root.data)
	            root.left = insertRec(root.left, data);
	        else if (data > root.data)
	            root.right = insertRec(root.right, data);
	 
	        return root;
	    }
	 
	    //adding values of BST into ArrayList
	    ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list)
	    {
	        // Base Case
	        if (node == null)
	            return list;
	 
	        treeToList(node.left, list);
	        list.add(node.data);
	        treeToList(node.right, list);
	 
	        return list;
	    }
	 
	    //if there is a pair present
	    boolean isPairPresent(Node node, int target)
	    {
	        ArrayList<Integer> a1 = new ArrayList<>();
	        ArrayList<Integer> a2 = treeToList(node, a1);
	 
	        int start = 0; 
	 
	        int end = a2.size() - 1; 
	 
	        while (start < end) {
	 
	            if (a2.get(start) + a2.get(end) == target) 
	            {
	                System.out.println("Pair is: " + "(" + a2.get(start) + " , " + a2.get(end) + ")");
	                return true;
	            }
	 
	            if (a2.get(start) + a2.get(end) > target) 
	            {
	                end--;
	            }
	 
	            if (a2.get(start) + a2.get(end) < target) 
	            {
	                start++;
	            }
	        }
	 
	        System.out.println("Nodes are not found!");
	        return false;
	    }
      }
}
