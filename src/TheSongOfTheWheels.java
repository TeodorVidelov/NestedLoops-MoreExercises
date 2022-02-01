import java.util.Scanner;
public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;

        for (int n1 = 1; n1 <= 9; n1++) {
            for (int n2 = 1; n2 <= 9; n2++) {
                for (int n3 = 1; n3 <= 9; n3++) {
                    for (int n4 = 1; n4 <= 9; n4++) {
                        if (n1 * n2 + n3 * n4 == magicNumber){
                            if (n1 < n2 && n3 > n4){
                                System.out.printf("%d%d%d%d ",n1,n2,n3,n4);
                                counter++;
                                if (counter == 4){
                                    a = n1;
                                    b = n2;
                                    c = n3;
                                    d = n4;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (counter >= 4){
            System.out.println("");
            System.out.printf("Password: %d%d%d%d",a,b,c,d);
            }
        else {
            System.out.println("");
            System.out.println("No!");
        }
    }
}