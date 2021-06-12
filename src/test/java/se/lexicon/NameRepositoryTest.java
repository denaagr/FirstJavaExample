package se.lexicon;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NameRepositoryTest {
    //@Test
//public void getSize() {
//    String[] names = {"Erik Svensson", "Dena Aghajari", "Anton Lundin", "dena lundin"};
//    NameRepository.getSize();
//    System.out.println(names.length);
//}
//
    @Test
    public  void add(){
        String[] names = {"Erik Svensson", "Dena Aghajari", "Anton Lundin", "dena lundin"};
        String fullName="Dena Aghajari";
        NameRepository.add(fullName);
        boolean wasAdded = add(fullName);
        System.out.println("wasAdded = " + wasAdded);
        System.out.println(Arrays.toString(names));
    }
}