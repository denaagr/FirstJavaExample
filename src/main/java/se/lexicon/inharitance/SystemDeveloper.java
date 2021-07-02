package se.lexicon.inharitance;

import se.lexicon.model.Person;

import java.util.Arrays;

public class SystemDeveloper extends Employee{

    private static  Employee[] personal = new Employee[10];
    private String[] certificates;//important
    private String[] languages;



    public SystemDeveloper( String name, String[] certificates, String[] languages) {
        super( name);
        this.certificates = certificates;
        this.languages = languages;
        Employee.idCounter =++idCounter;
        //simon
        calculateSalary();

    }

    public SystemDeveloper(String name){
        super(name);
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }



    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
    @Override
    public void calculateSalary(){
        //Double finaSalary=(clients.length*500.0)+(acquiredClients*1000.0);
        //        System.out.println("salary is:"+finaSalary);
        Double finaSalary=(certificates.length*1000+languages.length*1500.0+Employee.baseSalary);
        //important(simon)
        setSalary(finaSalary);
        //second way
       // super.setSalary(finaSalary);

    }
    @Override
    public String toString() {
        return "SystemDeveloper{" +
                " salary="+super.getSalary() +//simon
                " certificates=" +  Arrays.toString(certificates) +
                ",  languages=" +  Arrays.toString(languages) +
                '}';
    }

}
