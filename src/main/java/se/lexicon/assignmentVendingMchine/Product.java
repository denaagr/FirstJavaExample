package se.lexicon.assignmentVendingMchine;
import java.lang.String;


public abstract class Product {
    String name;
    String description;
    int price;
    int productNumber;

    public Product(String name, String description, int price,int productNumber) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productNumber = productNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public abstract String Examine(String name);

    public abstract void use();



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
