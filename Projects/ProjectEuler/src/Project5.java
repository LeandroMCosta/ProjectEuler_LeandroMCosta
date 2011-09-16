
public class Project5 {
	public static boolean run(){
		System.out.println("What is the smallest positive number that is evenly divisible by all of the numbers from 1 to x?");
		//The smallest positive number is equal the multiplication of the powers below X of the prime numbers from 1 to X
		int resultado=1,pow=1,x;
		x=(int)main.chooseANumber();
		for(int i=2;i<=x;i++){
			if(Project3.itsPrime(i))
			{
				pow=i;
				while(pow*i<=x){
					pow*=i;
				}
				resultado*=pow;
			}
		}
		System.out.print(" "+resultado);
		return true;
	}
}
