import java.util.*;
class Genericcls{
public static void main(String args[])
{
Integer[] intArray = {1,2,3,4,5,6,7};
Character[] charArray = {'A','B','C','D','E','F','G'};
Double[] doubleArray = {1.5,2.5,3.5,4.5,5.5,6.5,7.5};
FindMax(intArray);
FindMax(charArray);
FindMax(doubleArray);
}
public static <E> void FindMax(E[] elements){
Arrays.sort(elements);
System.out.println("The Maximum element is"+elements[elements.length-1]);
}
}