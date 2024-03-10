import java .util.Scanner;
class pattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        //int a = 6;

        for (int i = 1; i <= 100; i++) {
            if (a == i * (i + 1)) {
                System.out.println("number is pronic");

            }
        
            else {
                System.out.println("number is not pronic");
                break;
            }
        }
    }
}
