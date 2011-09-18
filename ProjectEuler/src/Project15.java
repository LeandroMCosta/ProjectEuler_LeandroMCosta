
public class Project15 {
	public static boolean run(){
		System.out.println("How many routes are there through a NxN grid?");
		/*		the nº of routes to the intersection
		 *  _ _  1 1 1 1 1
		 * |_|_| 1 2 3 4 
		 * |_|_| 1 3 6 
		 *       1 4 
		 * 		 1 
		 * 		the nº of routes follow the pascal triangle for the values so to find.
		 * */
			
		int N=(int)main.chooseANumber();
		long [][] routes = new long [2*N+2][2*N+2];
		
		for (int i=0;i<=2*N;i++)
		{
			for (int j=0;j<=i;j++){
				if (j==0||j==i)
					routes[i][j]=1;
				else
				{
					routes[i][j]=routes[i-1][j]+routes[i-1][j-1];
				}
				//System.out.print(" "+routes[i][j]);
			}
		}		
		System.out.println("\nNumber of routes: "+routes[2*N][N]);
		return true;
	}
}
