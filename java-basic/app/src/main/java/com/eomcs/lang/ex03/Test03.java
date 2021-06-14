package com.eomcs.lang.ex03;

class Test03 {
    public static void main (String[] args){
        System.out.println(2.127f);//2.217
        System.out.println(1.1f + 1.027f);//2.2169999
        System.out.println(2.0f + 0.127f);//2.217
        System.out.println(1.123f + 1.004f);//2.2169999
        System.out.println((2.0f + 0.127f) == 2.127f);//true
        System.out.println((1.123f + 1.004f) == 2.127f);//false
        //모두 같은 2.127이지만 부동소수점 출력이 다르게 나온다
    }
}