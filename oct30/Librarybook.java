
/* *A library keeps records of books. Each book has a title and author, but all books
belong to the same library.

Your task:

1. Define a class Book with:

A static variable libraryName (shared by all books).
Two instance variables title and author (unique for each book).
A method displayInfo() to print book details.


2. In main() , update the library name before creating book objects.
*/

public class Librarybook {
    static String StoreName;
    String brand;
    int price;
    public void showDetails(){
        System.out.println("name:"+StoreName);
        System.out.println("brandname:"+brand);
        System.out.println("price is"+price);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
         StoreName="rahul";
        Librarybook obj1= new Librarybook();
        obj1.brand="vivo";
        obj1.price=25000;
        Librarybook obj2= new Librarybook();
        obj2.brand="apple";
        obj1.price=26000;
        obj2.showDetails();
        obj2.showDetails();
    }


    }
    

