package codingCompetitive.letsCrackIt;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {

    public int wordBreak(String A, String[] B) {
        Set<String> set = new HashSet<>();
        for (String b: B)
            set.add(b);
        boolean[] a = new boolean[A.length() + 1];
        a[0] = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) {
                for (int j = i + 1; j < a.length; j++) {
                    if (set.contains(A.substring(i, j)))
                        a[j] = true;
                }
            }
            if (a[a.length - 1]) return 1;
        }
        return 0;
    }
}
