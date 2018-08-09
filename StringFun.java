package Stringsss;

public class StringFun
{
public static void main(String args[])
{
	String record="e100,suji,chennai,9600950869,45000";
	String sr[]=record.split(",");
	System.out.println("Employee id:"+sr[0]);
	System.out.println("Employee name:"+sr[1]);
	System.out.println("Employee address:"+sr[2]);
	System.out.println("Employee mobile:"+sr[3]);
	System.out.println("Employee salary:"+sr[4]);
	String rs=new String("S1911006520166");
	System.out.println("year of join:"+rs.substring(0,3));
    System.out.println("code:"+rs.substring(4));
    System.out.println("student sl:"+rs.substring(5,8));
	
	
	
}
}
