
public class Project12 {
	public static boolean run(){
		System.out.println("What is the value of the first triangle number to have over five hundred divisors?");
		int i=0,divisores=0,trigNumber=0;
		for(i=1;divisores<=500;i++){
			trigNumber=i*(i+1)/2;
			divisores=2;//todo numero e divisivel por ele msm e 1
			for(int j=2, stop=trigNumber/2;j<stop;j++){
				if (trigNumber%j==0){
					divisores+=2;
					stop=trigNumber/j;
				}
				System.out.print("");
			}
		}
		System.out.print("Triangle "+i+": \nValue: "+trigNumber+"\nDivisors: "+divisores);
		
		return true;
	}
}
