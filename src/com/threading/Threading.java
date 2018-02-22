package com.threading;

class RunnableThread implements Runnable{

    private Thread thread;
    private String threadName;

    RunnableThread(String name){
        threadName = name;
        System.out.println("Creating ".concat(threadName));
    }

    @Override
    public void run(){
        System.out.println("Running ".concat(threadName));
    }

    public void start(){
        System.out.println("Starting ".concat(threadName));
        if(thread == null){
            //                  'Runnable'
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

}

class ThreadClass extends Thread{

    private String threadName;
    private int workLoad;

    ThreadClass(String name, int workLoad){
        this.workLoad = workLoad;
        threadName = name;
        System.out.println("Creating ".concat(threadName));
    }

    @Override
    public void run(){
        System.out.println("Running ".concat(threadName));

        try {
            for (int i = 0; i < workLoad; i++) {
                System.out.println(threadName + " " + Integer.toString(i));
                Thread.sleep(0);
            }
        }catch (InterruptedException e){
            System.out.println(threadName.concat(" was interrupted"));
        }
    }
}

public class Threading {

    public static void main(String[] args){
        System.out.println("Multithreading example");

        //RunnableThread x = new RunnableThread("THREAD X");
        //x.start();
        //RunnableThread y = new RunnableThread("THREAD Y");
        //y.start();


        ThreadClass x = new ThreadClass("X", 3);
        x.start(); // from Thread base class

        ThreadClass y = new ThreadClass("Y", 10);
        y.start();

    }

}
