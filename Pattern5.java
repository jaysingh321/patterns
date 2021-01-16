//      ****              // 1 space
//       ***              // 2 space
//        **              //3 spce
//         *             // 4 space     humesha apn ko space ka for pehle chlana hai fir star ka

public class Pattern5 {
    public static void main (String []args)
    {
        for(int i = 1 ; i<=4 ; i++)
    {
            for(int j = 1 ; j<=i ; j++) 
            {
                System.out.print(" ");
            }
            for(int k = 4 ; k >= i ; k--)  
            {
                System.out.print("*");
            }
        System.out.println();         
    }
    }
}
