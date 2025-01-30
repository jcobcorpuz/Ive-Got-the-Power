public class PowerCalculation {

    public static int naivePower(int x, int n){
        if (x == 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        return x * naivePower(x, n-1);
    }

    public static int unoptimizedDCPower(int x, int n){
        if (x == 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        if (n % 2 == 0){
            return unoptimizedDCPower(x, n/2) * unoptimizedDCPower(x, n/2);
        }
        else {
            return x * unoptimizedDCPower(x, n/2) * unoptimizedDCPower(x, n/2);
        }
    }

    public static int optimizedDCPower(int x, int n){
        if (x == 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }

        int temp = optimizedDCPower(x, n/2);
        if (n % 2 == 0){
            return temp * temp;
        }
        else {
            return x * temp * temp;
        }
    }

    public static void main(String[] args){
        int x = 2, n = 3;
        System.out.println("naivePower(" + x + ", " + n + ") = " + naivePower(x, n));
        System.out.println("unoptimizedDCPower(" + x + ", " + n + ") = " + unoptimizedDCPower(x, n));
        System.out.println("optimizedDCPower(" + x + ", " + n + ") = " + optimizedDCPower(x, n));
    }
}
