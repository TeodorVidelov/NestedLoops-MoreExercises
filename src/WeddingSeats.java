import java.util.Scanner;
public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int countRows = Integer.parseInt(scanner.nextLine());
        int countSeatsOnEvenRow = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int factor = 0;
        for (char i = 'A'; i <= lastSector; i++, countRows++) {
            for (int j = 1; j <= countRows; j++) {
                factor = (j % 2 == 0) ? 2 : 0;
                for (char k = 'a'; k < 'a' + countSeatsOnEvenRow + factor; k++) {
                    System.out.printf("%c%d%c\n",i,j,k);
                    count++;
                }
            }
        }
        System.out.printf("%d",count);
    }
}