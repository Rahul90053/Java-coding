import java.util.Scanner;

public class clacu {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char n = sc.next().charAt(0);
        for(char i='A'; i<=n; i++){
            for(char j='A'; j<=n; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
