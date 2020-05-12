public class Solution {
    public int reverse(int x) {
        long res = 0; //防止溢出，设置long型
        while (x != 0){
            res = res*10 + x%10; //数学公式，每次除以10，然后取余数给res，res每次*10，然后x每次再除10
            x=x/10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE){
            return 0;
        }

        return (int) res;
    }
}
