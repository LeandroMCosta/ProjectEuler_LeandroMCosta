
public class Project10 {
	public static boolean run(){
		System.out.println("Calculate the sum of all the primes below N.");
		double N=main.chooseANumber(),sum=0;
		for(double i=2;i<N;i++){
			if(Project3.itsPrime(i))
				sum+=i;
		}
		System.out.print(sum);
		
		return true;
	}
}
