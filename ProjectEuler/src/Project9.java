
public class Project9 {
	public static boolean run(){
		System.out.println("Find the only Pythagorean triplet, {a, b, c}, for which a + b + c = 1000.");
		//c=1000-b-a
		int c;
		for(int a=1;a<500;a++){
			for (int b=a;b<1000;b++){
				c=1000-a-b;
				if (c>0){
					if (c*c==(a*a+b*b))
						System.out.println(a+"+"+b+"+"+c+"=1000" +
											"\n"+a+"^2+"+b+"^2="+c+"^2");
				}
			}
		}		
		return true;
	}
}
