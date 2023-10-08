/**
 * Random bullshit go
 */

package com.maximizer02.ldwl;

import java.util.Random;

public class LdwlMisc
{
    public String rick()
    {
        return "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
    }

    public double[] sortArray(double[] arr)
    {
        boolean sorted = false;

        while (!sorted)
        {
            int mistakes = 0;
            for (int i = 0; i < arr.length; i++)
            {
                if (i < arr.length - 1 && arr[i + 1] < arr[i])
                {
                    mistakes++;
                }
            }
            if (mistakes > 0)
            {
                arr = shuffleArray(arr);
            } else
            {
                sorted = true;
            }
        }
        return arr;
    }

    public double[] shuffleArray(double[] arr)
    {
        LdwlMath math = new LdwlMath();
        for (int i = 0; i < arr.length; i++)
        {
            int randomIndexToSwap = math.randomRange(0, arr.length);
            double temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
