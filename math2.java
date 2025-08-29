import java.util.Scanner;
public class math2 {

    public static void main(String[] args) {
        int rev=0;
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int x=n;
        while(n>0) {
            rev=rev*10+(n%10);
            n=n/10;
        }
        if(rev==x) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }
    
    
}
