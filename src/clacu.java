import java.util.Scanner;

public class clacu {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row:");
        int n = sc.nextInt();
        for(int  i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
