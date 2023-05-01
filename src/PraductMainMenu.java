import java.util.Scanner;

public class PraductMainMenu {
        static ProductCURD productCURD=new ProductCURD();


    public static void ProductMenu(){
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("======================================================  ");
                System.out.println("                1)AddProduct                            ");
                System.out.println("                2)View All Product                      ");
                System.out.println("                3)View By ID Product                    ");
                System.out.println("                4)Update Product                        ");
                System.out.println("                5)Delete Product                        ");
                System.out.println("                6)Back                                  ");
                System.out.println("========================================================");
                System.out.print("Enter the choice=");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                       productCURD.addProduct();
                       break;

                    case 2:
                       productCURD.vewAllProduct();
                        break;

                    case 3:
                      productCURD.viewProductById();
                        break;

                    case 4:
                       productCURD.updateProduct();
                        break;
                    case 5:
                      productCURD.DeleteProduct();
                      break;
                    case 6:
                        Client_product.main(null);
                        break;
                    default:
                        System.out.println("Choose 1 to 6Between");

                }
            }
        }

    }
