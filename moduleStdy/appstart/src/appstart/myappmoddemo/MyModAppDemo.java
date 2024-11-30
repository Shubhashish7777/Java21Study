package appstart.myappmoddemo;
import appsupport.extramathfuncs.ExtraMathFunctions;
import appfuncs.simplefuncs.SimpleMathFuncs;
import appfuncs.complicatedFuncs.ComplicatedMathFuncs;
public class MyModAppDemo {

    public static void main(String [] args){
        System.out.println(SimpleMathFuncs.isEven(5));
        System.out.println(ComplicatedMathFuncs.generateAllPrimes(100));
        System.out.println(ExtraMathFunctions.fastExponentiation(50,5));
    }
}
