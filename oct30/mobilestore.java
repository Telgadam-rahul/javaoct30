
/*A mobile store sells different phone models. Each phone has a brand and price, but
they are all sold by the same store.
Your task:

1. Define a class Mobile with:
A static variable storeName (same for all mobiles).
Two instance variables brand and price (unique per phone).
A method showDetails() to print phone details.
2. In main() , update the store name before creating mobile objects.

*/
public class mobilestore {
    static String storename;
    String brand;
    int price;
   public void showDetails(){
    storename="name";
    brand="brandname";
    price=0;
    System.out.println("name:"+storename+"\n"+"brandname:"+brand+"\n"+"pricecost:"+price);
    System.out.println("----------------");
   }
   public static void main(String[] args) {
    storename="rahul";
    mobilestore obj1=new mobilestore();
    obj1.brand="asus";
    obj1.price=20000;
    mobilestore obj2=new mobilestore();
    obj2.brand="vivo";
    obj2.price=2000;
    obj1.showDetails();
    obj2.showDetails();
    
   }

   }

    
