//将x反转，之后再比较
public class Solution_reverse {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        long res = 0;
        long temp = x;
        while(x != 0){
            res = res *10 + x % 10;
            x = x / 10;
        }
        if (res == temp){
            return true;
        }
        else{
            return false;
        }
    }
}
