package binarySearchTree;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Let us create following BST 
		 * 		 50 
		 * 		/  \ 
		 * 	   30   70 
		 *    / \   / \ 
		 *  20  40 60 80
		 */
		Node root = null;
		root = BST.insert(root, 50);
		root = BST.insert(root, 30);
		root = BST.insert(root, 20);
		root = BST.insert(root, 40);
		root = BST.insert(root, 70);
		root = BST.insert(root, 60);
		root = BST.insert(root, 80);
		//root = BST.insert(root, 90);

		System.out.println("Inorder traversal of the " + "given tree");
		BST.inorder(root);

		System.out.println("\nDelete 80\n");
		root = BST.deleteNode(root, 80);
		System.out.println("Inorder traversal of the " + "modified tree");
		BST.inorder(root);

		System.out.println("\nDelete 30\n");
		root = BST.deleteNode(root, 30);
		System.out.println("Inorder traversal of the " + "modified tree");
		BST.inorder(root);
//
//		System.out.println("\nDelete 50\n");
//		root = BST.deleteNode(root, 50);
//		System.out.println("Inorder traversal of the " + "modified tree");
//		BST.inorder(root);

	}

}
