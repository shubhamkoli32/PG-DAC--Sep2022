
class P5
{
	public static void main(String args [])
	{	
	    int a=65;
	  
		for(int i=0;i<=4;i++)//Row
		{
			for(int j=0;j<=i;j++)//Column
			{
				System.out.print((char)(a+i)+" ");
				
			}
			System.out.println();
		}
		
	}
}

          