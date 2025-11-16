import java.util.Scanner;

public class clacu {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = sc.nextInt();
        for(int  i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print("  " );
            }
            for(int j=1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
