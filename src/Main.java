import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("************************************");
        System.out.println("TEST ALGORITHM 1");
        int[][] machines1 = {{14, 25}, {5, 10}, {12, 13}, {15, 20}, {18, 19}, {14, 17}};
        System.out.print("INPUT: ");
        System.out.println(Arrays.deepToString(machines1));
        System.out.print("OUTPUT: ");
        System.out.println(Algorithm1.getMinNumberOfDifferrentMachines(machines1));
        int[][] machines2 = {{14, 25}, {5, 10}, {0, 30}};
        System.out.print("INPUT: ");
        System.out.println(Arrays.deepToString(machines2));
        System.out.print("OUTPUT: ");
        System.out.println(Algorithm1.getMinNumberOfDifferrentMachines(machines2));
        System.out.println("************************************\n");

        System.out.println("************************************");
        System.out.println("TEST ALGORITHM 2");
        String str = "eceba";
        int k = 2;
        System.out.println("INPUT: s='" + str + "', k = " + k);
        System.out.print("OUTPUT: ");
        System.out.println(Algorithm2.getLongestSubstringContainingAtMostKDistinctCharacters(str, k).length());
        str = "abbcbbbzzaaa";
        k = 3;
        System.out.println("INPUT: s='" + str + "', k = " + k);
        System.out.print("OUTPUT: ");
        System.out.println(Algorithm2.getLongestSubstringContainingAtMostKDistinctCharacters(str, k).length());
        System.out.println("************************************\n");

        System.out.println("************************************");
        System.out.println("TEST ALGORITHM 3");
        System.out.println("INPUT: 2");
        System.out.print("OUTPUT: ");
        System.out.println(Algorithm3.arrangeTeams(2));
        System.out.println("INPUT: 4");
        System.out.print("OUTPUT: ");
        System.out.println(Algorithm3.arrangeTeams(4));
        System.out.println("INPUT: 8");
        System.out.print("OUTPUT: ");
        System.out.println(Algorithm3.arrangeTeams(8));
        System.out.println("************************************\n");

    }
}
