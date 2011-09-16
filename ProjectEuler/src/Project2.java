
public class Project2 {
	
	public static boolean run(){
		int resultado=0;
		int j=1, i=1, aux=0;
		System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.");
		while (i<4000000)
		{
			if (i%2==0)
				resultado+=i;
			aux=i;
			i+=j;
			j=aux;
		}
		System.out.println(resultado);
		return true;
	}	
}
