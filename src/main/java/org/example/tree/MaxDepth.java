package org.example.tree;

import com.sun.source.tree.Tree;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    TreeNode(int data,TreeNode left,TreeNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}
public class MaxDepth {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);

        int depth=maxDepth(root);
        System.out.println("Maximun height:"+depth);
    }
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1+Math.max(lh,rh);
    }

}
