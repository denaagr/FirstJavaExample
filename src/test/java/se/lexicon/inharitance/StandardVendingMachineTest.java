package se.lexicon.inharitance;

import org.junit.Test;
import se.lexicon.assignmentVendingMchine.Drink;
import se.lexicon.assignmentVendingMchine.Product;
import se.lexicon.assignmentVendingMchine.StandardVendingMachine;
import se.lexicon.assignmentVendingMchine.VendingMachine;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StandardVendingMachineTest {



    @Test
    public void request() {

        VendingMachine testVM = new StandardVendingMachine();

        Drink cola=new Drink("Cola","38 calories", 20,"50cl",1);
        Drink fanta=new Drink("Fanta","30 calories",20,"50cl",2);
        Drink powerade=new Drink("Powerade","130 calories",60,"50cl",3);
        Product[] products = new Product[] {cola,fanta,powerade};

//        System.out.println(Arrays.toString(products));
        StandardVendingMachine.setStockedProducts(products);
        StandardVendingMachine.setDepositPool(100);

//        System.out.println(Arrays.toString(testVM.getProducts()));

        Product returnCola = testVM.request(1);
        assertEquals(cola,returnCola);

    }

    public void test_request_notWorking(){
    }
    @Test
    public void getProducts(){
        VendingMachine testVM = new StandardVendingMachine();
        Drink cola=new Drink("Cola","38 calories", 20,"50cl",1);
        Drink fanta=new Drink("Fanta","30 calories",20,"50cl",2);
        Drink powerade=new Drink("Powerade","130 calories",60,"50cl",3);
        Product[] products = new Product[] {cola,fanta,powerade};
        Product[] products2 = new Product[] {cola,fanta,powerade};
        System.out.println("all the products:"+ Arrays.toString(products2));
        assertEquals(products,products2);
    }
//    @Test
//    public void getDescription(){
//        VendingMachine testVM = new StandardVendingMachine();
//        Drink cola=new Drink("Cola","38 calories", 20,"50cl",1);
//        Drink fanta=new Drink("Fanta","30 calories",20,"50cl",2);
//        Drink powerade=new Drink("Powerade","130 calories",60,"50cl",3);
//        Product[] products = new Product[] {cola,fanta,powerade};
//
//        Product returnCola = testVM.request(1);
//        assertEquals(cola.getDescription(),returnCola.);
//
//    }
//    @Test
//    public void addCurrency(){
//
//    }

}