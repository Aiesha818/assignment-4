public class removewhitespaces
{
public static void main(String a[])
{
String sentence="she is a good girl";
System.out.println("Original sentence:"+sentence);
sentence=sentence.replaceAll("\\s","");
System.out.println("After replacement:"+sentence);
}
}


