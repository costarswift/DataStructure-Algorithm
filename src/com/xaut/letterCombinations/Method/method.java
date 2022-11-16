package com.xaut.letterCombinations.Method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class method {
    List<String> lists = new ArrayList<>();
    Map<Character,String> map = new HashMap<>();

    //深度优先搜索 回溯 递归
    public List<String> letterCombinations(String digits){
        if(digits.length() == 0) return lists;
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrace(digits, 0, new StringBuffer());
        return lists;

    }
    private void backtrace(String digits, int index, StringBuffer sb){
        if (index == digits.length()){
            lists.add(sb.toString());
            return;
        }
        char digit = digits.charAt(index);
        String s = (String) map.get(digit);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backtrace(digits, index + 1, sb);
            sb.deleteCharAt(index);
        }
    }
}
