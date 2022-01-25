import java.util.Scanner;
public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());

        for (int n1 = startOfInterval; n1 <= endOfInterval; n1++) {
            for (int n2 = startOfInterval; n2 <= endOfInterval; n2++) {
                for (int n3 = startOfInterval; n3 <= endOfInterval; n3++) {
                    for (int n4 = startOfInterval; n4 <= endOfInterval; n4++) {

                        boolean isEvenFirst = n1 % 2 == 0;
                        boolean isOddFirst = n1 % 2 != 0;
                        boolean isEvenFour = n4 % 2 == 0;
                        boolean isOddFour = n4 % 2 != 0;
                        boolean isFirstBigger = n1 > n4;
                        boolean evenSum = (n2 + n3) % 2 == 0;

                        if ((isEvenFirst  && isOddFour) || (isOddFirst && isEvenFour)){
                            if (isFirstBigger && evenSum){
                                System.out.printf("%d%d%d%d ",n1,n2,n3,n4);
                            }
                        }

                    }

                }
            }
        }

    }
}