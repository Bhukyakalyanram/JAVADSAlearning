
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greedyalgo {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int activites[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];

        }
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> ans = new ArrayList<>();
        int maxcount = 1;
        ans.add(activites[0][0]);
        int lastend = start[0];
        for (int i = 1; i < start.length; i++) {
            if (activites[i][1] >= lastend) {
                maxcount++;
                ans.add(activites[i][0]);
                lastend = activites[i][2];
            }
        }
        System.out.println(maxcount);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
