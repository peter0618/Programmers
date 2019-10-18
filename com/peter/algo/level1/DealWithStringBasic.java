package com.peter.algo.level1;

public class DealWithStringBasic {
    public static void main(String[] args) {
        DealWithStringBasic basic = new DealWithStringBasic();
        
        System.out.println(basic.solution("a234"));
        System.out.println(basic.solution("1234"));
    }
    
    /*
     * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수.
     */
    public boolean solution(String s) {

        if((s.length() != 4) && (s.length() != 6)) {
            return false;
        } else {
            try {
                Integer.parseInt(s);    
            } catch(NumberFormatException e) {
                return false;
            }
            return true;
        }
    }
    
    public boolean solution2(String s) {
        return ((s.length() == 4) || (s.length() == 6)) ? s.matches("^[0-9]+$") : false;
    }
}
