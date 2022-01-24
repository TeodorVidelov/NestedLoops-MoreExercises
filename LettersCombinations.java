import java.util.Scanner;
public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        char startLowerCaseAtoZ = scanner.nextLine().charAt(0);
        char endLowerCaseZ = scanner.nextLine().charAt(0);
        char missLowerCaseAtoZ = scanner.nextLine().charAt(0);

        int validCombinations = 0;

        for (char i = startLowerCaseAtoZ; i <= endLowerCaseZ; i++) {
            for (char j = startLowerCaseAtoZ; j <= endLowerCaseZ; j++) {
                for (char k = startLowerCaseAtoZ; k <= endLowerCaseZ; k++) {
                    if (i != missLowerCaseAtoZ && j != missLowerCaseAtoZ && k != missLowerCaseAtoZ){
                        validCombinations++;
                        sb.append(i);
                        sb.append(j);
                        sb.append(k);
                        sb.append(" ");

                    }
                }
            }
        }
        System.out.print(sb.toString());
        System.out.print(validCombinations);
    }
}