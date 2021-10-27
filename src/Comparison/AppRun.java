package Comparison;

import org.json.JSONException;

import java.io.IOException;

public class AppRun
{
    public static void main(String[] args) throws JSONException, IOException
    {
        Interface IC = new Logic();
        IC.FileReaderMethod();
        IC.JsonFileMethod();
    }
}