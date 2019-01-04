package com.example.admin.unittest;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Calculator {


    public static int add(int a, int b){

        try {
            FileReader reader=new FileReader("App.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return a+b;
    }
}
