package SumOfTwoInteger;

/**
 * Created by dingpeng on 16/8/10.
 */
public class Solution {
    public int getSum(int a, int b) {
        int sum,carry;
        do{
            sum = a^b;
            carry = (a&b)<<1;
            a = sum;
            b = carry;
        }while(carry!=0);
        return sum;
    }
}
