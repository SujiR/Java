import java.util.Scanner;
class Student
{
Scanner s=new Scanner(System.in);
int id;
String name;
float avg;
int total;
int math,phy,che;
void accept_Stud()
{
System.out.println("enter ur name");
name=s.next();
System.out.println("enter the id");
id=s.nextInt();
System.out.println("enter the maths,phy,che marks");
math=s.nextInt();
phy=s.nextInt();
che=s.nextInt();
total=math+phy+che;
}
float calculate_Marks()
{
avg=total/3;
return avg;
}
void dispStud()
{
System.out.println("student name:"+name);
System.out.println("student id:"+id);
System.out.println("student total mark:"+total);
System.out.println("student avg:"+calculate_Marks());
}
}
class MainStudent
{
public static void main(String args[])
{
Student obj=new Student();
obj.accept_Stud();
obj.dispStud();
}
}