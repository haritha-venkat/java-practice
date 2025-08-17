import java.util.Scanner;
class print {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String word = scan.next();
        char character = scan.next().charAt(0);
        System.out.printf(num + " " + word + " " + character);
        scan.close();


    }
}
