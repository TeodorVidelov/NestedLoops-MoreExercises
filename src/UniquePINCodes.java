import java.util.Scanner;
public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1UpperLimit = Integer.parseInt(scanner.nextLine());
        int n2UpperLimit = Integer.parseInt(scanner.nextLine());
        int n3UpperLimit = Integer.parseInt(scanner.nextLine());

        for (int n1 = 2; n1 <= n1UpperLimit; n1 += 2) {
            for (int n2 = 2; n2 <= n2UpperLimit; n2 += 1) {
                for (int n3 = 2; n3 <= n3UpperLimit; n3 += 2) {
                    if (n2 == 2 || n2 == 3 || n2 == 5 || n2 == 7){
                        System.out.printf("%d %d %d\n",n1,n2,n3);
                    }
                }
            }
        }
    }
}
