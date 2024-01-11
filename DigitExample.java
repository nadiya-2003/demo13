import java.util.*;
class DigitExample
{
ArrayList<Character>al;
DigitExample()
{
al=new ArrayList<Character>();
al.add('0');
al.add('1');
al.add('2');
al.add('3');
al.add('4');
al.add('5');
al.add('6');
al.add('7');
al.add('8');
al.add('9');
}

private boolean isDigit(char c)
{
for(int i=0;i<al.size();i++)
{
if(c==al.get(i))
{
return true;
}
}
return false;
}
public int countDigit(String s)
{
int countDigit=0;
int size=s.length();
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isDigit(c))
{
countDigit=countDigit+1;
}
}
return countDigit;
}
public static void main(String args[])
{
DigitExample obj=new DigitExample();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfDigits=obj.countDigit(str);
System.out.println("String:"+str);
System.out.println("Total number of Digits in the String are :"+noOfDigits+"\n");
}
}