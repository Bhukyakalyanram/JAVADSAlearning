
import java.util.*;

public class post {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode lastVisited = null;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;  // Go as left as possible
            } else {
                TreeNode peekNode = stack.peek();
                // if right child exists and traversing node from left child, then move right
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    result.add(peekNode.val);
                    lastVisited = stack.pop();  // Visit node
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \
          4   5
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = postorderTraversal(root);
        System.out.println("Postorder Traversal: " + result);
    }
}
