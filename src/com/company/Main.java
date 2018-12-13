package com.company;

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{

        File file = new File("TruthTable.txt");
        FileWriter writer = new FileWriter(file);
        Scanner stringReader = new Scanner(System.in);
        String userInput = stringReader.nextLine();
        writer.write(Operator.getTruthTable(userInput));
        writer.close();

        char[] inputArray = userInput.toCharArray();

        // FIRST CHECK. FIND PARENTHESES
        int firstPar = 0;
        for (char temp : inputArray)
        {
            if (temp == '(')
                break;
            firstPar++;
        }
        int secondPar = 0;
        for (char temp : inputArray)
        {
            if (temp == ')')
                break;
            secondPar++;
        }
       // System.out.println(Operator.getTruthTable(userInput));
        for (int i = firstPar; i < secondPar - 1; i++){
       //     if (inputArray[i] =={
//
      //      }
        }


//        System.out.println(firstPar + "" + secondPar);

    }
}
