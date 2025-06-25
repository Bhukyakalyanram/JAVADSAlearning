
import java.util.*;

public class verticalorder {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.val = data;
        }
    }

    static class Pair {

        TreeNode node;
        int hd;

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static ArrayList<List<Integer>> verticalO(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int hd = p.hd;
            int val = p.node.val;
            if (!map.containsKey(hd)) {
                map.put(hd, new ArrayList<>());
            }
            map.get(hd).add(val);
            if (p.node.left != null) {
                q.add(new Pair(p.node.left, hd - 1));
            }
            if (p.node.right != null) {
                q.add(new Pair(p.node.right, hd + 1));
            }

        }
        result.addAll(map.values());
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<List<Integer>> result = verticalO(root);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
