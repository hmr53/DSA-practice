import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static  List<Integer> remainders = new ArrayList<Integer>();

    public static void main(String[] args) {
      testDecimalToBinary();
        StringBuffer binaryValue = new StringBuffer();
        for (Integer rem: remainders.reversed()
             ) {
            binaryValue.append(rem.toString());
        }
        System.out.println(binaryValue);
    }

    public static void testSumDigits() {
        System.out.println("Enter Integer Number to Get sum of Digits : ");
        SumOfDigits sumOfDigits = new SumOfDigits();
        Scanner scanner = new Scanner(System.in);
        int result = sumOfDigits.sumOfDigits(scanner.nextInt());
        System.out.println(result);
    }

    public static void testCalculatePower() {
        System.out.println("Enter Integer Number need to get power : ");
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("next line Enter the required power : ");
        Scanner powerScanner = new Scanner(System.in);
        CalculatePower calculatePower = new CalculatePower();
        int result = calculatePower.calculatePower(numberScanner.nextInt(), powerScanner.nextInt());
        System.out.println(result);
    }

    public static void testGCD() {
        System.out.println("Enter 1st number : ");
        Scanner numberScanner1 = new Scanner(System.in);
        System.out.println("next line Enter the 2nd number : ");
        Scanner numberScanner2 = new Scanner(System.in);
        GCD gcd = new GCD();
        int result = gcd.biggestGD(numberScanner1.nextInt(), numberScanner2.nextInt());
        System.out.println(result);
    }

    public static void testDecimalToBinary(){
        System.out.println("Enter decimal number to convert in to binary: ");
        Scanner numberScanner = new Scanner(System.in);
       DecimalToBinary decimalToBinary = new DecimalToBinary();
        int result = decimalToBinary.decimalToBinarySolution(numberScanner.nextInt());
        System.out.println(result);
    }
}

