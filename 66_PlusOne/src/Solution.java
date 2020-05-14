//先从最后一位循环，如果加上1后不等于0，直接return digits，跳出方法；如果等于0，那么就继续循环到前一位，让前一位加上1
//再看前一位是不是0。如果一直循环完之后都是0，那么最前面一位肯定是0，那么就把digits长度加1，然后把最前面一位变成1，后面都是0

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i>=0; i--){
            digits[i]++;
            digits[i]= digits[i]%10;
            if (digits[i] != 0){
                return digits;
            }
        }
        if (digits[0]==0){
            digits = new int[digits.length+1];
            digits[0] = 1;
            digits[digits.length-1] = 0;
        }
        return digits;
    }
}
