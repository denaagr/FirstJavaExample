package se.lexicon;

import java.util.Arrays;

public class NameRepository {
    private static String[] names = {"Erik Svensson", "Dena Aghajari", "Anton Lundin", "dena lundin"};
    // variables- global - local
    // methods - behaviors

    public static void main(String[] args) {
         //getSize();

       //findByFirstName("Dena");
        //findByLastName("lundin");

        //clear();
        /* boolean wasAdded = add("Simon Elbrink");
        System.out.println("wasAdded = " + wasAdded);

        System.out.println("names = " + Arrays.toString(names));*/
        //find("Dena Aghajari");
        //findAll(names);

       String fullName="ali bj";
       add(fullName);
        System.out.println(Arrays.toString(names));

//      System.out.println(Arrays.toString(names));
//       boolean updateResult=update("Erik Svensson", "shadi kh");
//       if (updateResult) {
//           System.out.println(Arrays.toString(names));
//      }else{
//           System.out.println("not found");
//        }
//
    }

//      public static int getSize() {
//          return names.length;
//      }

//      public static void clear() {
//
//          Arrays.fill(names, null);
//          System.out.println(Arrays.toString(names));
//
//      }

      public static boolean add(final String fullName) {

          // Checking if name exists.
          for (String name : names) {
              if (name == fullName) {
                  return false;
              }
          }

          //Adding the non existing name.
          String[] copy = Arrays.copyOf(names, names.length + 1);
          copy[copy.length - 1] = fullName;
          names = copy;

          return true;
      }


     /*
      public static String[] findAll(String[] names){
         String[] names2=Arrays.copyOf(NameRepository.names, NameRepository.names.length);
         System.out.println(Arrays.toString(names2));
         return names2;
     }*/

    //    public static String find(final String fullName) {
//
//        for (String name : names) {
//            if (name.equals(fullName))  {
//                System.out.println(fullName);
//                return fullName;
//            }
//        }
//        System.out.println("not found");
//        return null;
//
//    }
//    public static boolean update(String original, String updatedName) {
//        for (int i = 0; i < names.length; i++) {
//
//            if (names[i].equalsIgnoreCase(original)) {
//                names[i]=updatedName;
//                return true;
//            }
//
//        }
//          return false;
    // }
//    public static String[] findByFirstName(String firstName) {
//        for (String name : names) {
//            String[] words = name.split(" ");
//            if (words[0].equalsIgnoreCase(firstName)) {
//                System.out.println(Arrays.toString(words));
//            }
//        }
//        System.out.println("not found");
//        return names;
//    }

//    public static String[] findByLastName(String lastName) {
//        for (String name : names) {
//            String[] words = name.split(" ");
//            if (words[1].equalsIgnoreCase(lastName)) {
//                System.out.println(Arrays.toString(words));
//                names=words;
//            }
//        }
//
//        return names;
//    }
}