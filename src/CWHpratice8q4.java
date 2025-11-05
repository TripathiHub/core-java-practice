package com.company;
class Square{
    float a;
    float area;
    float perimeter;
    public void setSide(float s){
        a=s;
    }
    public float area(){
        area=a*a;
        return area;
    }
    public float perimeter(){
        perimeter= 4*a;
        return perimeter;
    }
}

public class CWHpratice8q4
{
    public static void main(String[] args)
    {
        Square s1= new Square();
        s1.setSide(23.56f);
        System.out.println(s1.perimeter());
        System.out.println(s1.area());

    }

}
