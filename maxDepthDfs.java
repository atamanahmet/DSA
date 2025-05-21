import java.util.Stack;

public class maxDepthDfs {
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

    class Pair {
        Integer value;
        TreeNode key;

        public Pair(TreeNode key, Integer value) {
            this.value = value;
            this.key = key;
        }

        public Pair() {
            this.value = null;
            this.key = null;
        }

        public TreeNode getKey() {
            return this.key;

        }

        public Integer getValue() {
            return this.value;
        }
    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            if (root.right == null && root.left == null && root != null)
                return 1;

            // TreeNode curr = root;

            // return dfsHeight(curr);
            return dfsHeightIterative(root);

        }

        // recursive
        public int dfsHeight(TreeNode node) {
            if (node == null)
                return 0;

            int left = dfsHeight(node.left);
            int right = dfsHeight(node.right);

            return Math.max(left, right) + 1;

        }

        // Iterative
        public int dfsHeightIterative(TreeNode node) {

            Stack<Pair> stack = new Stack<>();

            stack.push(new Pair(node, 1));

            int maxDepth = 0;

            while (!stack.isEmpty()) {

                int depth = stack.peek().getValue();

                node = stack.pop().getKey();

                if (node != null) {
                    maxDepth = Math.max(depth, maxDepth);

                    stack.push(new Pair(node.left, depth + 1));
                    stack.push(new Pair(node.right, depth + 1));
                }
            }
            return maxDepth;
        }
    }
}
