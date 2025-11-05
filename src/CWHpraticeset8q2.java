package com.company;
class Cellphone{
    public void ring(){
        System.out.println("ringing");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }

}
public class CWHpraticeset8q2
{
    public static void main(String[] args)
    {
        System.out.println("welcome to vivo phone");
        Cellphone vivo = new Cellphone();
        vivo.ring();
        vivo.vibrate();
    }
}
