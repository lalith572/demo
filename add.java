package demo;

import java.util.Scanner;

public class add
{
    public static void main(String agrs[])
    {
        int a = 5;
        int b = 20;
        int c = a + b ;
        System.out.println(c);
        System.out.println("hellp world!!!" + "This is my first git repo");
        mutliply(b);
        
    }

    public static double mutliply (int n){
          
        System.out.println("enter n value:");
        Scanner input = new Scanner(System.in);
        n= input.nextInt();
        return n;
    }
}

