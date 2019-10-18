package com.peter.algo.level1;

public class DealWithStringBasic {
    public static void main(String[] args) {
        DealWithStringBasic basic = new DealWithStringBasic();
        
        System.out.println(basic.solution("a234"));
        System.out.println(basic.solution("1234"));
    }
    
    /*
     * ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�.
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
