package appfuncs.complicatedFuncs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComplicatedMathFuncs {

    public static List<Integer> generateAllPrimes(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[1]=false; isPrime[0]=false;
        for (int i =2; i*i<=n; i++){
            for (int j=2; j*i<=n; j++){
                isPrime[j*i]=false;
            }
        }
       return IntStream.range(2,n+1).filter(i->isPrime[i]).boxed().toList();
    }
}
