package newtest_project_packagefortesting;

//import java.util.Scanner;

public class Pyramidpatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,s,x;
		//   System.out.print ("Input number of rows : ");
		//   Scanner in = new Scanner(System.in);
		//		    n = in.nextInt();
		n=4;

		   s=n+4-1;
		    for(i=1;i<=n;i++)
		   {
		   for(x=s;x!=0;x--)
		    {
		   System.out.print(" ");
		    }
		    for(j=1;j<=i;j++)
		    {
		     System.out.print(i+" ");
		     }
			System.out.println();
		    s--;
		   }
	}

}
