import java.util.*;
public class Practice{
static public void main (String... args){
      Scanner myObj= new Scanner(System.in); 
      int i;
      
      System.out.println("Enter number: ");
       i = myObj.nextInt();  
      
       if(i>15)
       System.out.println( i + " " + "is greater than 15");
       else 
       System.out.println( i + " " + "is less than 15");
   }
}