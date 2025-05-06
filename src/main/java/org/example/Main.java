package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int x){
        int originalX = x;
        int tersX = 0;

        while(x!=0){
            int rakam = x%10;
            tersX = tersX * 10 +rakam;
            x /= 10;
        }
        if(originalX==tersX) return  true;
        else return false;
    }
    public static boolean isPerfectNumber(int x){
        if(x<0) return false;
        else {
            int total=0;
            for(int i=1;i<(x/2)+1;i++){
                if(x%i==0) total+=i;
            }
            if(total==x) return true;
            else return false;
        }
    }
    public static String numberToWords (int x) {
        if (x < 0) return ("Invalid Value");
        else if (x == 0) return ("Zero");
        else {
            String xStr = String.valueOf(x);
            String words = "";
            for (int i = 0; i < xStr.length(); i++) {
                char rakamChar = xStr.charAt(i);
                String word = "";

                switch (rakamChar) {
                    case '0':
                        word = "Zero";
                        break;
                    case '1':
                        word = "One";
                        break;
                    case '2':
                        word = "Two";
                        break;
                    case '3':
                        word = "Three";
                        break;
                    case '4':
                        word = "Four";
                        break;
                    case '5':
                        word = "Five";
                        break;
                    case '6':
                        word = "Six";
                        break;
                    case '7':
                        word = "Seven";
                        break;
                    case '8':
                        word = "Eight";
                        break;
                    case '9':
                        word = "Nine";
                        break;
                }
                words += word;
                if (i < xStr.length() - 1) {
                  words+= " ";
                }
            }
            return words;
        }
    }

}
