import java.util.Arrays;
import java.util.Comparator;

public class Algorithm1 {

    public static int getMinNumberOfDifferrentMachines(int[][] machines) {
        if (machines.length < 1) {
            throw new IllegalArgumentException("The array should contain at least one time interval!");
        }
        for (int[] machine : machines) {
            if (machine.length != 2 || machine[0] >= machine[1]) {
                throw new IllegalArgumentException("The array contains incorrect time intervals!");
            }
        }
        int requiredNumber = 1;
        if (machines.length == 1) {
            return requiredNumber;
        }
        Arrays.sort(machines, Comparator.comparingInt(o -> o[0]));
        for (int i = 1; i < machines.length; i++) {
            int intervalMatches = 0;
            for (int j = 0; j < i; j++) {
                if (machines[i][0] < machines[j][1]) {
                    intervalMatches++;
                }
            }
            if (intervalMatches >= requiredNumber) {
                requiredNumber++;
            }
        }
        return requiredNumber;
    }
}
