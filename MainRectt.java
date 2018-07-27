 class Rect_With_Param
{
float area;
float length,breadth;
Rect_With_Param(float len,float brd)
{
length=len;
breadth=brd;
}
float areaOfRect()
{
area=length*breadth;
return area;
}
void disp()
{
System.out.println("Area of rect:"+areaOfRect());
}
}
class 7y8u
{
public static void main(String args[])
{
Rect_With_Param s=new Rect_With_Param(10.0f,20.0f);
s.disp();
}
}