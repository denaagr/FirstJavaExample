package se.lexicon.inharitance;

import java.util.Arrays;

public class SalePerson extends Employee{
    private String[] clients;
    private int acquiredClients;




    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }



    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }



    public SalePerson( String name, String[] clients, int acquiredClients) {
        //super(id, name, salary);
        super(name);
        this.clients = clients;
        this.acquiredClients = acquiredClients;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        Double finaSalary=(clients.length*500.0)+(acquiredClients*1000.0)+Employee.baseSalary;
        setSalary(finaSalary);
    }

    @Override
    public String toString() {
        return "SalePerson{" +
                "salary "+ super.getSalary()+
                " clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClients +
                '}';
    }
}
