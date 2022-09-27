
class p12
{
 public static void main (String args[])
 {
   int i,j;
   for(i=1;i<=5;i++) //raws 
   {  
    
	
	for(j=5;j>=i;j--) //columns
	{
	   System.out.print("*");
	
	}
   
      System.out.println();
   
   }
   for(i=1;i<=5;i++) //raws 
   {  
    
	
	for(j=1;j<=i;j++) //columns
	{
	   System.out.print("*");
	
	}
   
      System.out.println();
   
   }
  
 }
}