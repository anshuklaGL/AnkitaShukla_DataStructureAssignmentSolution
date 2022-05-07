package com.greatlearning.SkewedTree.service;

public class BSTToSkewed {

	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	public void convertToSkewed(Node root) {

		// First Case
		if (root == null) {
			return;
		}

		convertToSkewed(root.left);

		Node rightNode = root.right;
		Node leftNode = root.left;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		convertToSkewed(rightNode);

	}

	public void traverseSkewedRight(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseSkewedRight(root.right);
	}

}
