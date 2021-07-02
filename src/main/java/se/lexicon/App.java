package se.lexicon;

import se.lexicon.inharitance.Car;
import se.lexicon.inharitance.Employee;
import se.lexicon.inharitance.SalePerson;
import se.lexicon.inharitance.SystemDeveloper;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

//        BankAccount bank=new BankAccount(500,"Dena Aghajari","d.adr@gmail.com",070223344);
//          bank.deposit(1000);
//        System.out.println("Current balance:"+bank.getBalance());
//          bank.deposit(100);
//        System.out.println("Current balance:"+bank.getBalance());
//        System.out.println("bank account num:"+bank.counter);

//        Car car1=new Car(4);
//        car1.setVehicleId(3);
//
        //SystemDeveloper personDeveloper=new SystemDeveloper(String[] n,);
       // String[]  cer={"java","c#"};
       // SystemDeveloper personal=new SystemDeveloper("Dena Aghajari",25000.0, personal.getCertificates(),personal.getLanguages());
       // SystemDeveloper personal=new SystemDeveloper("Dena",25000,new String[] "oracle",new String[] "java,c|++");
       // Employee.getSalary();
        SystemDeveloper dena=new SystemDeveloper("Dena");// personal without certificate and language
        SystemDeveloper simon=new SystemDeveloper("Simon",new String[]{"phd"},new String[]{"java"});
        System.out.println("Dena"+ dena);
        System.out.println("Simon"+ simon);
        SalePerson anton=new SalePerson("Anton",new String[]{"ab"},2 );
        System.out.println("Anton"+ anton);








    }
}