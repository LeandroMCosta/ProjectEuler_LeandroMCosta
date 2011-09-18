
public class Project14 {
	public static boolean run(){
		System.out.println("Which starting number, under one million, produces the longest chain following iterative sequence is defined for the set of positive integers:" +
				"n+1 = n/2 (n is even)" +
				"n+1 = 3n + 1 (n is odd)?");
		int count=0, max=0, numberwithmax=0;
		long aux=0;
		for(int number=1000000;number>1;number--){
			count=1;
			aux=number;
			while(aux>1){
				if(aux%2==0){
					aux/=2;
				}else{
					aux=(3*aux)+1;
				}
				count++;
			}
			if (count>max){
				max=count;
				numberwithmax=number;
			}
		}
		System.out.print("Number: "+numberwithmax+" with "+max+" long chain");
		return true;
	}
}
