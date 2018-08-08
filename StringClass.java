package Stringsss;

public class StringClass
{
 public static void main(String args[])
 {
	 String str="SujirajanAMIRTHEKANI";
	 System.out.println("length of the string is:"+str.length());
	 System.out.println("length of the string literal is:"+"allwin".length());
	 System.out.println("uppercase of the string is:"+str.toUpperCase());
	 System.out.println("lowercase of the string is:"+str.toLowerCase());
	 System.out.println("sub string is:"+str.substring(0,9));
	 byte[] suji= {32,98,65,65,67,98,68};
	 String bs=new String(suji);
	 System.out.println("string using char array:"+bs);
	 char[] suji1= {'s','u','j','i'};
	 String cs=new String(suji1);
	 System.out.println("string using char array:"+cs);
	 //Removes the white spaces at the front and end
	 System.out.println("trimmed string is:"+str.trim());
	 
}
}
