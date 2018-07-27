class Parent
{
void fun()
{
System.out.println("i am a parent");
}
}
class Child extends Parent
{
void disp()
{
System.out.println("i am a child");
}
}
class Main_Inherit
{
public static void main(String args[])
{
Child s=new Child();
s.fun();
s.disp();
}
}