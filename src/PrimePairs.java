import java.util.Scanner;
public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startOfFirstPair = Integer.parseInt(scanner.nextLine());
        int startOfSecondPair = Integer.parseInt(scanner.nextLine());
        int diffBetweenFirstPair = Integer.parseInt(scanner.nextLine());
        int diffBetweenSecondPair = Integer.parseInt(scanner.nextLine());

        boolean isFirstPartPrime = false;
        boolean isSecondPartPrime = false;

        for (int firstPart = startOfFirstPair; firstPart <= startOfFirstPair + diffBetweenFirstPair ; firstPart++) {
            for (int secondPart = startOfSecondPair; secondPart <= startOfSecondPair + diffBetweenSecondPair; secondPart++) {
                    isFirstPartPrime = true;
                    isSecondPartPrime = true;

                for (int a = 2; a <= Math.sqrt(firstPart); a++) {
                    if (firstPart % a == 0){
                        isFirstPartPrime = false;
                        break;
                    }
                }
                for (int b = 2; b <= Math.sqrt(secondPart); b++) {
                    if (secondPart % b == 0){
                        isSecondPartPrime = false;
                        break;
                    }
                }
                if (isFirstPartPrime && isSecondPartPrime){
                    System.out.printf("%d%d \n",firstPart,secondPart);
                }
            }
        }
    }
}