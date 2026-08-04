class Solution {
    //static because varaible will be  to class
    static final int MOD = 1000000007;   

    public boolean isPrime(int num)
    {
        if(num < 2)
        {
            return false;
        }

        for(int i = 2; i * i <= num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public long factorial(int x)
    {
        long ans = 1;

        for(int i = 2; i <= x; i++)
        {
            // Fixed: Take modulo after multiplication
            ans = (ans * i) % MOD;
        }

        return ans;
    }

    public int numPrimeArrangements(int n)
    {
        int count = 0;

        // Fixed: Count ALL prime numbers from 2 to n
        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }

        int non_prime = n - count;

        // Fixed: factorial returns long
        long a = factorial(count);
        long b = factorial(non_prime);

        // Fixed: Multiply using long and take modulo
        long ans = (a * b) % MOD;

        return (int)ans;
    }
}
