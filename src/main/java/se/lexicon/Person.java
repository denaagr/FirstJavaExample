package se.lexicon;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean sleeping;
    //constructor
    public Person(String firstName,String lastName, int age , boolean sleeping){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.sleeping=sleeping;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public boolean isSleeping() {
        return sleeping;
    }
    public void setSleeping(boolean sleeping){
        this.sleeping=sleeping;
    }
    public void  setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void  setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;

    }
    public boolean getSleeping(){
        return sleeping;
    }



    }
