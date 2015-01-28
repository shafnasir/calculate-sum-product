/****************************************************************
  * @Author:Shaf Nasir         @Date:November 9, 2014
  * This program is used to get the user to input a string of numbers 
  * so the program can get the sum and product of the number
  * *************************************************************/
import java.util.Scanner;

class PS18Ex3ShafNasir{//Start of PS18ExShafNasir
  public static void main(String[]arg){//Start of main method
    Scanner keyboard = new Scanner(System.in);
    String response;
    SumProductShafNasir obj = new SumProductShafNasir();//Creating constructor for class reference variable
    System.out.println("Enter a string of numbers: ");
    response = keyboard.nextLine();
    obj.sumResponse(response);//Callung upon reference variables for the class SumProduct
    obj.productResponse(response);
    
  }//End of main method
}//End of PS18Ex3ShafNasir

class SumProductShafNasir{//Start of SumProductShafNasir
/********************************************************************
  * This method is to get the sum of the string number
  * it is using a while loop and the for loop to get the integer
  * value of each substring
  * ******************************************************************/
  public int sumResponse(String response){//Start of sumResponse
    int sum = 0;
    int lengthR = response.length();
   while(lengthR>0){
      for(int i = lengthR; i>0;i--){
      int x = Integer.valueOf(response.substring(i-1,i));
     sum = sum + x;
       lengthR--;
      }
   }
   System.out.println("The sum is: "+sum);
 return lengthR;}
/********************************************************************
  * This method is to get the product of the string number
  * it is using a while loop and the for loop to get the integer
  * value of each substring
  * ******************************************************************/  
 public int productResponse(String response){//Start of productResponse
    int product = 1;//needs to be one or the product will always be zero
    int lengthR = response.length();// to get the length of the string used for the loop
   while(lengthR>0){
      for(int i = lengthR; i>0;i--){
      int x = Integer.valueOf(response.substring(i-1,i));//each substring is being converted into an integer value
      product = product * x;//multiplying to get the product
       lengthR--;
      }
   }
   System.out.println("The product is: "+product);
 return lengthR;}//End of productResponse
}//End of SumProductShafNasir


     

