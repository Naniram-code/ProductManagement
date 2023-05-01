import java.util.Scanner;

public class Client_product {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("======================================================  ");
            System.out.println("                1)Product                               ");
            System.out.println("                2)Exit                                  ");
            System.out.println("========================================================");
            System.out.print("Enter the choice=");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
              PraductMainMenu.ProductMenu();
                    break;

                case 2:
                    System.out.println("*******************Thanks For Using Apps****************");
                    System.exit(0);

                default:
                    System.out.println("Enter 1 to 2 ");

            }}
        }}
