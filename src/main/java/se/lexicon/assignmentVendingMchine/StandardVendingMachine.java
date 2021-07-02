package se.lexicon.assignmentVendingMchine;

import java.util.Arrays;

public class StandardVendingMachine  implements VendingMachine {
    public static int depositPool;
    public static Product[] stockedProducts = new Product[0];


    public static int getDepositPool() {
        return depositPool;
    }

    public static void setDepositPool(int depositPool) {
        StandardVendingMachine.depositPool = depositPool;
    }

    public static Product[] getStockedProducts() {
        return stockedProducts;
    }

    public static void setStockedProducts(Product[] stockedProducts) {
        StandardVendingMachine.stockedProducts = stockedProducts;
    }

    @Override
    public void addCurrency(int amount) {
        depositPool = depositPool + amount;
        System.out.println("Deposit pool=" + depositPool);
    }


    @Override
    public int endSession() {
        int change = depositPool;
        depositPool = 0;
        return change;
    }


    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public String getDescription(int productNumber) {
        for (Product p : stockedProducts) {
            if (p.getProductNumber() == productNumber) {
                return p.getDescription();
            }
        }return null;
    }

    @Override
    public String[] getProducts() {

        //Products (many)
        Product[] stockedProducts2 = Arrays.copyOf(stockedProducts, stockedProducts.length);

        // Strings (many)
        String[] stringProducts=new String[stockedProducts2.length];

        for(int i=0; i<stockedProducts2.length;i++ ){
            stringProducts[i]=stockedProducts2[i].toString();
        }
        return stringProducts;
    }

    @Override
    public Product request(int productNumber) {
        for(Product p:stockedProducts){
            if(p.getProductNumber() == productNumber){
              if(depositPool >= p.getPrice()){
               depositPool = depositPool - p.getPrice();


                  return p;
              }

            }
        }
        return null;
    }
}
