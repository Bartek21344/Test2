public class Product {
    private String name;
    private double price;
    private String category;
    private int amount;
    private int vat;


    public Product() {
    }

    public Product(String name, double price, String category, int amount, int vat) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.amount = amount;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double countPriceVAT(){
        double priceVAT = this.price * (100 + this.vat) /100;

        return priceVAT;

    }
    public double countValueProduct(){
        double ValueProduct = this.price * (100 + this.vat) / 100 * amount;

    return ValueProduct;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", vat=" + vat +
                '}';
    }
}
