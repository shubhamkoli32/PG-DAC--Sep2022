 class C
{
    public static void main(String []arg)
    {
     int i,j,k;
     for(i=1;i<=5;i++)  //Rows
     {
     for (j=i;j<5;j++)  //space
     {

       System.out.print(" ");  
      }

    for (k=1;k<=i;k++)  //column
	{
	
	System.out.print("*");
	}
      System.out.println();
    }
  }

}

/*
Ans-
    *
   **
  ***
 ****
*****

*/