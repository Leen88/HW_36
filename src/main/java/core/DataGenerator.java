package core;

public class DataGenerator{
       int length = 0, result  = 0;
       static int max = 1001;
       public static void main(String[] args) {
       for (int i = 2; i <= max;i++){
//    System.out.println("{" + i + ", false}" + (i < max?",":""));}
       System.out.println("{" + i + ", " + PrimeNumberChecker.validate(i) + "}" + (i < max?",":""));}
       }
}
