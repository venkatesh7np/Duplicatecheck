package Randomstring;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Implimentation implements InterfaceMethods
{



    @Override
    public String getAlphaNumericString(int n)
    {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        AlphaNumericString  = AlphaNumericString.toLowerCase(Locale.ROOT)+"1234567890";

        StringBuilder sb = new StringBuilder(n);
        for (int i = 0 ; i < n ; i++)
        {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    @Override
    public void ResultFile()
    {

        // Get and display the alphanumeric string
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of characters you want in a Line: Enter number greater then 0");
        int n = sc.nextInt();
        if(n>0) {
            System.out.println("Enter the number of lines");
            int count = sc.nextInt();
            if(count>0 && count<230)
            {
                FileWriter MyWriter;
                try {
                    MyWriter = new FileWriter("D:\\Atmecs\\Assignments\\Uniquestringvariable.txt");
                    for (int i = 1; i <= count; i++) {
                        System.out.println(
                                getAlphaNumericString(n) + "   " + getAlphaNumericString(n).length());
                        MyWriter.write(i+"  " + getAlphaNumericString(n) + "\n");
                    }
                    MyWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Number of lines should in between 1 - 230");
                System.out.println("Please enter Number Of Character and Lines Once Again");
                ResultFile();

            }
        }
        else
        {
            System.out.println("Number of characters should be greater then 0");
            System.out.println("Please Enter again");

            ResultFile();


        }
    }
}
