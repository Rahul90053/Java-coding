public class greater {
    public static void main(String args[]){
        int a=10 , b=25 , c=6;
        if(a>b && a>c){
            System.out.println("A is greater:" +a);
        }else if(b>a && b>c){
            System.out.println("B is greater:" +b);
        }else{
            System.out.println("C is greater:" +c);
        }
    }
}
