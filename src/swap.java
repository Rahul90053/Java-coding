public class swap {
    static void main(String[] args) {
        int a=10 , b=20;
       a= a*b; // 10*20=200
        b=a/b; // 200/20=10
        a=a/b; // 200/10=20
        System.out.println("After the swapping:" +a);
        System.out.println("After the swapping:" +b);
    }
}
