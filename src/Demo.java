/* Write a short Java function that takes an array of int values  as an argument and determines
 if there is a pair of numbers in the array whose product is odd.  */

import java.util.LinkedList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int arr[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<args.length;i++)
        {
            int c;
            for(int j=0;j< args.length;j++)
            {
                if(j!=i)
                {
                    c=arr[i]*arr[j];
                    if(c%2==1)
                    {
                        System.out.println("the product of "+"(" + arr[i] + "," + arr[j] + ")" + " is odd");
                    }
                }
            }
        }


    }

}
