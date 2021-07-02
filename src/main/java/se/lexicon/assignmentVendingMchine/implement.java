package se.lexicon.assignmentVendingMchine;

import java.lang.String;
public class implement {
    public static void main(String[] args) {
       // Product[] stockedProducts=new Product[cola,fanta,powerade,pizza,pai,sandwich,orange,apple] ;

        Drink cola=new Drink("Cola","38 calories", 20,"50cl",1);
        Drink fanta=new Drink("Fanta","30 calories",20,"50cl",2);
        Drink powerade=new Drink("Powerade","130 calories",60,"50cl",3);


        Food pizza=new Food("pizza","300 calories",100,4);
        Food pai=new Food("Pai","250 calories",70,5);
        Food sandwich=new Food("Sandwich","200 calories",120,6);


        Fruit orange=new Fruit("orange","20 calories",10,7);
        Fruit apple=new Fruit("Apple","10 calories",10,8);














    }

}
