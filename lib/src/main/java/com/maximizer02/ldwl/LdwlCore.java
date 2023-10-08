/**
 * This Class contains general purpose Function of the Ldwl
 */
package com.maximizer02.ldwl;

public class LdwlCore
{
    public String test()
    {
        return "working";
    }

    public int getStringLength(String s)
    {
        int length = 0;
        for (int i = 0; i < s.length(); i++)
        {
            length++;
        }
        return length;
    }
    public void doNothing(){}
}
