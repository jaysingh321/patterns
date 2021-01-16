
public class pattern13 {
   public static void main (String []args) 
   {
    for(int i=1;i<=5;i++)
    {
    for(int j=1;j<=5;j++)  
     { 
         if(i==j || i+j==5+1) // pehle wale cross ke line ka i==j or dusre wale ka i+j=5+1
{
    System.out.print("*");
}
  else {
      System.out.print(" ");
  }
}
System.out.println();
}
   }
}