import java.util.Scanner;
class name {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
       
               System.out.println("enter first name:");


        String fname = scan.nextLine();
                                            System.out.println("enter last name:");  

            String lname = scan.nextLine();
                                                                System.out.println("enter number of times the name should be printed:");


            int n = scan.nextInt();

        String name = fname + lname;
         
        for (int i=1;i<=n;i++) {
            System.out.println(name);
        }


    

    }
}
