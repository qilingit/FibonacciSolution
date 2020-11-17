import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciSolution {
    public static int getResultRecursive(int n) {
        if(n <= 2) return n;
        return getResultRecursive(n-1) + getResultRecursive(n - 2);
    }

    public static int getResultTempVariable(int n) {
        if(n <= 2) return n;

        int minus1 = 2, minus2 = 1;
        int tmp = 0;
        int result = minus1;
        for(int i = 3; i <= n; i++) {
            tmp = result;
            result = minus1 + minus2;
            minus1 = result;
            minus2 = tmp;
        }

        return result;
    }

    /**
     * make every result as a cache
     * @param n
     * @return
     */
    public static int getResultCache(int n) {
        int result = 0;
        if(n <= 2) return n;

        // Why use hashmap ? Because hashmap is implemented by a hashtable, which is faster than Array, than list
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);

        int res1, res2;
        if(map.containsKey(n-1)){
            res1 = map.get(n-1);
        } else {
            res1 = getResultCache(n-1);
            map.put(n-1, res1);
        }
        if(map.containsKey(n-2)){
            res2 = map.get(n-2);
        } else {
            res2 = getResultCache(n-2);
            map.put(n-2, res2);
        }
        result = res1 + res2;
        map.put(n, result);
        return result;
    }
}
