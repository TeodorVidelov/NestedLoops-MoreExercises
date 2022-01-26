import java.util.Scanner;
public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxCountPasswords = Integer.parseInt(scanner.nextLine());

        int symbolA = 35;
        int symbolB = 64;
        int counter = 0;
        while (symbolA <= 55){
            while (symbolB <= 96){
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= b; j++) {

                        char one = (char)symbolA;
                        char two = (char)symbolB;

                        System.out.printf("%c%c%d%d%c%c|",one,two,i,j,two,one);
                        counter += 1;
                        symbolA++;
                        symbolB++;
                        if (counter == maxCountPasswords){
                            return;
                        }
                        if (symbolA > 55){
                            i = 35;
                        }
                        if (symbolB > 96){
                            symbolA = 64;
                        }
                        if (i == a && j == b){
                            return;
                        }
                    }
                }
            }
        }
    }
}