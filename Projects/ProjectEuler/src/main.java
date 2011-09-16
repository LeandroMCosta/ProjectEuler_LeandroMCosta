import java.io.IOException;

public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int projeto=-1;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		while(projeto!=0){
			System.out.println("\nChoose a Project");
			 projeto = scanner.nextInt();
			switch (projeto){
			case 1: 
				Project1.run();
				break;		
			case 2: 
				Project2.run();
				break;		
			case 3: 
				Project3.run();
				break;		
			case 4: 
				Project4.run();
				break;
			case 5: 
				Project5.run();
				break;
			case 6: 
				Project6.run();
				break;
			case 7: 
				Project7.run();
				break;
			case 8: 
				Project8.run();
				break;
			case 9:
				Project9.run();
				break;
			case 10: 
				Project10.run();
				break;
			case 11: 
				Project11.run();
				break;
			case 12: 
				Project12.run();
				break;
			case 13: 
				Project13.run();
				break;
			default:
				System.out.println("Project nonexistent");
			}
		}
	}
	public static double chooseANumber()
	{
		double number=0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Choose a number:");
		number = scanner.nextDouble();
		return number;
	}

}
