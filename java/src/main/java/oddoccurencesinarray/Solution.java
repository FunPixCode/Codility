package oddoccurencesinarray;

public class Solution {
    public int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }

        int result = 0;

        for (int value : A) {
            result ^= value;
        }

        return result;
    }
}
