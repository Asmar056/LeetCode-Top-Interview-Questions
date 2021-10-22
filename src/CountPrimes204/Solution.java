package CountPrimes204;

import java.util.Scanner;

public class Solution {

     static boolean isPrime(int n, boolean[] primes){
         for (int i = 2; i*i <= n ; i++) {
             if (!primes[i]) {
                 for (int j = i*2; j <= n; j+=i) {
                     primes[j] = true;
                 }
             }
         }
        return true;
    }

    public static int countPrimes(int n) {
        int count = 0;
        boolean[] prime = new boolean[n+1];
         isPrime(n,prime);

        for (int i = 2; i < n; i++) {
            if (!prime[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countPrimes(n));
    }
}
