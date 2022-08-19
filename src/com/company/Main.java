package com.company;

public class Main {

    public static void main(String[] args) {
        final int S=1000000;
        int n=1;
        boolean found = false;
        while(found==false)
        {
            if ((n * (n + 1)) / 2 > S) {
                found=true;
            }
            else{
                n++;
            }
        }
        System.out.println(n);

    }
}
