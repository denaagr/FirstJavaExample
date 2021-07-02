package se.lexicon.assignmentVendingMchine;

import se.lexicon.assignmentVendingMchine.Product;

public interface VendingMachine {
    void addCurrency(int amount);
    int endSession();
    int getBalance();
    String getDescription(int productNumber);
    String [] getProducts();
    Product request(int productNumber);





}
