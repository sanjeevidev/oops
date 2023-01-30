-------Abstarct Class--------
import java.io.*;
import java.util.Scanner;
abstract class shape{
    float a,b;
}
class Rectangle extends shape{
    void area(){
        Scanner re = new Scanner(System.in);
        System.out.println("Enter the Length :");
        float l = re.nextFloat();
        System.out.println("Enter the Breadth :");
        float b = re.nextFloat();
        float ar = l*b;
        System.out.println("The Area of Rectangle :"+ar);
    }
}
class AbstractClass{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Choice :");
        int op = inp.nextInt();
        switch(op){
            case 1:Rectangle r = new Rectangle();
            r.area();
            break;
        }
    }
}
-----------------Month----------------
import java.util.Scanner;
class Month{
    public static void main(String args[]){
        // int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number btwn 1-12 :");
        int month = sc.nextInt();
        switch(month){
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
        }
    }
}
-------------------SequentialSearch-------------
class SS{
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50,60,70};
        int target = 30;
        SequentialSearch(arr,target);
    }
    public static void SequentialSearch(int[] arr,int t){
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                index= i;
                break;
            }
        }
        if (index==-1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Element Found at "+(index+1));
        }
    }
}