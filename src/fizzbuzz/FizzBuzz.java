//*****************************************************************************
//Name: Brent Miller
//Date: 070815
//Project Name: Fizz Buzz
//Description: This program prints out the final series of numbers where those 
//divisible by X, Y and both are replaced by “F” for fizz, “B” for buzz and “FB” 
//for fizz buzz. This program will accept a file as its first argument. 
//The file contains multiple separated lines; each line contains 3 numbers that 
//are space delimited. The first number is the first divider (X), the second 
//number is the second divider (Y), and the third number is how far you should
//count (N). You may assume that the input file is formatted correctly and the 
//numbers are valid positive integers. Print out the series 1 through N 
//replacing numbers divisible by X with “F”, numbers divisible by Y with “B” 
//and numbers divisible by both with “FB”. Since the input file contains 
//multiple sets of values, the output will print out one line per set. 
//There are no trailing empty spaces in each line printed. 
//*****************************************************************************
package fizzbuzz;

import java.io.FileReader; 
import java.io.FileNotFoundException;
import java.util.Scanner;

//begin class FizzBuzz
public class FizzBuzz 
{
    //begin main
    public static void main(String[] args) throws FileNotFoundException
    {       
        //accept an input file to read from
        Scanner inFile = new Scanner(new FileReader("numbers.txt"));        
        
        //EOF controlled loop
        while(inFile.hasNext())
        {
            int first=inFile.nextInt();
            int second=inFile.nextInt();
            int third=inFile.nextInt();   
           
            //iterate from 1 thru the third number in the numbers.txt document
            for(int i=1;i<=third;i++)
            {
                if(i%first==0 && i%second==0 )
                {
                    System.out.printf("FB ");
                }//end if
                else if(i%first==0)
                {
                    System.out.printf("F ");
                }//end else if
                else if(i%second==0)
                {
                    System.out.printf("B " );
                }//end else if
                else
                {
                    System.out.printf("%d ",i);
                }//end else
            }//end for
            System.out.println();
        }//end while
        inFile.close();//close the file before exiting the program
    }//end main    
}//end class FizzBuzz