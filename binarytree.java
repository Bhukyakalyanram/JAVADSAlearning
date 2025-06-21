
public class binarytree {

    public class Node {

        int data;
        Node Left;
        Node Right;

        public Node(int key) {
            data = key;
            Left = null;
            Right = null;
        }
      
    }
    public static int index = -1;

    public static Node buildTree(int node[]) {
            index++;
            if (node[index] == -1) {
                return null;
            }
            Node newNode = new Node(node[index]);
            newNode.Left = buildTree(node);
            newNode.Right = buildTree(node);
            return newNode;
        }
}
    public static void main(String[] args) {
        int node[] = {1, 2, 3, 4, 5, 6, 7};
        binarytree tree=new binarytree();
        Node root=tree.buildTree(node);
    }
