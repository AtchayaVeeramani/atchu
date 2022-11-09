import java.util.*;
import java.io.*;
public class arrayc
{
public static void main(String args[])
{
arrayc obj= new arrayc();
datainputstream in= new 
datainputstream stream(system.in);
int c,ch;
int i,j;
string str,str1;
do
{
System.out.println("string manipulation");
System.out.println("1.Append \t 2.insert\t3.search \n4.sort\t5.size\tremove\t");
System.out.println("enter the choice");
c=integer.paraseInt(in.readLine());
switch(c)
{
case 1:
{
System.out.println("enter the string");
str=in.readLine();
obj.add(str);
break;
}
case 2:
{
System.out.println("enter the string");
str=inreadLine();
j=obj.indexof(str);
if(j==1)
 System.out.println("element not found");
else
 System.out.println("index of :"+str+"is"+j);
break;
}
case 4:
{
System.out.println("enter character");
str=in.readLine();
for(i=0;i<(obj.size()-1);i++)
{
str1=obj.get(i);
if(str1.startswith(str))
{
System.out.println(str1);
}
}
break;
}
System.out.println("Please enter 0 to break and 1 to continue");
ch=integer.parseInt(inreadLine());
}
while(ch==1)
}
}

