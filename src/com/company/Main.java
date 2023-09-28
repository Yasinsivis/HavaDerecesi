package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int heat;
        Scanner inp = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz lütfen");
        heat=inp.nextInt();
        if(heat>5 && heat<15){
            System.out.println("Sinemaya  Gidebilirsiniz");

        }
        else if(heat>=15 && heat<25){
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else if(heat>25) System.out.println("Yüzmeye Gidebilirsiniz...");
        else System.out.println("Kayak Yapabilirsiniz..");
    }
}
