import javax.swing.tree.TreeNode;

public class dfsRecursive {
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
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            if (root.right == null && root.left == null && root != null)
                return 1;

            TreeNode curr = root;
            return dfsHeight(curr);

        }

        public int dfsHeight(TreeNode node) {
            if (node == null)
                return 0;

            int left = dfsHeight(node.left);
            int right = dfsHeight(node.right);

            return Math.max(left, right) + 1;

        }
    }
}
