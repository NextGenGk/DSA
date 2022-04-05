package DSA_ONE.Mathematics;

public class ModuloArithmetic {

//    public static int fastPower(int a, int b) {
//        int result = 1;
//
//        while (b>0) {
                // odd
//            if ((b&1) != 0) {
//                result = result * a;
//            }
//            a = a * a;
//            b = b >> 1;
//        }
//        return result;
//    }

    // Function
    public static long fastPower(long a, long b, int n) {
        long result = 1;

        while (b>0) {
            if ((b&1) != 0) {
                result = (result * a % n) % n;
            }
            a = ((a % n) * (a % n)) %n;
            b = b >> 1;
        }
        return result;
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(fastPower(3978432,5, 1000000007));
    }
}

/*
Modular Addition :
Rule for modular addition is:

(a + b) mod m = ((a mod m) + (b mod m)) mod m

Example:

(15 + 17) % 7
= ((15 % 7) + (17 % 7)) % 7
= (1 + 3) % 7
= 4 % 7
= 4
 */

/*
Modular Multiplication :
Rule for modular multiplication is:

(a x b) mod m = ((a mod m) x (b mod m)) mod m

Example:

(12 x 13) % 5
= ((12 % 5) x (13 % 5)) % 5
= (2 x 3) % 5
= 6 % 5
= 1
 */