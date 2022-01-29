import java.util.Scanner;
public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCoins1lv = Integer.parseInt(scanner.nextLine());
        int countCoins2lv = Integer.parseInt(scanner.nextLine());
        int countBanknotes5lv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int oneLeva = 0; oneLeva <= countCoins1lv; oneLeva++) {
            for (int twoLeva = 0; twoLeva <= countCoins2lv; twoLeva++) {
                for (int fiveLeva = 0; fiveLeva <= countBanknotes5lv; fiveLeva++) {

                    if (oneLeva * 1 + twoLeva * 2 + fiveLeva * 5 == sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n",oneLeva,twoLeva,fiveLeva,sum);
                    }
                }
            }
        }
    }
}