package com.greatlearning.SkewedTree.driver;

import com.greatlearning.SkewedTree.service.BSTToSkewed;
import com.greatlearning.SkewedTree.service.Node;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTToSkewed tree = new BSTToSkewed();

		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		tree.convertToSkewed(tree.node);
		tree.traverseSkewedRight(tree.headNode);

	}

}
