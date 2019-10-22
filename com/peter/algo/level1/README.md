## 1. String.split과 공백, 그리고 limit == -1
   
   1) 공백(" ")을 기준으로 구분된 단어들을 배열에 담으려 할 때, 보통 str.split(" ") 를 사용함. <br>
    이떄, 단어1과 단어2 사이에 공백이 n개 (n >= 2)인 경우 배열에 단어1과 단어2 사이에 빈 문자열 n-1개가 저장됨. 
         
          예) String str = "try  hello world";
             String[] words = str.split(" ");
             System.out.println(Arrays.toString(words));   //   [try, , hello, world]
            
    2) 문자열 뒤에 있는 공백을 무시하고 싶지 않을 때, split 메소드의 두번째 인자인 limit에 -1을 대입하면 된다.
                
          예) String str = "try hello world ";
             String[] words = str.split(" ");
             System.out.println(Arrays.toString(words));   //    [try, hello, world]
             => 이렇게 limit을 셋팅하지 않을 때, 기본적으로 마지막 단어 뒤에 있는 공백은 무시됨. (공백이 많아도 결과 동일)
             
             String str = "try hello world     ";
             String[] words = str.split(" ", -1);
             System.out.println(Arrays.toString(words));   //    [try, hello, world, , , , , ]
             => limit을 -1로 셋팅하면, 마지막 단어 뒤에 있는 공백 n개가 빈문자열 n개로 대응되어 리턴됨.
             
         
