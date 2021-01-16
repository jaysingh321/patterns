/*
              *                               *
               *                              %*                % ek sign use kiya itni space khaali hai ab ye % ki jagah * rakho toh normal star pattern purana wala banalo fir oske andar if codition lagake space print karani % ki jagah
                *                             %%*
                 *                            %%%*
                  *                           %%%%*



*/
public class pattern11 {
    public static void main (String[]args)
    {
      for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=i;j++)    // yaha tak jese star pattern banate hai wese chlega 
          {
              if(i>=2 && j<=i-1)   // idhr condition lagayi ab space ki spacing chalo hori second row se fir row badhte jaari 3 4 5 toh greater than or fir ab space print karana toh j ka use kara jisme har row me space ek kam hai 2 row me 1 space 3 me 2 space toh i-1 hua or jo space hai wo badhri hai har row me toh <= ye wala sign
              {
                  System.out.print(" ");    //space print karado
              }
              else
              {
                  System.out.print("*");   // otherwise *
              }
          }
          System.out.println();  
      }
    } 
}