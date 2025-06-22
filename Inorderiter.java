
import java.util.ArrayList;
import java.util.Stack;

public class Inorderiter {

    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static ArrayList<Integer> Inorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> In = new Stack<>();
        Node current = root;
        while (true) {
            if (current != null) {
                In.push(current);
                current = current.left;
            } else {
                if (In.isEmpty()) {
                    break;
                }
                current = In.pop();
                list.add(current.data);
                current = current.right;
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
        root.right.right = new Node(7);

        System.out.println(Inorder(root));
    }

}
