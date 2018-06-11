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
    
    
//    //12: find even numbers of an array
//    
//    public void findArray(int[] arr)
//    {
//        for(int x=0; x<arr.length; x++)
//        {
//            if (arr[x]%2==0)
//            {
//                System.out.println(arr[x] + " ");
//            }
//        }
//    }
//    
//    
//    public static void main (String args[])             //main needs to be lowercase for some idiot reason
//    {
//        int[] numarray = new int[5];
//        Scanner sc = new Scanner(System.in);
//        
//        for(int x=0; x<numarray.length; x++)
//        {
//            System.out.println("Enter number for position " + x);
//            numarray[x]=sc.nextInt();
//        }
//        
//        practice obj = new practice();
//        
//        obj.findArray(numarray);
//    }
    
    
////    //13: array of objects
//    
//    public void hi()
//    {
//        System.out.println("hello");
//        
//    }
//    
//    public static void main(String args[])
//    {
//        practice[] objarray = new practice[3];
//        
//        for (int x=0; x<objarray.length; x++)
//        {
//            objarray[x] = new practice();
//        }
//        
//        objarray[1].hi(); 
//    }
    
//    //14: string w/e
//    
//    public static void main(String args[])
//    {
//        String input;
//        
//        System.out.println("enter input:");
//        Scanner sc = new Scanner(System.in);
//        input = sc.nextLine();
//        
//        char[] c = input.toCharArray();
//        System.out.println(c);
//    }
    
//    //15: pass object array to method
//    
//    public void printArray(int[] numarray)
//    {
//        for (int x=0; x<numarray.length; x++)
//        {
//            System.out.println("The value at position " + x + " is " + numarray[x] + ". "); 
//        }
//        
//    }
//    
//    public static void main(String args[])
//    {
//        int[] numarray = new int[] { 3, 5, 2, 99};
//        
//        practice obj = new practice();
//        
//        obj.printArray(numarray);
//    }


public static void main (String args[])
{
	string input;
	
			
	System.out.println("Enter input lmao");
	Scanner sc = new Scanner(System.in);
	input=sc.nextLine();
	

	char[] c = input.ToCharArray().Distinct().ToArray();
	Array.sort(c);
	
	System.out.println("The distinct string is: " + c);

}

public static void main (String args[])
{
	Practice[] objarray = new Practice[3];

	for (int x=0; x<objarray.Length; x++)
	{

		objarray[x] = new Pratice();
	}

}
    
    
    
public static void main (String args[])
{
	string input;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String);
	sc.nextLine();
	
	char[] c = input.ToCharArray().Distinct().ToArray();
	Array.sort(c);
	
	System.out.println(c);
}
    
    
public static void main (String args[])
{
	Person[] objarray = new Person[3];
	Scanner sc = new Scanner(System.in);
	
	string name;
	int age;
	
	for (int x=0; x<objarray.length; x++)
	{
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter age:");
		age = sc.nextInt();
		
		objarray[x] = new Person(age, name);
		
	}
}

public class Person{

public int Age {get; set;}
public string Name {get; set;}

public void Person(int age, string name)
{
	Age = age;
	Name = name;

}
}

//print array via method

public void enterNum(int[3] numArray){

	for (int x=0; x<numArray.length; x++)
	{
		System.out.println("The number at position " + x + " is " + numArray[x])
	}

}

public static void main (String args[])
{
	int[] numArray = new int[3];
	Scanner sc = new Scanner(System.in);
	
	Program obj = new Program();
	

	
	for(int x=0; x<numarray.length; x++)
	{
		System.out.println("Enter num:");
		numArray[x] = sc.nextInt();
		
	}
	
	obj.enterNum(numarray);
}


public static void sumArray(int[] numarray)
{

	int sum;
	
	for (int x=0; x<numarray.length; x++)
	{
		sum += numarray[x];
	}
	
	System.out.println("The sum is " + sum);
	
}

public static void main (String args[])
{
	int[] numarray = new int[3];

	Scanner sc = new Scanner(System.in);
	
	for (int x=0; x<numarray.length; x++)
	{
		System.out.println("Enter num");
		numarray[x] = nextInt();
		
	}
	
	sumArray(numarray);
}


public static calcNum(a, b, c)
{
	int x=0;
	
	if (a > x)
	{
		x==a;
	}
	if (b > x)
	{
		x==b;
	}
	if (c > x)
	{
		x==c;
	}
	
	return x;

}

public static void main(String args[])
{
	int a = 5;
	int b = 10;
	int c = 88;
	
	System.out.println(calcNum(a, b, c));
}

public static void printArray(Program[] objarray)
{
	for(int x=0; x<objarray.length; x++)
	{
		objarray[x] = new Program();
	}


}

public static void main(String args[])
{
	Program[] objarray = new Program[3];
	
	printArray(objarray);
}



public passValues(int a, int b)
{
	int x;
	
	x = a*b;
	return x;

}

public static void main (String args[])
{
	int a, b;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number:");
	a = sc.nextInt();
	System.out.println("Enter second number:");
	b = sc.nextInt();
	
	Program obj = new Program();
	
	System.out.println("A * B is " + obj.passValues(a, b) + ". ");
}


public static void main(String args[])
{
	string input;
	char charPos;
	int num;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter position number");
	num = sc.nextInt();
	
	if (num > input.length)
	{
		System.out.println("Too big");
	} else
	{
		charPos = input.charAt(num);
		System.out.println("The char at position " + num + " is " + charPos);
	}
	
	
}


public static void main(String args[])
{
	int age;
	string name;
	Scanner sc = new Scanner(System.in);
	
	Program[] objarray = new Program[3];
	
	for (int x=0; x<objarray.length; x++)
	{
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter name");
		name = sc.nextLine();
		
		objarray[x] = new Program(age, name);
		
		System.out.println("Age for object " + x + " is " + objarray[x].age + " and name is " + objarray[x].name);
		
	}
}




public class Program{

	public int Age{ get; set;};
	public string Name { get; set;};
	
	public Person (int age, string name)
	{
		Age = age;
		Name = name;
	}

}



public void returnThing(int[] numArray )
{
	for (int x=0; x<numArray.length; x++)
	{
		System.out.println("The num at position " + x + " is " + numarray[x]);
	}

}


public static void main (String args[])
{
	int[] numArray = new int[3];
	
	for (int x=0; x<numArray.length; x++)
	{
		System.out.println("Enter num: ");
		Scanner sc = new Scanner(System.in);
		numArray[x] = sc.nextInt();
	}
	
	Program obj = new Program();
	obj.returnThing(numArray);
	
	
}


//inheritance example using "extends"

public class class1		
{
	public void addNum(int x, int y)
	{
		System.out.println("Added: " + (x +y));
	}

}

public class class2 extends class1
{
	public static void main(String args[])
	{
		int a = 55;
		int b = 33;
		
		class2 classObj = new class2();
		
		classObj.addNum(a, b);
	}
}

//inheritance example using "extends" and "super"

public class class1		
{
	int mix = 777;
	
	public void addNum(int x, int y)
	{
		System.out.println("Added: " + (x +y));
	}

}

public class class2 extends class1
{

	public void addNum(int x, int y)
	{
		System.out.println("I'm using super...also Added: " + (x+y));
	}

	public static void main(String args[])
	{
		int a = 55;
		int b = 33;
		int mix = 666;
		
		class2 classObj = new class2();
		
		classObj.addNum(a,b);	//calls class 2's addNum method
		
		super.addNum(a,b);     	//calls class1's addNum method
		System.out.println(super.mix);  //prints out 777
	}
}







    
    
}
