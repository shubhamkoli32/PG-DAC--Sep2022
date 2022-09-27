class p13
{
    public static void main(String []arg)
    {
     int i,j,k;
    for ( i = 1; i <= 5; i++)
        {
            for ( j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for ( k = i; k <= 5; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( i = 5-1; i >= 1; i--)
        {
            for ( j = 2; j <=i; j++)
            {
                System.out.print(" ");
            }

            for ( k = i; k <= 5; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
  }

}

/*
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****
/*