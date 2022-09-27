 class D
{
    public static void main(String []arg)
    {
     int i,j,k;
     for(i=5;i>=1;i--)  //Rows
     {
     for (j=5;j<i;j--)  //space
     {

       System.out.print(" ");  
      }

    for (k=5;k<=i;k--)  //column
	{
	
	System.out.print("*");
	}
      System.out.println();
    }
  }

}

/*
ans-
*****
 ****
  ***
   **
    *
*/