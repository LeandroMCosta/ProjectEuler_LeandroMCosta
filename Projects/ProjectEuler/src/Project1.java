
public class Project1 {

	public static boolean run(){
		int resultado=0;
		System.out.println("Add all the natural numbers below one thousand that are multiples of 3 or 5.");
		for (int i=1;i<1000;i++)
		{
			if ((i%3==0)||(i%5==0))
				resultado+=i;
		}
		System.out.println(resultado);
		return true;
	}	
}
