import javax.swing.tree.TreeNode;

public class isBalancedTree {
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

    // not working
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int left = 0;
        int right = 0;
        TreeNode curr = root.left;
        if (curr != null) {
            left++;
        }
        while (curr != null) {
            if (curr.left != null) {
                curr = curr.left;
                left++;
            } else {
                if (curr.right != null) {
                    curr = curr.right;
                    left++;
                } else {
                    break;
                }
            }
            System.out.println("left: " + left);
        }
        curr = root.right;
        if (curr != null) {
            right++;
        }
        while (curr != null) {
            if (curr.right != null) {
                curr = curr.right;
                right++;
            } else {
                if (curr.left != null) {
                    curr = curr.left;
                    right++;
                } else {
                    break;
                }
            }
            System.out.println("right: " + right);

        }
        if (Math.abs(left - right) <= 1) {
            return true;
        } else {
            return false;
        }

    }
}
