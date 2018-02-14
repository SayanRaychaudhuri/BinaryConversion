import java.util.*;
public class BinaryConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int binary = input.nextInt();
		int ones = binary % 10;
        int tens = binary % 100 / 10;
        int hundreds = binary % 1000 / 100;
        int thousands = binary % 10000 / 1000;
        int tenthousands = binary % 100000 / 10000;
        int hundredthousands = binary % 1000000 / 100000;
        int millions = binary % 10000000 / 1000000;
        int tenmillions = binary % 100000000 / 10000000;
        int hundredmillions = binary % 1000000000 / 100000000;
        int decimal = ones+tens*2+hundreds*4+thousands*8+tenthousands*16+hundredthousands*32+millions*64+tenmillions
        		*128+hundredmillions*256;
        System.out.println(decimal);
        main(null);
	}

}
