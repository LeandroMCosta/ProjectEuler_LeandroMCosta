
public class Project7 {
	public static boolean run(){
		double number;int j=1;
		System.out.println("What is the Nst prime number?");
		number=main.chooseANumber();
		for(double i=2;j<=number;i++){
			if(Project3.itsPrime(i)){
				if(j==number-1)
					System.out.println(j+1+"�:"+i);
				j++;
			}
		}
		return true;
	}
}
