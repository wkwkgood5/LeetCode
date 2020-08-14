public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int count = 0; count < 32; count++){
            res <<= 1; //res左移一位，注意，这里要先将res左移，再去接收n的最后一位。因为初始res虽然是0，但其实在位置上是没有的。
            res |= (n & 1);
            n >>= 1;
        }
        return res;//
    }
}
