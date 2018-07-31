class A
{
A()
{
System.out.println("default constructor-super class");
}
A(int i)
{
System.out.println("overload constructor-super class");
}
}
class B extends A
{
B()
{
super(10);
System.out.println("default constructor-sub class");
}
}
public class  Example
{
public static void main(String args[])
{
B obj=new B();
}
}
