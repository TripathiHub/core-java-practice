package com.company;
class Employee
{
    int id;
    int salary;
    String name;

    public void printdetails()
    {
        System.out.println("my id is" + id);
        System.out.println("my name is " + name);
    }

    public int getsalary()
    {
        return salary;
    }

}
public class CWHfirstcustomclass
{
    public static void main(String[] args)
    {
        System.out.println("this is out custom class");
        Employee harry= new Employee();
        Employee himanshu=new Employee();
        harry.id=12;
        himanshu.id=11;
        harry.name= "CWH";
        himanshu.name ="himanshu";
        harry.salary=34;
        himanshu.salary=150;
        himanshu.printdetails();
        harry.printdetails();
        int salary = himanshu.getsalary();
        System.out.println(salary);
        int salary1 = harry.getsalary();
        System.out.println(salary1);


    }
}
