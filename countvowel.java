public class countvowel
{
public static void main(String a[])
{
int vCount=0;
String str="hello";
str=str.toLowerCase();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
vCount++;
}
}
System.out.println("Number of vowels:"+vCount);
}
}