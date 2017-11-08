package binarygap;

public class Solution {
    public int solution(final int N) {
        byte zeros = 0;
        byte gap = 0;

        boolean sawOne = false;
        boolean sawZero = false;

        int onePos = 1; // mask

        for (int i = 1; i < 32; i++) {
            // do we see 1?
            if ((onePos & N) == onePos) {
                // we see 1 after 0, gap ended
                if (sawOne && sawZero) {
                    // if we saw more zeros than in previous gap, update gap size
                    if (zeros > gap) {
                        gap = zeros;
                    }

                    //reset zeros
                    zeros = 0;
                    //reset zero flag
                    sawZero = false;
                }

                // we see 1
                sawOne = true;
            } else {
                // if we saw 1 before, than count zeroz
                if (sawOne) {
                    zeros += 1;
                }

                sawZero = true;
            }

            // shift mask one bit to the left
            onePos <<= 1;
        }

        return gap;
    }
}
