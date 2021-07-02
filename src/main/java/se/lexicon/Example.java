package se.lexicon;

public class Example {
    // takes: to params (a,b)
    // addition
    // return number
    public static int addition(int a,int b){
        return a + b;
    }

    public static void display(String a,String b, String c){
        System.out.println(a+" "+b+" "+c);
    }


    public static void main(String[] args) {
      int additionResult=  addition(3,6);

        if(additionResult<10){
            System.out.println("less ");
        }else{
            System.out.println("higher");
        }

      display("hi"," ghj","jkdhf");

    }

}
