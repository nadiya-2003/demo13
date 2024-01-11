class Student1
{
private String name;
private int age;

private String getName()
{
return this.name;
}

private int getAge()
{
return this.age;
}

private void setName(String name)
{
if (name.length()>0)
{
this.name=name;
}
else
{
System.out.println("Name cant be empty");
}
}

private void setAge(int age)
{
this.age=age;
}

public void display()
{
System.out.println(getName()+", "+getAge());
}

public void inputStudentDetails(String n,int a)
{
setName(n);
setAge(a);
}
}

class Teest
{
public static void main(String args[])
{
Student1 s=new Student1();
s.inputStudentDetails("Harsha",10);
s.display();
Student1 s2=new Student1();
s2.inputStudentDetails("Vishnu",40);
s2.display();
}
}