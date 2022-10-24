package ineuron.main;

public class INEURON {

	public static void main(String[] args) {
		int n=11,i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0||j==(n-1)/2||i==(n-1) )
				
			{
				System.out.print("*");
			}
			
			else
			{
				System.out.print(" ");
			
			}
			}
			{ 
				for (j=0;j<2;j++)
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==0 || j==(n-1)||i==j)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			{ 
				for (j=0;j<2;j++)
				{
				System.out.print(" ");
				}
			}
			
		
			for(j=0;j<n;j++)
			{
				if(i==0||j==0||i==(n-1)/2 && (n-1)/2>j||i==n-1)
			
			{
					System.out.print("*");
			}
			
			else
			{
					System.out.print(" ");
			}
			}
			{ 
				for (j=0;j<2;j++)
				{
				System.out.print(" ");
				}
			}
			
			
				for(j=0;j<n;j++)
				{
					if(j==0 && i<(n-1) ||i==(n-1)&& j>0 &&j<(n-1)||j==(n-1)&& i<(n-1))
					{
						System.out.print("*");
						
					}
					else
					{
						System.out.print(" ");
					}
				}
			{ 
				for (j=0;j<2;j++)
				{
				System.out.print(" ");
				}
			}
			for(j=0;j<n;j++)
			{
				if(j==0||(i==0 && j<(3*n)/4)||j==(3*n)/4 && i>0 && i!=(n-1)/2
						||i==(n-1)/2 && j<(3*n)/4)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(i==0 &&j>0 &&j<(n-1)||j==0 &&i>0 &&i<(n-1) ||i==(n-1)&&j>0 &&j<(n-1)||j==(n-1)
						&&i>0 &&i<(n-1) )
				
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			{ 
				for (j=0;j<4;j++)
				{
				System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==0 || j==(n-1)||i==j)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
		
		System.out.println();
	}}

}
