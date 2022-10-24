package ineuron.main;

public class pattern3 {

	public static void main(String[] args) {
		int n=12,i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==n-1||i-j>=((n-1)/2)+1||i+j<=(n-1)/2 ||i==0)
			
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
