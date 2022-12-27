package com.functional;

public class Main {

    public void greet(Greet greet){
        greet.perform();
    }

//    public static void main(String[] args) {
//         Main m = new Main();
//         Greet lambdaEnglishGreeting = ()-> System.out.println("Hello Wrold");
//        Greet lambdaYorubaGreeting = ()-> System.out.println("Ekaro Aiye");
//        Greet annoymousGreet=  new Greet(){
//            public void perform(){
//                System.out.println("Hello Greet from annonymous");
//            }
//        };
//         m.greet(annoymousGreet);
//    }
}
