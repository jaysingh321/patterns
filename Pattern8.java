/*
                                 3 pattern alag niklte isse ek toh left side me space or baki 2 ye dekho-
                   *       
                  ***             *
                 *****           **              *
                *******         ***             **
                               ****            ***      ye dono banre
 

*/
public class Pattern8 {
    public static void main(String []args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=2;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int r=1;r<=i;r++)
            {
                System.out.print("*");
            }
       System.out.println();
        }

    }
}
