import java.util.Scanner;
public class k 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in) ;
        
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            long power = (long)Math.pow(a,b);
long i =1;
            while(power>0) 
            {
                long ans=power%10;
                if(k==i) {
                    System.out.println(ans) ;
                    break;
                }
                i++;
                power=power/10;
            }

        
    } 
}
    

