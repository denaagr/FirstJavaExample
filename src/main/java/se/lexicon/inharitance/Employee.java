package se.lexicon.inharitance;

public abstract class Employee {

    public static int idCounter;
    //public static Double salary=25000.0;// everybody can reach it ?
    private int id;
    private String name;
    public static Double baseSalary =25000.0;



    public Employee( String name, Double salary) {
        id =++idCounter;
        this.name = name;
        this.baseSalary = salary;
    }

    public Employee(String name) {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return baseSalary;
    }

    public void setSalary(Double salary) {
        this.baseSalary = salary;
    }
    //private LocalDate dateHired;
    public abstract void calculateSalary();


    }




