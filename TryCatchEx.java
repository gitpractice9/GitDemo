package exceptionHandling;

public class TryCatchEx
{
	 public static void main(String args[])
	 {  
		   try{  
		      int data=50/0;  
              }
		   catch(ArithmeticException ae)
		       {
			   System.out.println(ae);
			   }  
<<<<<<< HEAD
      System.out.println("remaining code"); 
System.out.println("end of code");
     
=======
      System.out.println("rest of the code...");  
>>>>>>> 076bda70d643d257f1dc1c1e8f71561151312b87
	 }  
		
}
 /*   Output:
	  java.lang.ArithmeticException: / by zero
	  rest of the code...
*/

/*Java try block is used to enclose the code that might throw an exception. 
   It must be used within the method.
   Java try block must be followed by either catch or finally block.
   Syntax:
   try{  
     //code that may throw exception  
       }catch(Exception_class_Name ref){}  
       
     try{  
    //code that may throw exception  
     }finally{} 
*/
/* Java catch block is used to handle the Exception.
 *  It must be used after the try block only.
 You can use multiple catch block with a single try.
 */

