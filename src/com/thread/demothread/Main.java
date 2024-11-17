package com.thread.demothread;

public class Main {
    public static void main(String[] args) {
        Test t=new Test();
        t.start();
        for(int i=0; i<1000; i++){
            System.out.println("main");
        }
    }
}