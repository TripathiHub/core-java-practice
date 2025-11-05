package com.company;
class Circle{
    float radius;
    float area;
    float perimeter;
    public void setradius( float r){
        radius=r;
    }
    public float area(){
        area= 3.14f*radius*radius;
        return area;
    }
    public float perimeter(){
        perimeter=2*3.14f*radius;
        return perimeter;
    }
}
public class CWHpraticeset8q6
{
    public static void main(String[] args)
    {   Circle c1 = new Circle();
        c1.setradius(9);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
