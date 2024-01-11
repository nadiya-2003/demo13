class Student
{
public int id;
public String name;
}

class Testt
{
public static void main(String args[])
{
Student ob=new Student();
System.out.println(ob.id+" "+ob.name);
ob.id=277599;
ob.name="Haritha";
System.out.println(ob.id+" "+ob.name);
}
}
