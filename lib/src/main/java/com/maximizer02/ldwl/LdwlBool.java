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
        boolean response = bool == true ? true : false;
        switch (String.valueOf(response))
        {
            case "true":
                return true;
            case "false":
                return false;
            default:return false;
        }
    }

    public boolean isFalse(boolean bool)
    {
        boolean response = bool == true ? false : true;
        return response;
    }

}
