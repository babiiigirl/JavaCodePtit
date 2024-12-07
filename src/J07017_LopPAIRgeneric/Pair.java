package J07017_LopPAIRgeneric;

import static java.lang.Math.sqrt;

public class Pair<T, U> {
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public boolean prime(int n) {
        for (int i = 2; i <= sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return (n > 1);
    }

    public boolean isPrime(){
        return prime((Integer) first) && prime((Integer) second);
    }

    public String toString(){
        return first + " " + second;
    }
}
