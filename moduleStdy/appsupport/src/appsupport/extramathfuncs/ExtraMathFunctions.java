package appsupport.extramathfuncs;

public class ExtraMathFunctions {

    public static long fastExponentiation(int x, int n){
        if (n==0||x==1) return x;
        long sq = fastExponentiation(x, n/2);
        if(x%2==0) return sq*sq;
        else return x*sq*sq;
    }
}
