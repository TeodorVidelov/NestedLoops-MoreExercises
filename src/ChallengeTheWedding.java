import java.util.Scanner;
public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMenClients = Integer.parseInt(scanner.nextLine());
        int countWomenClients = Integer.parseInt(scanner.nextLine());
        int maxCountTables = Integer.parseInt(scanner.nextLine());

        int countCombinations = 0;

        for (int i = 1; i <= countMenClients; i++) {
            for (int j = 1; j <= countWomenClients; j++) {
                countCombinations++;
                if (countCombinations > maxCountTables){
                    break;
                }
                else {
                    System.out.printf("(%d <-> %d) ",i,j);
                }
            }
        }
    }
}