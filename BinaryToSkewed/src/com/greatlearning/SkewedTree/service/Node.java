package com.greatlearning.SkewedTree.service;

public class Node {
	int val;
	public Node left;
	public Node right;

	// Null left and Right Pointers
	public Node(int item) {
		val = item;
		left = right = null;
	}

}
