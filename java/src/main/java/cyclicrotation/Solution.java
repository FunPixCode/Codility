package cyclicrotation;

public class Solution {
    public int[] solution(int[] A, int K) {
        final int length = A.length;

        if (length == 0) {
            return A;
        }

        // perform shift K times
        for (int i = 0; i < K; i++) {
            // save last one into the tmp;
            final int tmp = A[length - 1];

            // shift all array one element to the right
            for (int j = length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }

            // now we have place to put last one to the head of an array
            A[0] = tmp;

        }

        return A;
    }

}
