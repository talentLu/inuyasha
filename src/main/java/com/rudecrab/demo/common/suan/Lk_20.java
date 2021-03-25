package com.rudecrab.demo.common.suan;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/24 17:07
 **/
public class Lk_20 {
    public static boolean isValid(String s) {
        Map<Character, String> map = new HashMap();
        map.put('(', ")");
        map.put('[', "]");
        map.put('{', "}");
        if (s.length() == 0 || (s.length() & 1) == 1) {
            return false;
        }
        return removeStr(s, map);
    }

    public static boolean removeStr(String s, Map<Character, String> map) {
        boolean flag = false;
        String str = "";
        for (int i = 0; i < s.length() - 1; i++) {
            char cur = s.charAt(i);
            char next = s.charAt(i + 1);
            if (map.get(cur) != null && next == map.get(cur).charAt(0)) {
                str = s.substring(0, i) + s.substring(i + 2);
                if (str.length() == s.length()) {
                    flag = false;
                } else if (str.length() == 0) {
                    return true;
                } else {
                    return removeStr(str, map);
                }
            }
        }
        return flag;
    }

    public static boolean isValid1(String s) {
        if (s.length() == 0 || (s.length() & 1) == 1) {
            return false;
        }
        if (s.startsWith(")") || s.startsWith("]") || s.startsWith("}")
                || s.endsWith("(") || s.endsWith("[") || s.endsWith("{")) {
            return false;
        }
        Map<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> st = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char ch;
            switch (c) {
                case '(':
                case '[':
                case '{':
                    st.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (st.empty()) {
                        return false;
                    } else {
                        ch = st.pop();
                        if (ch != map.get(c)) {
                            return false;
                        }
                    }
                    break;
                default:
                    return false;
            }
        }
        return st.empty();
    }


    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid1(str));
    }
}
