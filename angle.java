import java.util.Scanner;
class angle {
    public static void main(String[] args)
    {
        System.out.println("enter values");
        Scanner scan = new Scanner(System.in);
        int angle1 = scan.nextInt();
        int angle2 = scan.nextInt();
        int angle3 = scan.nextInt();
        int sum =angle1+angle2+angle3;
        
        if(sum==180)
        {
            System.out.printf("%d\n", sum);
            System.out.println("triangle formed");
        }
        else{
            System.out.printf("%d\n", sum);
            System.out.println("not formed");
        }
        scan.close();
    }

    
}
