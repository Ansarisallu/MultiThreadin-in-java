package com.thread.synchronized1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;
    private final Lock lock =new ReentrantLock();

    public  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting withdraw "+amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    System.out.println(Thread.currentThread().getName()+" processing with withdraw ");
                    try {
                        Thread.sleep(3000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName()+" completing withdraw Remaining balance: "+balance);

                    }catch (Exception e){

                    }finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName()+"unsuffisient balance");
                }

            }else {
                System.out.println(Thread.currentThread().getName()+" could not acquire the lock Try later");
            }
        }catch (InterruptedException e){

        }

    }



//    public synchronized void withdraw(int amount){
//        System.out.println(Thread.currentThread().getName()+" attempting withdraw "+amount);
//        if(balance>=amount){
//            System.out.println(Thread.currentThread().getName()+" processing with withdraw ");
//            try {
//                Thread.sleep(10000);
//                balance-=amount;
//                System.out.println(Thread.currentThread().getName()+" completing withdraw Remaining balance: "+balance);
//
//            }catch (Exception e){}
//
//        }else{
//            System.out.println("insufficient balance");
//        }
//    }



}
