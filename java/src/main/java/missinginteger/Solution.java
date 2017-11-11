package missinginteger;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] A) {
        final Set<Integer> numbers = new HashSet<>();

        for (int number : A) {
            numbers.add(number);
        }

        int smallestMissing = 1;

        while (numbers.contains(smallestMissing)) {
            smallestMissing += 1;
        }

        return smallestMissing;
    }
}
