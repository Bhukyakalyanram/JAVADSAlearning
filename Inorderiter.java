
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

    public static ArrayList<Integer> Postorder(Node root) {
        ArrayList<Integer> List = new ArrayList<>();
        Stack<Node> St1 = new Stack<>();
        Stack<Node> St2 = new Stack<>();
        if (root == null) {
            return List;
        }
        St1.push(root);
        while (!St1.isEmpty()) {
            Node temp = St1.pop();
            St2.push(temp);
            if (temp.left != null) {
                St1.push(temp.left);
            }
            if (temp.right != null) {
                St1.push(temp.right);
            }
        }
        while (!St2.isEmpty()) {
            List.add(St2.pop().data);
        }
        return List;
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

    public static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> List = new ArrayList<>();
        Stack<Node> St = new Stack<>();
        Node curr = root;
        while (curr != null || !St.isEmpty()) {
            if (curr != null) {
                St.push(curr);
                curr = curr.left;
            } else {
                Node temp = St.pop().right;
                if (temp == null) {
                    temp = St.pop();
                    List.add(temp.data);

                }
            }
        }
        return List;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(Postorder(root));
    }

}
