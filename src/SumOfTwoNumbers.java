import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countOfCombinations = 0;
        boolean isValidCombination = false;
        for (int n1 = startOfInterval; n1 <= endOfInterval; n1++) {
            for (int n2 = startOfInterval; n2 <= endOfInterval; n2++) {

                countOfCombinations++;

                if (n1 + n2 == magicNumber){
                    isValidCombination = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",countOfCombinations,n1,n2,magicNumber);
                }
            }
            if (isValidCombination){
                break;
            }
        }
        if (!isValidCombination){
            System.out.printf("%d combinations - neither equals %d",countOfCombinations,magicNumber);
        }
    }
}