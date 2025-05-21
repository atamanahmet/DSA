
public class minDepth {

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
        public int minDepth(TreeNode root) {
            if (root == null)
                return 0;
            return dfsMin(root);
        }

        public int dfsMin(TreeNode node) {
            if (node == null)
                return Integer.MAX_VALUE;
            if (node.left == null && node.right == null)
                return 1;

            int left = dfsMin(node.left);
            int right = dfsMin(node.right);

            return 1 + Math.min(left, right);
        }
    }
}
