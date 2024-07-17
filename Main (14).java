//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("The Alchemist",50.6,"Paulo");
        Book b2 = new Book("The 48 laws of power",69.6,"Robert");
        Book b3 = new Book("The silent patient",70.3,"Alex");

        System.out.println("Book Name: "+b1.getName());
        System.out.println("Book Author: "+b1.getAuthor());
        System.out.println("Book price: "+b1.getPrice());
        System.out.println("Book price after discount: " + b1.getDiscount());
        System.out.println("**************************************");


        System.out.println("Book Name: "+b2.getName());
        System.out.println("Book Author: "+b2.getAuthor());
        System.out.println("Book price: "+b2.getPrice());
        System.out.println("Book price after discount: " + b2.getDiscount());
        System.out.println("**************************************");

        System.out.println("Book Name: "+b3.getName());
        System.out.println("Book Author: "+b3.getAuthor());
        System.out.println("Book price: "+b3.getPrice());
        System.out.println("Book price after discount: " + b3.getDiscount());
        System.out.println("**************************************");


        Movie m1 = new Movie("The Iron Giant",40.5,"Brad Bird");
        Movie m2 = new Movie("Finding Nemo",40.5,"Andrew Stanton");
        Movie m3 = new Movie("Matilda",40.5,"Danny DeVito");

        System.out.println("Movie Name: "+m1.getName());
        System.out.println("Movie director: "+m1.getDirector());
        System.out.println("Movie Price: "+m1.getPrice());
        System.out.println("Movie price after discount: "+m1.getDiscount());
        System.out.println("**************************************");

        System.out.println("Movie Name: "+m2.getName());
        System.out.println("Movie director: "+m2.getDirector());
        System.out.println("Movie Price: "+m2.getPrice());
        System.out.println("Movie price after discount: "+m2.getDiscount());
        System.out.println("**************************************");

        System.out.println("Movie Name: "+m3.getName());
        System.out.println("Movie director: "+m3.getDirector());
        System.out.println("Movie Price: "+m3.getPrice());
        System.out.println("Movie price after discount: "+m3.getDiscount());
        System.out.println("**************************************");
    }
}