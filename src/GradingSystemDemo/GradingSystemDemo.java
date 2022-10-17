
package GradingSystemDemo;

import java.util.Scanner;


public class GradingSystemDemo {
    
public static void main(String[]args)
{

    int marks;
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter Your Number:");
    
    marks=sc.nextInt();
    
    if(marks>=0 && marks<=32)
    {
    
    System.out.print("Your Grade is F");
    
    }
    
    else if(marks>=33 && marks<=39)
            {
    
    System.out.print("Your Grade is D");
                
    
    
            }
    
    else if(marks>=40 && marks<=49)
        
    {
    System.out.print("your grade is C");
    
    
    }
    
    else if(marks>=50 && marks<=59)
    {
    
    System.out.print("your grade is B");
    
    }
    
    else if(marks>=60 && marks<=69)
    {
    
    System.out.print("your grade is A-");
    
    }
    
    
    else if(marks>=70 && marks<=79)
        
    {
    
    System.out.print("your grade is A");
    
    }
    
    
    else if(marks>=80 && marks<=100)
    {
    
    System.out.print("your grade is A+");
    
    }
    
    else
    {
    
    System.out.print("Invalid Marks");
    
    }
    




}
    
}
