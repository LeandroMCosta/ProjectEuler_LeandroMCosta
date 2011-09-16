
public class Project3 {
	public static boolean run(){
		boolean primo = false;
		double i,j=1,number,mc=1;
		System.out.println("Find the largest prime factor of a composite number.");
		number=main.chooseANumber();
		if(number%2==0){
			mc*=2;
			System.out.print("2.0");
		}
		for(i=3,j=number/mc;j>i;i=i+2,j=(j%2==0)?j-1:j-2)
		{
			if (number%i==0) {
				primo = Project3.itsPrime(i);
				if (primo) {
					System.out.print(" " + i);
					mc *= i;
					j = number / mc;
				}
			}			
			if (number%j==0) {
				primo = Project3.itsPrime(j);
				if (primo)
					System.out.print(" " + j);
			}			
		}
		return true;
	}

	public static boolean itsPrime(double number) {
		// TODO Auto-generated method stub 600851475143 
		if(number/2==1)
			return true;
		if(number%2==0)
			return false;
		for(double i=3,j=number/3;j>=i;i=i+2,j=(j%2==0)?j-1:j-2){
			if ((number%j==0)||(number%i==0))
				return false;
			else
				j=number/i;
		}
		return true;
	}	
}
