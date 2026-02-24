package org.example.tree;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        int diameter = ddiameterOfBinaryTree(root);
        System.out.println("Diameter of Binary Tree: " + diameter);

    }

    private static int ddiameterOfBinaryTree(TreeNode node) {
        int[] diameter = new int[1];
        height(node, diameter);
        return diameter[0];
    }

    private static int height(TreeNode node, int[] diameter) {
        if (node == null) return 0;
        int lh = height(node.left, diameter);
        int rh = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }

}
