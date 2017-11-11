package permmissingelement;

public class Solution {
    public int solution(int[] A) {
        int should_be = A.length;

        int sum = 0;

        for (int index = 0; index < A.length; index++) {
            sum += A[index];
            should_be += index + 1;
        }

        return should_be - sum + 1;
    }
}