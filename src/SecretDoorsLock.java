import java.util.Scanner;
public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimitOfHundreds = Integer.parseInt(scanner.nextLine());
        int upperLimitOfTens = Integer.parseInt(scanner.nextLine());
        int upperLimitOfOnes = Integer.parseInt(scanner.nextLine());

        for (int n1 = 2; n1 <= upperLimitOfHundreds; n1++) {
            if (n1 % 2 == 0){
            for (int n2 = 2; n2 <= upperLimitOfTens; n2++) {
                if (n2 == 2 || n2 == 3 || n2 == 5 || n2 == 7){
                for (int n3 = 2; n3 <= upperLimitOfOnes; n3++) {
                    if (n3 % 2 == 0) {

                        System.out.printf("%d %d %d\n",n1,n2,n3);
                            }
                        }
                    }
                }
            }
        }
    }
}