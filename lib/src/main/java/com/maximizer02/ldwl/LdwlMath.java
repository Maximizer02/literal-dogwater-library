/**
 * This Class contains the Math and number based functions of the Ldwl
 */
package com.maximizer02.ldwl;

public class LdwlMath
{
    public int add(int a, int b)
    {
        int result = a + b;
        return result;
    }

    public int multiply(int a, int b)
    {
        int result = a * b;
        return result;
    }

    public int subtract(int a, int b)
    {
        int result = a - b;
        return result;
    }

    public int divide(int a, int b)
    {
        int result = (int) a / b;
        return result;
    }

    public int square(int n)
    {
        int k = 0;
        while (true)
        {
            if (k == n * n) return k;
            else k++;
        }
    }

    public int randomRange(int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
