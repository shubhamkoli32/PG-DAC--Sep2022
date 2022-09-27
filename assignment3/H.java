//half Diamond
class H
{
 public static void main (String args[])
 {
   int i,j;
   for(i=1;i<=5;i++) //raws 
   {  
    
	
	for(j=1;j<=i;j++) //columns
	{
	   System.out.print("* ");
	
	}
   
      System.out.println();
   
   }
  for(i=1;i<=4;i++) //raws 
   {  
    
	
	for(j=4;j>=i;j--) //columns
	{
	   System.out.print("* ");
	
	}
   
      System.out.println();
   
   }
 }
}
/*
ans-
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/