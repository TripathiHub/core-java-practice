package com.company;

class Employee1
{
    int id;
    String name;
    int salary;
    public void setName(String n) {
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int m){
        salary=m;
    }
    public int getSalary(){
        return salary;
    }
}
public class CWHpraticeset8q1{
    public static void main(String[] args)
    {
        Employee1 harry = new Employee1();
        harry.setName("CWH");
        System.out.println(harry.getName());
        harry.setSalary(34);
        System.out.println(harry.getSalary());
    }
}
