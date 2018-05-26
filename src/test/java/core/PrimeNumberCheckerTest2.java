package core;

import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class PrimeNumberCheckerTest2 {
       @DataProvider(name = "prime number")
       public static Object[][] primeNumbers() {return new Object[][] { 
                     {2, false},
                     {3, false},
                     {4, false},
                     {5, false},
                     {2, false},
                     {3, false},
                     {4, false},
                     {5, false},
                     {6, false},
                     {7, false},
                     {8, false},
                     {9, false},
                     {10, false},
       };
       }
       @Test(timeOut = 1000, dataProvider = "prime number", groups = {"qa"})
       public void test (int number, boolean expected) {
       System.out.println(number + (PrimeNumberChecker.validate(number) ? " - Prime number":" - Not prime number"));
              assertThat(expected, equalTo (PrimeNumberChecker.validate(number)));}
}