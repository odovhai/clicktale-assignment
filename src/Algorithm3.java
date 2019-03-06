import java.util.stream.IntStream;

public class Algorithm3 {
    public static String arrangeTeams(int n) {
        String[] teams = IntStream.rangeClosed(1, n).mapToObj(String::valueOf).toArray(String[]::new);
        return arrangeTeams(teams);
    }

    public static String arrangeTeams(String[] t) {

        int size = t.length / 2;

        if (size == 1) {
            return String.format("(%s,%s)", t[0], t[1]);
        }
        String[] pair = new String[size];
        for (int i = 0; i < size; i++) {
            pair[i] = String.format("(%s,%s)", t[i], t[t.length - i - 1]);
        }
        return arrangeTeams(pair);
    }
}
