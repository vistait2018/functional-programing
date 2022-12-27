package com.functional;

public  class LambdaThreads {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threading");
            }
        });

        Thread lambdaThread = new Thread( ()-> System.out.println("lambad Thread"));
       t.run();
        lambdaThread.run();
    }
}
