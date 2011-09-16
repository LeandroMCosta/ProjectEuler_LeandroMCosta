
public class Project4 {
	public static boolean run(){
		int num1,num2,aux,resultado=0;
		System.out.println("Find the largest palindrome made from the product of two 3-digit numbers.");

		for(num1=999;num1>100;num1--){
			for(num2=999;num2>100;num2--){
				aux=num1*num2;
				if(aux>resultado){
					if(aux/100000==0){
						//5 digitos
						if  (((aux/10000)==(aux%10))&&
							(((aux%10000)/1000)==((aux%100)/10))){
							resultado=aux;
						}
					}else
					{//6 digitos
						if  (((aux/100000)==(aux%10))&&
							(((aux%100000)/10000)==((aux%100)/10))&&
							(((aux%10000)/1000)==((aux%1000)/100))){
							resultado=aux;
						}
					}
				}
			}
		}
		
		System.out.print(resultado);
		
		return true;
	}	
}
