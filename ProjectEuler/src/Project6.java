
public class Project6 {
	public static boolean run(){
		System.out.println("Find the difference between the sum of the squares of the first N natural numbers and the square of the sum.");
		int sqrsum=0,sumsqr=0,i,n;
		n=(int)main.chooseANumber();
		for(i=1;i<=n;i++){
			sqrsum+=i;
			sumsqr+=(i*i);
		}
		sqrsum*=sqrsum;		
		System.out.print(" "+sqrsum+"-"+sumsqr+"="+(sqrsum-sumsqr));
		return true;
	}
}
