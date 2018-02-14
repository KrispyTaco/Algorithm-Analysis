//Andy Huynh

import java.util.Scanner;

class Node {

	int num;
	Node left, right, next, prev;

	Node(int n) {
		num = n;
		left = right = null;
	}

}

class BST{
	 Node root;
	 Node next = root;
	 Node prev = root;
	 int min;
	 
	 Node arrToBST(int arr[], int first, int last){
	 if(first > last){
	 return null;
	 }
	 int m = (first + last)/2;
	 Node k = new Node(arr[m]);
	 k.left = arrToBST(arr, first, m-1);
	 k.right = arrToBST(arr, m+1, last);
	
	 return k;
	
	 }
	
	public Node search(Node root, int num) {

		
		if(root.num == num || root == null){
			if(num == min){
			System.out.println("1" + " " + root.num);
			return null;
			}
			else if(root.left != null){
				prev = root.left;
				System.out.println(prev.num + 1 + " " + root.num);
				return null;
			}
			else{
				System.out.println(prev.num + 1 + " "  + root.num);
				return null;
			}
		}
		if(num < root.num){
			if(num <= min && root.left == null){
				next = root;
				System.out.println("1" + " " + next.num);
				return null;
				
			}
			else if(root.left == null){
				next = root;
				System.out.println(prev.num + 1 + " " + next.num);
				return null;
		}
			else{
				next = root;
				root = root.left;
				return search(root, num);
			}
	}	
	
	if(num > root.num){
		if(root.right == null){
			prev = root;
			System.out.println(prev.num + 1 + " " + next.num);
			return null;
		}
		else{
			prev = root;
			root = root.right;
			return search(root, num);
		}
		}
	return null;
	}
}


public class cmsc401 {

	public static void main(String[] args) {
		BST balanced = new BST();
		Scanner in = new Scanner(System.in);
		int min;
		
		int sizeS = in.nextInt();
		int S[] = new int[sizeS + 1];

		int sizeW = in.nextInt();
		int W[] = new int[sizeW];

		S[0] = 0;
		for (int i = 1; i < sizeS + 1; i++) {
			S[i] = in.nextInt();
		}

		for (int i = 0; i < sizeW; i++) {
			W[i] = in.nextInt();
		}
		min = S[0];

		BST bsTree = new BST();
		Node root = bsTree.arrToBST(S, 0, sizeS);
		Node next = root;
		Node prev = root;

		System.out.println(sizeW);
		for (int i = 0; i < sizeW; i++) {
			int index = W[i];
			bsTree.search(root, index);

		}

	}

}
