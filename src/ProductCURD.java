import java.util.Scanner;

public class ProductCURD {

      Product[] pobj=new Product[3];
      Scanner sobj=new Scanner(System.in);
    public void addProduct(){

        for(int i=0;i<pobj.length;i++){
            System.out.println("Enter Product ID for P"+i+"=");
            int pId=sobj.nextInt();
            System.out.println("Enter Product Name for P"+i+"=");

            String pName=sobj.next();
            System.out.println("Enter Product quantity for p"+i+"=");
            int pqty =sobj.nextInt();
            System.out.println("Enter Price  for P"+i+"=");
            int pPrice=sobj.nextInt();

            Product product=new Product(pId,pName,pqty,pPrice);
            pobj[i]=product;
            System.out.println("Product add successfully");
        }}
     public void vewAllProduct(){
                  for (int i = 0; i < pobj.length; i++) {
                      System.out.println("Product ID: " + pobj[i].getPid());
                      System.out.println("Product Name: " + pobj[i].getPname());
                      System.out.println("Product Quantity: " + pobj[i].getQat());
                      System.out.println("Product Price: " + pobj[i].getPrice());
                      System.out.println("------------------------");
                  }
              }


     public void viewProductById(){
         System.out.println("Enter product ID");
         int pid = sobj.nextInt();
         for(Product uObj :pobj )
         {
             if(uObj.getPid()==pid)
             {
                 System.out.println(" Display product  ID="+uObj.getPid()+"\n\t"+"Product Name="+uObj.getPname()+"\n\t" +
                         ""+"Product Quantity="+uObj.getQat()+"\n\t"+"Product Price="+uObj.getPrice());}
                 else
                      { System.out.println("Enter Valid product ID for View Product");}
             }
         }


    public void updateProduct(){
        System.out.print("Enter product ID for update=");
        int pid = sobj.nextInt();
        for(Product uObj :pobj )
        {
            if(uObj.getPid()==pid)
            {
                System.out.println(" Display product before update Info ID="+uObj.getPid()+"\n\t"+"Name="+uObj.getPname()+"\n\t" +
                        ""+"Quantity="+uObj.getQat()+"\n\t"+"Price="+uObj.getPrice());
                System.out.println("Enter Quantity=");
                int qa=sobj.nextInt();
                uObj.setQat(qa);
                System.out.println("Enter new price=");
                int price=sobj.nextInt();
                uObj.setPrice(price);
                System.out.println("Update Successfully quantity and price");
                System.out.println(" Product ID="+uObj.getPid()+"\n\t"+"Product Name="+uObj.getPname()+"\n\t" +
                        ""+"Product Quantity="+uObj.getQat()+"\n\t"+"Product Price="+uObj.getPrice());
            }
                else
                System.out.println("Enter Valid product ID for Update");
        }
        }
       public void DeleteProduct()
       {
        System.out.print("Enter product ID for Delete=");
        int deleteID = sobj.nextInt();

        for(int i=0;i<pobj.length;i++) {
               if (pobj[i].getPid() == deleteID) {
                   for (int j = i; j < pobj.length - 1; j++){
                       pobj[j] = pobj[j + 1];}
               }break;
           }
           System.out.println("Display product after delete");
           for (int i = 0; i <pobj.length-1; i++) {

               System.out.println(" Product ID="+pobj[i].getPid()+"\n\t"+"Product Name="+pobj[i].getPname()+"\n\t" +
                       ""+"Product Quantity="+pobj[i].getQat()+"\n\t"+"Product Price="+pobj[i].getPrice());
           }
           }
    }



