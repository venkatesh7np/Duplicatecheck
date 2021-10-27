package Randomstring;

// A Java program generate a random AlphaNumeric String
// using CharSet method

import java.util.*;
import java.nio.charset.*;

class RandomString {

    static String getAlphaNumericString(int n)
    {

        // length is bounded by 230 Character
        byte[] array = new byte[230];
        new Random().nextBytes(array);

        String randomString
                = new String(array, Charset.forName("UTF-8"));

        // Create a StringBuffer to store the result
        StringBuffer r = new StringBuffer();

        // Append first 20 alphanumeric characters
        // from the generated random String into the result
        for (int k = 0; k < randomString.length(); k++) {

            char ch = randomString.charAt(k);

            if (((ch >= 'a' && ch <= 'z')
                    || (ch >= 'A' && ch <= 'Z')
                    || (ch >= '0' && ch <= '9'))
                    && (n > 0)) {

                r.append(ch);
                n--;
            }
        }

        // return the resultant string
        return r.toString();
    }

    public static void main(String[] args)
    {
        // size of random alphanumeric string
        int n = 100;

        // Get and display the alphanumeric string
        System.out.println(getAlphaNumericString(n));
    }
}
