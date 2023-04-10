import java.util.Scanner;
public class matrix
	{

		public static void main(String[] args)

		{

			Scanner s1=new Scanner(System.in);
			System.out.println("enter the number of rows and column");
			int r=s1.nextInt();
			int c=s1.nextInt();
			int a[][]=new int[r][c];
			
			System.out.println("Enter the matrix");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j]=s1.nextInt();
				}
			}
				System.out.println("matrix is");
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
					System.out.println(a[i][j]);	
					}
				}



				
		}
	}