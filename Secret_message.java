import java.util.*;
public class Secret_message {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int A= 0;
		while(A == 0){
		incrypt();
		Decrypt();
		}	
	}
	public static void incrypt(){
		char[] incrypt = {'a','b','c','d','e','f','g','h','i','j','k', 'l','m', 'n', 'o', 'p', 'q','r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ',
				          'A','B','C','D','E','F','G','H','I','J','K', 'L','M', 'N', 'O', 'P', 'Q','R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!',
				          '@','#','$','%','^','&','*','*','(',')','-','_','+','=', '/',':',';','"','\'','<','>','?',',','.','1','2','3','4','5','6',
				          '7','8','9','0','~','`'};
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter message: ");
		String input = console.nextLine();
		
		Random rand = new Random();
		int Rand = rand.nextInt(89)+1;
		
		char New = 0;
		String K = "";
		
		for (int i = 0; i < input.length();i++){
			int j = 0;
			while(input.charAt(i)!= incrypt[j]){
				j++;
			}
			if (j+Rand > 89){
				New  = (char) (incrypt[((j+Rand)-89)]);
				K+=New;
			}else{
				New  = (char) (incrypt[j+Rand]);
				K+=New;	
			}
		}
		System.out.println("Your key is " + Rand + "\n" +K);
	}
	
	public static void Decrypt(){
		char[] incrypt = {'a','b','c','d','e','f','g','h','i','j','k', 'l','m', 'n', 'o', 'p', 'q','r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ',
						  'A','B','C','D','E','F','G','H','I','J','K', 'L','M', 'N', 'O', 'P', 'Q','R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!',
						  '@','#','$','%','^','&','*','*','(',')','-','_','+','=', '/',':',';','"','\'','<','>','?',',','.','1','2','3','4','5','6',
						  '7','8','9','0','~','`'};
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter message: ");
		String input = console.nextLine();
		
		System.out.println("Enter Key");
		int key = console.nextInt();
		
		char New = 0;
		String K = "";
		
		for (int i = 0; i < input.length();i++){
			int j = 0;
			while(input.charAt(i)!= incrypt[j]){
				j++;
			}
			if (j-key < 0){
				New  = (char) (incrypt[((j-key)+89)]); 
				K+=New;	
			}else{
			New  = (char) (incrypt[(j-key)]);
			K+=New;	
			}
		}
		System.out.println(K);
	}
}