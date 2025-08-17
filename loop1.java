import java.util.Scanner;
class loop1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x:");
        int x = scan.nextInt();
        System.out.println("enter y:");
        int y = scan.nextInt();

        for(int i=0;i<y;i++) {
            System.out.println(x);


        }
                    System.out.println("explanation -> "+ x + " is x and "+y+ " is y, henceforth " + x + " is printed " + y + " times");

        scan.close();


    }
    
}
