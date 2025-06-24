
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

    public static void main(String[] args) {

    }
}
