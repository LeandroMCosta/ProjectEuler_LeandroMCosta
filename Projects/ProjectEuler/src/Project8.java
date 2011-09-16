
public class Project8 {
	public static boolean run(){
		String number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		System.out.println("Find the greatest product of five consecutive digits in the 1000-digit number.\n" +
											"7316717653133062491922511967442657474235534919493496983" +
											"5203127745063262395783180169848018694788518438586156078" +
											"9112949495459501737958331952853208805511125406987471585" +
											"2386305071569329096329522744304355766896648950445244523" +
											"1617318564030987111217223831136222989342338030813533627" +
											"6614282806444486645238749303589072962904915604407723907" +
											"1381051585930796086670172427121883998797908792274921901" +
											"6997208880937766572733300105336788122023542180975125454" +
											"0594752243525849077116705560136048395864467063244157221" +
											"5539753697817977846174064955149290862569321978468622482" +
											"8397224137565705605749026140797296865241453510047482166" +
											"3704844031998900088952434506585412275886668811642717147" +
											"9924442928230863465674813919123162824586178664583591245" +
											"6652947654568284891288314260769004224219022671055626321" +
											"1111093705442175069416589604080719840385096245544436298" +
											"1230987879927244284909188845801561660979191338754992005" +
											"2406368991256071760605886116467109405077541002256983155" +
											"20005593572972571636269561882670428252483600823257530420752963450");
		int total = number.length(),max=0;
		for(int i=0;i+5<total;i++){
			
			max = (Math.max(max, (Integer.parseInt(number.substring(i,i+1))*Integer.parseInt(number.substring(i+1,i+2))*
					Integer.parseInt(number.substring(i+2,i+3))*Integer.parseInt(number.substring(i+3,i+4))*
					Integer.parseInt(number.substring(i+4,i+5)))));
		}
		
		System.out.println(max);
		return true;
	}
}