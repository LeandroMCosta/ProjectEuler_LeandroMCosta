
public class Project17 {
	public static boolean run(){
		System.out.println("If all the numbers from 1 to N (up to 9999) inclusive were written out in words, how many letters would be used?");
		int N= (int)main.chooseANumber(),sum=0, aux;		
		for(int i=1;i<=N;i++){
			aux=i;
			while (aux>0)
			{
				if (aux>=1000){
					sum+= getValue(aux/1000)+getValue(1000);
					if ((aux%1000>100)&&(aux%1000>0))
						sum+= 3; //and
					aux%=1000;
				}else if(aux>=100){
					sum+= getValue(aux/100)+getValue(100);
					if (aux%100>0)
						sum+= 3; //and
					aux%=100;
				}else if(aux>=20){
					sum+= getValue((aux/10)*10);
					aux%=10;
				}else if(aux<20&&aux>10){
					sum+= getValue(aux);
					aux-=aux;
				}else if(aux<=10){
					sum+= getValue(aux);
					aux-=aux;
				}				
			}
		}
		System.out.print(sum+" Letters");
		return true;
	}
	
	public static int getValue(int i){
		int value=0;
		switch (i){
		case 1: 
			value = 3;
			break;		
		case 2: 
			value = 3;
			break;		
		case 3: 
			value = 5;
			break;		
		case 4: 
			value = 4;
			break;
		case 5: 
			value = 4;
			break;
		case 6: 
			value = 3;
			break;
		case 7: 
			value = 5;
			break;
		case 8: 
			value = 5;
			break;
		case 9:
			value = 4;
			break;
		case 10: 
			value = 3;
			break;
		case 11: 
			value = 6;
			break;
		case 12: 
			value = 6;
			break;
		case 13: 
			value = 8;
			break;
		case 14: 
			value = 8;
			break;
		case 15: 
			value = 7;
			break;
		case 16: 
			value = 7;
			break;
		case 17: 
			value = 9;
			break;
		case 18: 
			value = 8;
			break;
		case 19: 
			value = 8;
			break;		
		case 20: 
			value = 6;
			break;
		case 30: 
			value = 6;
			break;
		case 40: 
			value = 5;
			break;		
		case 50: 
			value = 5;
			break;
		case 60: 
			value = 5;
			break;
		case 70: 
			value = 7;
			break;		
		case 80: 
			value = 6;
			break;
		case 90: 
			value = 6;
			break;
		case 100: 
			value = 7;
			break;
		case 1000: 
			value = 8;
			break;		
		}		
		return value;
	}	
}
