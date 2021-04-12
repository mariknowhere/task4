package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class Main {
    public static void main(String[] args) throws IOException {
        int userNumber = Inputs.inputNumber();
        String userLanguage = Inputs.inputString();
        Data data = Data.createDataFromLanguage(userLanguage);
        String output = Generator.generateUsers(userNumber, userLanguage, data);

//        System.out.println(output);


        PrintStream out = new PrintStream(new FileOutputStream("nul.txt"));
        System.setOut(out);
        System.out.println(output);
    }
}