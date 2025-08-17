import java.util.Scanner;
class loop2 {
    public static void main(String[] args)
    {
        System.out.println("enter value :");

        Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();


        for(int i=1;i*x<=1000;i++)
        {
            System.out.println(x*i);
        }
            scan.close();

    }
    
}
