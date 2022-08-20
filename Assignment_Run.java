
import java.util.Scanner;

 

public class Assignment_Run {

 

Scanner sc = new Scanner(System.in);

 
	   public void checkzeroNegative(int num) {
		   
		   if (num <= 0)
		   {
			   System.out.println("ERROR: Number cannot be zero or negative.\n");
		   }
		   //CAN ADD THIS CHECK INDIVIDUALLY BUT WANTED TO DO AS A FUNCTION AS ITS REPEATING
		   //DO NOT KNOW HOW TO RETURN AFTER THE ERROR OR CONTINUE IN CASE OF ELSE CONDITION
	   }
	   

           //function to checkPalindrome

       public void checkPalindrome()  {

    	   int checkNumber, reversalNumber;
    	   
    	   System.out.println("Enter the number to check for Palindrome: \n");
    	   checkNumber = sc.nextInt();
    	   checkzeroNegative(checkNumber);
    	   reversalNumber =0;
    	   
    	   int bufNumber = checkNumber;
    	   
    	   while (bufNumber !=0)
    	   {
    		   int rem = bufNumber%10;
    		   reversalNumber = reversalNumber * 10 + rem;
    		   bufNumber = bufNumber/10;
       	   }
    	   if (checkNumber == reversalNumber) {
			      System.out.println(checkNumber + " is a Palindrome number.\n");
			    }
			    else {
			      System.out.println(checkNumber + " is not a Palindrome number.\n");
			    }
      }

 

            //function to printPattern

       public void printPattern() {
    	   int starLevels, rowIndex, colIndex;
    	   
    	   System.out.println("Enter the number of levels for star pattern: \n");
    	   starLevels = sc.nextInt();
    	   checkzeroNegative(starLevels);
    	   
    	   for ( rowIndex = starLevels -1; rowIndex >=0; rowIndex-- )
    	   {
    		   for ( colIndex=0; colIndex<=rowIndex; colIndex++ )
    		   {
    			   System.out.print("*" + " ");
    		   }
    		   System.out.println(); 
    	   }

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	int checkNum;
        	boolean checkFlag = false;
     	   
     	   	System.out.println("Enter the number to check if prime or not: \n");
     	   	checkNum = sc.nextInt();
     	   	checkzeroNegative(checkNum);
     	   	
     	   	for (int i = 2; i <= checkNum / 2; ++i) {
     	      if (checkNum % i == 0) {
     	    	 checkFlag = true;
     	        break;
     	      }
     	    }

     	    if (!checkFlag)
     	      System.out.println(checkNum + " is a prime number.");
     	    else
     	      System.out.println(checkNum + " is not a prime number.");
     	    
     	   System.out.println(); 

        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;       
           int SeriesNum, idx = 0;
           
           System.out.println("Enter the Fibonacci series number: \n");
           SeriesNum = sc.nextInt();
           checkzeroNegative(SeriesNum);
           
           while (idx < SeriesNum) {
 
	           System.out.print(first + " ");

	           int num3 = second + first;
	           first = second;
	           second = num3;
	           idx = idx + 1;
           }
           System.out.println(); 
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Assignment_Run obj = new Assignment_Run();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
