package se.lexicon.assignmentVendingMchine;

import java.lang.String;

public class Drink extends Product {
     String volume;
    private String[] drinkInfo;

    public Drink(String name, String description, int price,String volume,int productNumber) {
        super(name, description, price,productNumber);
        this.volume=volume;
    }


    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public  String Examine(String name){

        return "Product Number: " + getProductNumber()+
                "This drink's name is: " + getName() +
                "description" + getDescription();
    }

    @Override
    public  void use(){
        System.out.println("Open "+ getName() +" and drink, enjoy!");
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name=" + name +
                ", description=" + description +
                ", price=" + price +
                '}';
    }
}
