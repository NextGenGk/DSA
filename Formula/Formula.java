package Formula;

import DSA_ONE.Recursion.ReverseString;

public class Formula {

 //1//
    // Decimal To Binary
    // return n%2 + 10*binaryToDecimal(n/2);

    // Step 1 - Divide the number by 2
    // Step 2 - Get the Integer Quotient for the next iteration
    // Step 3 - Get the Remainder for the binary digit
    // Step 4 - Repeat the steps until the Quotient is equal to 0

    // Div by 2     Quo     Rem
        // 13 / 2        6       1      110 * 10 + 1 = 1101
    // 6 / 2         3       0      11 * 10 + 0 = 110
    // 3 / 2         1       1
    // 1 / 2         0       1      1 * 10 + 1 = 11

    // Formula
    // f(n) = n%2 + 10*f(n/2)

//2//
    // factorial Method
    // 3 * 2 * 1 = 6
    // f(n) = n * factorial(n - 1);

//3//
    // Fibonacci Method
    //   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    // f(n) = fibonacci(n-1) + fibonacci(n-2);

//4//
    // The Greatest Common Divisor
    // return greatestCommonDivisor(b, a%b);

    // gcd(48,18)
    // Step 1 - 48/18 = 2 remainder 12
    // Step 2 - 18/12 = 1 remainder 6
    // Step 3 - 12/6 = 2 remainder 0

    // Formula
    // 18
    // gcd(a,0) = a
    // gcd(a,b) = gcd(b, a%b)

//5//
    // IsPalindrome

    //       if(str.charAt(0) == str.charAt(str.length()-1))
    //               return isPalindrome(str.substring(1, str.length()-1));
    //       return false;

    // The characters read the same backward as forward. Some examples of palindromic words are
    // deified, civic, radar, level, rotor, kayak, reviver, madam, and refer.

//6//
    // Power
    // Recursive case
    // return base * power(base,exponent - 1);
    // 3 * 3 * 3 * 3 = 81 (3 ki power 4)

//7//
    // Recursive range
    // Recursive Case
    // return n + recursiveRange(n - 1);
    // Sum of Numbers (5 + 4 + 3 + 2 + 1)

//8//
    // Reverse String Method
    // Recursive Case
    // return reverseString(str.substring(1)) + str.charAt(0);

    // We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive,
    // and endIndex is exclusive. In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.
    // Reverse A String we opposite the beginning and ending Index (1,0)

//9//
    // SumOfDigits
    // Recursive Case
    // return n%10 + sumOfDigits(n/10);

    // 10 / 10 = 1 and remainder is 0               = 1
    // 54 / 10 = 5 and remainder is 4               = 9
    // 112 / 10 = 11 and remainder is 2             = 4
    // 11 / 10 = 1 and remainder is 1

//10//
    // Sum of n number =  n*(n+1)/2
    // Recursive - n + sum(n-1)

    // Sum of all Array
    // Number of Elements

//11//
    // Sum of 2d Diagonal
    // Sum of Diagonal = sum = sum + arr[i][i];

//12//
    // Euclid Algorithm
    // Power a^b
    // return a * power(a, b-1);

//13//
    // Palindrome String
    // Recursive Case
    // return isPalindrome(str, l+1, r-1);

//14//
    // Permutation of String
    //  // Looping
    //        for (int i=l; i<=r; i++) {
    //            // Calling Swap function
    //            swap(s, l, r);
    //            // Recursive Case
    //            permute(s, l+1, r);
    //            // BackTracking
    //            swap(s, l, r);
    //        }

//15//
    // PowerSet
    // Recursive Case
    //
    //        // Two cases for every character
    //        // (i) We consider the character as part of current subset
    //        powerSet(str, i+1, curr + str.charAt(i));
    //        // (ii) We do not consider current character as part of current subset
    //        powerSet(str,i+1,curr);

//16// No of ways NxM Matrix
//   Recursive
//        return countPaths(m-1, n) + countPaths(m, n-1);


//17//   Find Trailing Zeroes
// Looping
//       for (int i=5; i<=n; i=i*5) {
//           result = result + n/i;
//       }


//18// GCD
// Recursive Case
//        return gcd(b, a%b);


//19// Modulo Arithmetic
//     // Function
//    public static long fastPower(long a, long b, int n) {
//        long result = 1;
//
//        while (b>0) {
//            if ((b&1) != 0) {
//                result = (result * a % n) % n;
//            }
//            a = ((a % n) * (a % n)) %n;
//            b = b >> 1;
//        }
//        return result;
//    }


//20// Sieve of Eratosthenes
// // looping to root N
//        for (int i=2; i<=n/2; i++) {
//            for (int j=2*i; j<=n; j=j+i) {
//                isPrime[j] = false;
//            }

//21//  Josephus Problem
// // Recursive Case
//        return (josephus(n - 1, k) + k ) % n;

//22// Tower Of Hanoi
/*
// Recursive Case
        // Source -> Helper (using Destination as a Helper)
        towerOfHanoi(noOfDisks-1, src, dest, helper);

        // Print
        System.out.println("Transfer disk " + noOfDisks + " from Source " + src + " to dest " + dest);

        // Recursive Case
        // Helper -> Destination (using Source as a Helper)
        towerOfHanoi(noOfDisks-1, helper, src, dest);
 */

//23//
/*
// ReverseString
printReverse(str, index-1);
 */

//24//
/*
// Checking Element
        char currChar = str.charAt(index);
        if (currChar == element) {
            if (first == -1) {
                first = index;
            }
            else {
                last = index;
            }
        }

        // Recursive Case
        findOccurance(str, index+1, element);
 */
}
