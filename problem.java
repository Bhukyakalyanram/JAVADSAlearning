
import java.util.*;

public class problem {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Bstiterator {

        private Stack<TreeNode> stack = new Stack<>();
        private boolean reverse = true;

        public Bstiterator(TreeNode root, boolean isReverse) {
            reverse = isReverse;
            pushAll(root);
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public int next() {
            TreeNode node = stack.pop();
            if (reverse == false) {
                pushAll(node.right);

            } else {
                pushAll(node.left);
            }
            return node.val;
        }

        private void pushAll(TreeNode node) {
            while (node != null) {
                stack.push(node);
                if (reverse == true) {
                    node = node.right;
                } else {
                    node = node.left;
                }
            }
        }

        class Solution {

            public boolean findTarget(TreeNode root, int k) {
                if (root == null) {
                    return false;
                }
                Bstiterator l = new Bstiterator(root, true);
                Bstiterator r = new Bstiterator(root, false);

                int i = l.next();
                int j = r.next();
                while (i < j) {
                    if (i + j == k) {
                        return true;
                    } else if (i + j < k) {
                        i = l.next();
                    } else {
                        j = r.next();
                    }
                }
                return false;
            }
        }

        public static void main(String args[]) {

        }
    }
}
