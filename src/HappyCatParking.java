import java.util.Scanner;
public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int countHoursForEachDay = Integer.parseInt(scanner.nextLine());

        double priceOfParking = 0;
        double totalSum = 0;
        for (int days = 1; days <= countDays; days++) {
            for (int hours = 1; hours <= countHoursForEachDay; hours++) {

                if (days % 2 == 0 && hours % 2 != 0){
                    priceOfParking += 2.50;
                    totalSum += 2.50;
                }
                else if (days % 2 != 0 && hours % 2 == 0){
                    priceOfParking += 1.25;
                    totalSum += 1.25;
                }
                else {
                    priceOfParking += 1.00;
                    totalSum += 1.00;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n",days,priceOfParking);
            priceOfParking = 0;
        }
        System.out.printf("Total: %.2f leva",totalSum);
    }
}