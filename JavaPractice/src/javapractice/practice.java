/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author duhman94
 */
public class practice 
{
    
////   1: turns a string number into an int number
//    public static void main(String[] args) 
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String str = sc.nextLine();
//        int num = Integer.parseInt(str);
//        System.out.println(num);
//                
//         
//        
//        
//    }
    
////    2: if the first and last positions are 10, returns true
//    public static void main (String[] args)
//    {
//        int[] numarray = {10,2,5,3};
//        
//        if (numarray[0] ==10 && numarray[3]==10)
//        {
//            System.out.println("true");
//            
//        } else System.out.println("false");
//        
//    }
    
    
    
////    3: finds the maximum of 2 values
//    public static int findMax(int num1, int num2)
//    {
//        int result1;
//        
//        if (num1>num2)
//            result1=num1;
//        else result1=num2;
//        
//        return result1;
//            
//        
//        
//    };
//    public static void main (String args[])
//    {
//        int a =0;
//        int b =0;
//        int result;
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("enter number 1");
//        a = sc.nextInt();
//        System.out.println("enter number 25"
//                + "");
//        b = sc.nextInt();
//        
//        result = findMax(a,b);
//        System.out.println("greater number is " + result);
                
        
//    }
    
////    4: finds the smallest of 3 input values
    
//    public static int findSmallest(int num1, int num2, int num3)
//    {
//        
//        int result=0;
//        
//        
//        if (num1<num2 && num1<num3)
//            result=num1;
//        if (num2<num1 && num2<num3)
//            result=num2;
//        if (num3<num1 && num1<num2)
//            result=num3;
//        
//        System.out.println("smallest is " + result);
//        return result;
//    }
//    
//    public static void main (String args[])
//    {
//        int a;
//        int b;
//        int c;
//        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("enter number 1");
//        a = sc.nextInt();
//        System.out.println("enter number 2");
//        b = sc.nextInt();
//        System.out.println("enter number 3");
//        c = sc.nextInt();
//        
//        findSmallest(a,b,c);
//        
//    }
    
    
////    5: finds the character at a certain point in string
    
//    public static void main (String args[])
//    {
//        String str = "Dallas";
//        int position;
//        int charnum1;
//        
//        Scanner sc = new Scanner(System.in);
//        
//        do{
//        System.out.println("Please enter a position in the string " + str);
//        position = sc.nextInt();
//        
//        if (position >= str.length())
//            System.out.println("For the string " + str + ", the position must be below " + str.length() );
//        
//        
//        } while (position >= str.length());
//        
//      
//        
//        //while ( position < str.length()){
//            
//        charnum1=str.charAt(position);
//        
//        //}
//        
//        
//        System.out.println("The letter at " + position + " is '" + (char)charnum1 + "'");
//            
//        
//        
//        
//    }
    
    
//    //6: Input then sum values of an array
//    
//    
//    public static void main (String[] args)
//    {
//        int[] numarray = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int sum=0;
//        
//        for (int i = 0; i < numarray.length ;i++)
//        {
//            System.out.println("Enter the number at position: " + i);
//            numarray[i] = sc.nextInt();
//            
//            sum+=numarray[i];
//            
//            
//            
//        }
//        
//        System.out.println("The sum of all of the integers in the array is : " + sum);
//        
//    }
    
    
    
//    //7: Test if an array contains a specific value
//    
//    public static void main (String args[])
//    {
//        int [] numarray = {10,5,3,7};
//        Scanner sc = new Scanner (System.in);
//        int num;
//        int counter=0;
//        
//        System.out.println("Enter a number:");
//        num = sc.nextInt();
//        
//        for (int i = 0; i < numarray.length ;i++)
//        {
//            if (numarray[i] == num)
//            {
//                System.out.println("The number at position " + i + " matches the input number " + num + ". ");
//                counter++;
//                
//            }
//            
//        }
//        
//        if (counter==0)
//        {
//            System.out.println("No numbers matching " + num + " were found in the array.");
//        }
//        
//        
//    }
    
    
    
//    //8: Takes string and sorts it
//    
//    public static void sortString()
//    {
//        String input = null;
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Enter string:");
//        input = sc.nextLine();
//        
//        
//        
//        char[] c = input.toCharArray();
//        Arrays.sort(c);
//        
//        System.out.println(c);
//    }
//    
//    public static void main (String args[])
//    {
//        sortString();
//    }
    
    
//    //9: Input number then make a triangle
//    
//    public static void main(String args[])
//    {
//        int num;
//        int counter=0;
//        
//        System.out.println("Enter num:");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        
//        for(int i=1; i<=num; i++)
//        {
//            
//            for (int x=1; x<=(counter+1); x++)
//            {
//                System.out.print(x);
//            }
//            
//            System.out.println();
//            counter++;
//        }
//        
//    }
    
    
//    //10: Find max or min value in an array
//    
//    public static void findMax(int [] numarray)
//    {
//        
//        int maxnum=0;
//        for (int x=0; x<numarray.length; x++)
//        {
//            
//            if (numarray[x] > maxnum) 
//            {
//                maxnum = numarray[x];
//                
//            }  
//        }
//        
//        System.out.println("The largest integer in that array is: " + maxnum);
//    }
//    
//    public static void findMin(int [] numarray)
//    {
//        
//        int minNum=100;
//        for (int x=0; x<numarray.length; x++)
//        {
//            
//            if (numarray[x] < minNum) 
//            {
//                minNum = numarray[x];
//                
//            }  
//        }
//        
//        System.out.println("The smallest integer in that array is: " + minNum);
//    }
//    
//    
//    public static void main(String args[])
//    {
//        int[] numarray = {10, 8, 5, 12, 80, 9};
//        int choice=0;
//        
//        
//        System.out.println("The array is: ");
//        for(int x=0; x<numarray.length; x++)
//        {
//            System.out.print(numarray[x] + " ");
//            
//        }
//        System.out.println();
//        
//        
//        while (choice!=-1)
//        {
//            System.out.println("Find the max or the min? (1 for max, 2 for min, -1 to quit");
//            Scanner sc = new Scanner(System.in);
//            choice = sc.nextInt();
//        
//            if (choice == 1)
//            {
//                findMin(numarray);
//                
//            } else if (choice ==2)
//            {
//                findMax(numarray);
//            }
//                
//        }
//        
//    }
    
    
    public static void main (String args[])             //main needs to be lowercase for some idiot reason
    {
        
    }
    
    
    
    
}
