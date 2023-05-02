import java.util.Scanner;

public class CopyCurd {
    public void DeleteProduct()
    {

        Product[] pobj=new Product[3];
        Scanner sobj=new Scanner(System.in);
        System.out.print("Enter product ID for Delete=");
        int deleteID = sobj.nextInt();
        int k=0;
        for(int i=0;i<pobj.length;i++) {
            if (pobj[i].getPid() == deleteID) {
                pobj[i]=null;
                System.out.println("Product Delete Successfully");
                ++k;
            }
           if(k==0)
               System.out.println("Given record not exit");
        }
    }
}
