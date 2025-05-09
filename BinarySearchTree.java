public class BinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null)
                return root;
            if (root.val == val)
                return root;
            else if (val > root.val) {
                return searchBST(root.right, val);
            } else {
                return searchBST(root.left, val);
            }
        }
    }
    // class Solution {
    // public TreeNode searchBST(TreeNode root, int val) {
    // while(root!=null){
    // if(val==root.val) return root;
    // root = (val>root.val)?root.right:root.left;
    // }
    // return null;
    // }
    // }
}
