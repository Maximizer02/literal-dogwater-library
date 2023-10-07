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

    public boolean isTrue(boolean bool)
    {
        boolean response = bool==true?true:false;
        return response;
    }

    public boolean isFalse(boolean bool)
    {
        boolean response = bool==true?false:true;
        return response;
    }

}
