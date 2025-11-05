package com.company;
class Tommy
{
    public void run(){
        System.out.println("tommy is running");
    }
    public void fire(){
        System.out.println("tommy is firing");
    }
    public void hit(){
        System.out.println("tommy is hitting ");
    }

}

public class CWHpratice8q3
{
    public static void main(String[] args) {
        Tommy player1= new Tommy();
        player1.hit();
        player1.run();
        player1.fire();
    }
}
