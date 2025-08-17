import java.util.Scanner;
class grade {
    public static void main(String[] args)
    {
        System.out.println("enter mark:");
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
     
            if(mark>=90)
            {
                System.out.println("Grade A");
                System.out.println("Here "+mark+" is greater than or equal to 90 so its Grade A");

            }
            else if(mark>=80)
            {
                System.out.println("Grade B");
                System.out.println("Here "+mark+" is greater than or equal to 80 so its Grade B");

            }
            else if(mark>=70)
            {
                System.out.println("Grade C");
                System.out.println("Here "+mark+" is greater than or equal to 70 so its Grade C");

            }
            else if(mark >= 60) {
                System.out.println("Grade D");
                                System.out.println("Here "+mark+" is greater than or equal to 60 so its Grade D");

            }
            else {
                System.out.println("FAIL");
                                System.out.println("Here "+mark+" is lesser than or equal to 35 so its FAIL");


                                

            }
       
        scan.close();
    }
    
}
