package frogjump;

public class Solution {
    public int solution(int X, int Y, int D) {
        final double jumps = (double) (Y - X) / (double) D;
        return jumps > ((int) jumps) ? (int) jumps + 1 : (int) jumps;
    }
}
