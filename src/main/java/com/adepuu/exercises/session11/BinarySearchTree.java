package com.adepuu.exercises.session11;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class BinarySearchTree {
    /**
     * Write a Java binary search tree program that can scale dynamically
     * <p>
     * As a user, I want to insert N-numbers into a binary search tree and then search for a specific number. After searching, the program should prompt me to search for another number without terminating.
     * <p>
     * Acceptance Criteria:
     * - The program should start by prompting the user to enter the number of elements (N) they wish to insert into the binary search tree.
     * - The program should then prompt the user to enter N numbers one by one.
     * <p>
     * Acceptance Criteria:
     * - The program should correctly insert each number into the binary search tree in a way that maintains the binary search tree properties (all nodes in the left subtree are less than the root, and all nodes in the right subtree are greater than the root).
     * - The program should handle duplicate numbers appropriately, either by ignoring them or by updating the existing node.
     * - After inserting all N-numbers, the program should prompt the user to enter a number to search for within the binary search tree.
     * - The program should perform a binary search to find the entered number, following the binary search tree properties.
     * - The program should display whether the number is found or not.
     * - The program should provide a clear and straightforward way for the user to exit the continuous search loop and terminate the program, such as entering a specific keyword or command.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTrees binaryTrees = new BinaryTrees();

        System.out.print("Enter the number element you want to insert: ");
        int numElement = scanner.nextInt();
        System.out.println("Enter " + numElement + " element");

        for (int i = 0; i < numElement; i++) {
            int nodeValue = scanner.nextInt();
            binaryTrees.insert(nodeValue);
        }

        while (true){
            System.out.println("Enter a number you want to search [-1 to terminate]");
            int searchElement = scanner.nextInt();

            if (searchElement == -1){
                break;
            }

            boolean foundElement = binaryTrees.search(searchElement);
            if (foundElement){
                System.out.println("The element " + searchElement + " is present inside the binary trees \n");
            } else {
                System.out.println("There is no element " + searchElement + " inside the binary trees \n");
            }
        }

        scanner.close();

    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTrees {
    private TreeNode root;

    public BinaryTrees(){
        this.root = null;
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(TreeNode root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.data) {
            return true;
        } else if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }
}

