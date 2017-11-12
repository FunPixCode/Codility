package tapeequilibrium;

public class Solution {
    public int solution(int[] A) {
        int sum = 0;

        for (int number : A) {
            sum += number;
        }

        int difference = Integer.MAX_VALUE;
        int previous = 0;
        int next;

        for (int p = 1; p < A.length; p++) {
            previous += A[p - 1];
            next = sum - previous;
            difference = Math.min(difference, Math.abs(previous - next));
        }

        return difference;
    }
}
