
import java.util.*;

public class maximumpath {

    public class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int Maxpath(Node root) {
        int maxi[] = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        maxpath(root, maxi);
        return maxi[0];
    }

    public static int maxpath(Node root, int[] maxi) {
        if (root == null) {
            return 0;
        }
        int Leftmax = Math.max(0, maxpath(root.left, maxi));
        int Rightmax = Math.max(0, maxpath(root.right, maxi));
        maxi[0] = Math.max(maxi[0], (Leftmax + Rightmax + root.data));
        return Math.max(Leftmax, Rightmax) + root.data;
    }

    public static ArrayList<ArrayList<Integer>> zigzagtraversal(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean lefttoright = true;
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (lefttoright) {
                    row.add(node.data);
                } else {
                    row.add(0, node.data);
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            result.add(row);
            lefttoright = !lefttoright;
        }
        return result;
    }

    public static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    static void addLeftboundary(Node root, ArrayList<Integer> res) {
        Node start = root.left;
        while (start != null) {
            if (!isLeaf(root)) {
                res.add(start.data);
            }
            if (start.left != null) {
                start = start.left;
            } else {
                start = start.right;
            }
        }
    }

    static void addRightboundary(Node root, ArrayList<Integer> res) {
        Node start = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (start != null) {
            if (!isLeaf(root)) {
                temp.add(start.data);
            }
            if (start.right != null) {
                start = start.right;
            } else {
                start = start.left;
            }
        }
        for (int i = temp.size() - 1; i <= 0; i++) {
            res.add(temp.get(i));
        }
    }

    static void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
        }
        if (root.left != null) {
            addLeaves(root.left, res);
        }
        if (root.right != null) {
            addLeaves(root.right, res);
        }
    }

    public static ArrayList<Integer> printboundary(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (!isLeaf(root)) {
            result.add(root.data);
        }
        addLeftboundary(root, result);
        addLeaves(root, result);
        addRightboundary(root, result);
        return result;
    }

    public static void main(String[] args) {

    }
}
