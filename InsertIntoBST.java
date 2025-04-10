import javax.swing.tree.TreeNode;

public class InsertIntoBST {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    // Iterative

    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null)
                return new TreeNode(val);
            TreeNode curr = root;
            while (true) {
                if (val > curr.val) {
                    if (curr.right == null) {
                        curr.right = new TreeNode(val);
                        break;
                    }
                    curr = curr.right;
                } else {
                    if (curr.left == null) {
                        curr.left = new TreeNode(val);
                        break;
                    }
                    curr = curr.left;
                }
            }
            return root;
        }
    }

    // recursive
    // class Solution {
    // public TreeNode insertIntoBST(TreeNode root, int val) {
    // if(root==null) return new TreeNode(val);
    // if(val>root.val){
    // root.right = insertIntoBST(root.right, val);
    // }
    // else if(val<root.val){
    // root.left = insertIntoBST(root.left, val);
    // }
    // return root;
    // }
    // }
}
