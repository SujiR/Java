import java.util.*;
class Student
{
Scanner s=new Scanner(System.in);
int rollno;
String name;
float marks;
void studentDetail()
{
System.out.println("your rollno\t");
rollno=s.nextInt();
System.out.println("your name\t");
name=s.next();
System.out.println("your mark\t");
marks=s.nextFloat();
}
}
class MainDemo
{
public static void main(String args[])
{
Student obj=new Student();
obj.studentDetail();
}
}
