package com.maximizer02.ldwl;

public class LdwlBool
{
    public boolean isOdd(int number)
    {
        switch (number % 2)
        {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
