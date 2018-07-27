class Depart
{
int did;
String dname;
void acceptDepart(int did,String dname)
{
did=did;
dname=dname;
System.out.println("Empid="+did);
System.out.println("Empname="+dname);
}
}
class EmpDepart
{
public static void main(String arg[])
{
Depart obj=new Depart();
obj.acceptDepart(34,"suji");
}
}