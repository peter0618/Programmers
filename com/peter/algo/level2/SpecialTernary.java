package com.peter.algo.level2;

public class SpecialTernary {
    public static void main(String[] args) {
        for(int i=1 ; i < 14 ; i++) {
            System.out.println(solution(i));
        }
    }
    
    /*
     * 0) �⺻ ���̵��� 10���� -> 3���� ��ȯ�� �ַ� ����ϴ� �ݺ������� ���������ϱ�
     * 1) 3���� ���� �������� ���������� ���ϵ�, 3���� ������ �������� ��� ���� �ϳ� ���̰� �������� 3���� �ν��ϸ� ��.(0�� ���� ����) 
     * 2) 3�� 4�� �ٲ� 
     * 3) ��ü�� reverse
     */
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 3) {
            if (n % 3 == 0) {
                sb.append(3);
                n = n / 3 - 1;
            } else {
                sb.append(n % 3);
                n = n / 3;
            }
        }
        return sb.append(n).reverse().toString().replace('3', '4');
    }
}
