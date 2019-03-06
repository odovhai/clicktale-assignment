import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Algorithm2 {

    public static String getLongestSubstringContainingAtMostKDistinctCharacters(String str, int k) {
        for (int i = str.length(); i > 0; i--) {
            for (int j = 0; j <= str.length() - i; j++) {
                String candidateStr = str.substring(j, j + i);
                if (getDistinctCharactersCount(candidateStr) <= k) {
                    return candidateStr;
                }
            }
        }
        throw new NoSuchElementException("Suitable substring was not found");
    }


    public static int getDistinctCharactersCount(String str) {
        if (null == str || str.length() < 1) {
            throw new IllegalArgumentException("The string should not be empty");
        }
        return str.chars()
                .boxed()
                .collect(Collectors.toSet())
                .size();

    }

}
