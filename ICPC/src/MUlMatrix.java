
import java.util.Scanner;
class MUlMatrix
{
	public static void main(String args[])
	{
		int r1, r2,c1,c2,i,j,k,sum;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows of matrix1");
		r1 = in.nextInt();

		System.out.println("Enter the number columns of matrix 1");
		c1 = in.nextInt();
		System.out.println("Enter the number of rows of matrix2");
		r2 = in.nextInt();

		System.out.println("Enter the number of columns of matrix 2");
		c2 = in.nextInt();

		if(c1==r2)
		{

			double mat1[][] = new double[r1][c1]; 
			double mat2[][] = new double[r2][c2]; 
			double res[][] = new double[r1][c2];

			System.out.println("Enter the elements of matrix1");

			for ( i= 0 ; i < r1 ; i++ )
			{ 
				for ( j= 0 ; j < c1 ;j++ )
					mat1[i][j] = in.nextDouble();
			}
			System.out.println("Enter the elements of matrix2");

			for ( i= 0 ; i < r2 ; i++ )
			{ 
				for ( j= 0 ; j < c2 ;j++ ) {
					mat2[i][j] = in.nextDouble();
				}
			}
			
			for (i=0; i<3; ++i) 
			{
				for (j=0; j<3; ++j)
				{
					System.out.print(mat2[i][j]+"  ");
				}
				System.out.println();
			}
//			int[][] tempMat = mat2;
			double d[][] = invert(mat2);
			for (i=0; i<3; ++i) 
			{
				for (j=0; j<3; ++j)
				{
					System.out.print(d[i][j]+"  ");
				}
				System.out.println();
			}
			System.out.println("\n\noutput matrix:-");
			for ( i= 0 ; i < r1 ; i++ ) 
			{

				for ( j= 0 ; j <c2;j++)
				{
					sum=0;
					for ( k= 0 ; k <r2;k++ )
					{
						sum +=mat1[i][k]*d[k][j] ;

					}
					res[i][j]=sum;
				}
			}
			for ( i= 0 ; i < r1; i++ )
			{
				for ( j=0 ; j < c2;j++ )
					System.out.print(res[i][j]+" ");

				System.out.println();
			}
		}
		else
			System.out.print("multipication does not exist ");
	}
	
	public static double[][] invert(double a[][]) 

	{
		int n = a.length;
		double x[][] = new double[n][n];
		double b[][] = new double[n][n];
		int index[] = new int[n];
		for (int i=0; i<n; ++i) 
			b[i][i] = 1;
		
		gaussian(a, index);

		for (int i=0; i<n-1; ++i)
			for (int j=i+1; j<n; ++j)
				for (int k=0; k<n; ++k)
					b[index[j]][k] -= a[index[j]][i]*b[index[i]][k];

		for (int i=0; i<n; ++i) 
		{
			x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
			for (int j=n-2; j>=0; --j) 
			{
				x[j][i] = b[index[j]][i];
				for (int k=j+1; k<n; ++k) 
				{
					x[j][i] -= a[index[j]][k]*x[k][i];
				}
				x[j][i] /= a[index[j]][j];
			}
		}
		return x;
	}

	public static void gaussian(double a[][], int index[]) 
	{
		int n = index.length;
		double c[] = new double[n];

		for (int i=0; i<n; ++i) 
			index[i] = i;

		for (int i=0; i<n; ++i) 
		{
			double c1 = 0;
			for (int j=0; j<n; ++j) 
			{
				double c0 = Math.abs(a[i][j]);
				if (c0 > c1) c1 = c0;
			}
			c[i] = c1;
		}

		int k = 0;
		for (int j=0; j<n-1; ++j) 
		{
			double pi1 = 0;
			for (int i=j; i<n; ++i) 
			{
				double pi0 = Math.abs(a[index[i]][j]);
				pi0 /= c[index[i]];
				if (pi0 > pi1) 
				{
					pi1 = pi0;
					k = i;
				}
			}

			int itmp = index[j];
			index[j] = index[k];
			index[k] = itmp;
			for (int i=j+1; i<n; ++i) 	
			{
				double pj = a[index[i]][j]/a[index[j]][j];
				a[index[i]][j] = pj;

				for (int l=j+1; l<n; ++l)
					a[index[i]][l] -= pj*a[index[j]][l];
			}
		}
	}

}