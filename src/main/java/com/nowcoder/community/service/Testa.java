package com.nowcoder.community.service;

public class Testa {
        static Testa a = new Testa();

        public int test(int i) {
            int first = 1;
            int second = 2;
            int third = first + second;
            int ac = 4;
            while (ac < i) {
                third = third + second;
                second = third - second;
                ac++;
            }
            return third;
        }

    public int translateNum(int[] num) {
        int l = num.length;
        if (l == 1) {return 1;}
        int first = 1;
        int second = 1;
        if (num[0]*10 + num[1]>25){second = 1;}
        else{second =2;}
        int third = 3;
        if (num[1]*10 + num[2]>25){third = second;}
        else{third = first + second;}
        int current = 4;
        while (current < l){
            if(num[current]*10+num[current-1]>25){
                third = third;
                current++;
            }
            else{third = third + second;
                second = third-second;
                current++;}
        }
    return third;
    }

        public static void main(String[] args) {
            int[] num = new int[]{1,2,2,5,8};
            System.out.println(a.translateNum(num));
        }
    }
    

