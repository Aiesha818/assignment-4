public class genericexchange
{
public static<E>void prinyArray(E[] inputArray)
{
for(E element:inputArray)
{
System.out.printf("%s",element);
}
System.out.println();
}
public static void main(String[] args,int i)
{
Integer [] iList={1 , 5, 4, 10};
swap(iList, 1, 2);
for(Integer i:iList)
System.out.printf(i+",");
}
}

