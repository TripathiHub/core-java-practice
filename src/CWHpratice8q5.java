package com.company;
class Rectangle {
    float side;
    float length;
    float area;
    float perimeter;

    public void setSide(float a) {
        side = a;
    }

    public void setLength(float l) {
        length = l;
    }

    public float area() {
        area = side * length;
        return area;
    }

    public float perimeter() {
        perimeter = 2 *(side + length);
        return perimeter;
    }
}


public class CWHpratice8q5
{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setSide(4.5f);
        r1.setLength(8.7f);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

    }
}
