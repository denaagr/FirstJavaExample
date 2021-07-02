package se.lexicon.assignmentVendingMchine;

import java.lang.String;

public class Fruit extends Product {


    public Fruit(String name, String description, int price,int productNumber) {
        super(name, description, price,productNumber);
    }

    @Override
    public String Examine(String name) {
        return name;
    }



    @Override
    public void use() {
        System.out.println("peel it and eat, enjoy!");

    }
}
