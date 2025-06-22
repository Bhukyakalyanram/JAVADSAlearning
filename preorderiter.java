
import java.util.ArrayList;
import java.util.Stack;

public class preorderiter {

    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int key) {
            data = key;
            left = null;
            right = null;
        }

    }

    public static ArrayList<Integer> preorderit(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> preorder = new Stack<>();
        preorder.push(root);
        while (!preorder.isEmpty()) {
            Node node = preorder.pop();
            list.add(node.data);
            if (node.right != null) {
                preorder.push(node.right);
            }
            if (node.left != null) {
                preorder.push(node.left);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        // 1
        //   / \
        //  2   3
        // / \   / 
        //4   5 6 
        System.out.println(preorderit(root));
    }
}
