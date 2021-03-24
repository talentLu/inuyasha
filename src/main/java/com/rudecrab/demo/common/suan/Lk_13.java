package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/24 15:22
 **/
public class Lk_13 {
    private static int romanToInt(String s) {
        int pre = getValue(s.charAt(0));
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int cur = getValue(s.charAt(i));
            sum = pre < cur ? sum - pre : sum + pre;
            pre=cur;
        }
        sum+=pre;
        return sum;
    }
    private static int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));;
    }
}
