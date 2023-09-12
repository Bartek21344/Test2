import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product mleko = new Product( "Mlekowita", 4.99,
                "nabiał", 7, 23);
        mleko.setName("Łaciate");
        mleko.setPrice(5.75);
//        mleko.set = "nabiał";
//        mleko.amount = 5;

        Product cukier = new Product();

        System.out.println(mleko);
        System.out.println(mleko.getName());
        System.out.println(mleko.getPrice());

        System.out.println(cukier.getName());
        System.out.println(cukier.getPrice());

        System.out.printf("Cena brutto %s wynosi %.2f,",
                mleko.getName(), mleko.countPriceVAT());
        System.out.println();

        System.out.printf("%.2f", mleko.countValueProduct());

    }
}