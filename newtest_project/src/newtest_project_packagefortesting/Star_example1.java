package newtest_project_packagefortesting;

public class Star_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		for (int rows = 0; rows<=n; rows++)
		{
			for (int columns = rows; columns <n ; columns++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
