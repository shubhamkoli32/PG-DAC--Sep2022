//Diamond 

class G
{
    public static void main(String []arg)
    {
     int i,j,k;
     for(i=1;i<=5;i++)  //Rows
     {
     for (j=5;j>i;j--)  //space (column)
     {

       System.out.print(" ");  
      }

    for (k=1;k<=(2*i-1);k++)  //column
	{
	
	System.out.print("*");
	}
      System.out.println();
    }
	for(i=4;i>=1;i--)  //Rows
     {
     for (j=5;j>i;j--)  //space (column)
     {

       System.out.print(" ");  
      }

    for (k=1;k<=(2*i-1);k++)  //column
	{
	
	System.out.print("*");
	}
      System.out.println();
    }
  }

}

/*
ans-
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
*/