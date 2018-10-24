import java.util.*;

public class ImprovedBinaryConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Binary: ");
		int number = input.nextInt();
		int sum = 0;
        for (int i=1;i<11;i++){
		int places = number % (int)Math.pow(10, i) / (int)Math.pow(10,i-1);
        sum+=places*Math.pow(2,i-1);
        }
        System.out.println("Decimal:" + sum);
        main(null);
        }
	}
