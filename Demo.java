package Interface;

public class Demo implements Inter1,Inter2,Inter3
{
public void callBack()
{
	System.out.println("i am interface 1");
}
public void callMe()
{
	System.out.println("i am interface2");
	}
public void callOff(int value)
{
	System.out.println("am interface3");
	System.out.println("calloff: "+value);
}
public static void main(String args[])

{
	Demo obj=new Demo();
	obj.callBack();
	obj.callMe();
	obj.callOff(45);
	}
}
