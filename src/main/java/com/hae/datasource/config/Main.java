package com.hae.datasource.config;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length=0,ret=0,begin=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                begin=i;
            }
            length=i-begin+1;
            if(length>ret){
                ret=length;
            }
        }

        System.out.println(ret);
    }
}