//pattern 3 is combination of pattern 1 and 2 , combine both the codes of pattern
//  *
//  **
//  ***
//  ****
//  ***
//  **
//  *
public class Pattern3 {
  public static void main(String []args)  
  {
      for(int i =1; i<=4; i++)
      {
          for(int j =1; j<= i; j++)
          {
          System.out.print("*");
          }
      System.out.println();     
        }
     for(int i=1; i<=4 ; i++ )
     {
         for(int j=3; j>=i; j--)     // yaha 3 liya bs ye ek change hai prog me kyu ki 4 star anne ke baad wo kaam hora oske 3 star fir 2 toh apn ne 3 se start karaya
         {
             System.out.print("*");
         }
     System.out.println();
        }
 }
}
