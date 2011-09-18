
public class Project16 {
	public static boolean run(){
		System.out.println("What is the sum of the digits of the number 2^N?");
		int sum=0;
		String pow="";		
		pow += java.math.BigInteger.valueOf(2).pow((int)main.chooseANumber()).toString();
		System.out.println("\n"+pow);
		for(int i=0;i<pow.length();i++){
			sum+=(int)Integer.parseInt(pow.substring(i,i+1));
		}
		System.out.print("\n"+sum);
		
		return true;
	}
}
