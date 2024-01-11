class Person
{
protected String fname="Jhon";
protected String lname="Doe";
protected int age=24;
}
class Sttudent extends Person
{
private int graduationYear=2018;
public static void main(String args[])
{
Sttudent myobj=new Sttudent();
System.out.println("Name:"+myobj.fname+""+myobj.lname);
System.out.println("Age:"+myobj.age);
System.out.println("Grdauation Year:"+myobj.graduationYear);
}
}