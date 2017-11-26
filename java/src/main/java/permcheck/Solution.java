package permcheck;

public class Solution {
    public int solution(int[] A) {
        final int length = A.length;
        final boolean[] seen = new boolean[length];

        for (int index = 0; index < length; index++) {
            if (A[index] < 1 // out range
                    || A[index] > length// out range
                    || seen[A[index] - 1] == true) {// duplicate
                return 0;
            } else {
                seen[A[index]-1] = true;
            }
        }

        return 1;
    }
}
