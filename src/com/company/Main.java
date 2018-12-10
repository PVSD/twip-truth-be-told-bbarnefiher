package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{

        File file = new File("TruthTable.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Hi Brain");
        writer.close();
        Scanner userInput = new Scanner(System.in);
    }
}
