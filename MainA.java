
public class MainA
{
	public static void main(String args[])
	{
		A obj=new B();
		obj.addr(10,20);
		B obj1=(B)obj;
		obj1.disp();
	}

}
