package com.company;

/**
 * Created by bb222 on 12/13/18.
 */
public  class Operator{
    public  Operator (){
//
    }
    static String truthTable;
    static char char1;
    static char char2;
    static String operatorType;
    static int operatorLocation;

    static String line1;
    static String line2;
    static String line3;
    static String line4;
    static String line5;

    static boolean char1Bool = true;
    static boolean char2Bool = true;


    public static String getBoolChar(boolean a){
        if (a){
            return "T";
        }
        else {
            return "F";
        }
    }
    public static boolean trueOrFalse(boolean a, boolean b, char op){
        if (op == '&'){
            return a && b;
        }
        else if (op == '|'){
            return a || b;
        }
        else {
            return false;
        }

    }
    public static String getTruthTable(String input){
        for (int i = 0; i < input.length(); i++){ //finds what operator is being used in the input
            if (input.charAt(i) == '&'){
                operatorType = "&";
                operatorLocation = i;
                break;
            }
            if (input.charAt(i) == '|'){
                operatorType = "|";
                operatorLocation = i;
                break;
            }
        }
        char1 = input.charAt(operatorLocation - 1);
        char2 = input.charAt(operatorLocation + 2);
        if (char1 == '!'){  //makes sure char1 or char2 aren't recognized as a '!'
            char1 = input.charAt(operatorLocation - 2);
        }
        if (char2 == '!'){
            char2 = input.charAt(operatorLocation + 3);
        }

        //checks for nots
        if (input.charAt(0) == '!'){
            char1Bool = !char1Bool;
        }
        if (input.charAt(operatorLocation + 2) == '!'){
            char2Bool = !char2Bool;
        }

        if (operatorType.equals("&")){

            line1 = char1 + "\t" + char2 + "\t" + input;
            line2 = Operator.getBoolChar(char1Bool) + "\t" + Operator.getBoolChar(char2Bool) + "\t" + Operator.trueOrFalse(char1Bool, char2Bool, '&');
            //a = T, b = T

            line3 = Operator.getBoolChar(!char1Bool) + "\t" + Operator.getBoolChar(char2Bool) + "\t" + Operator.trueOrFalse(!char1Bool, char2Bool, '&');
            //a = F, b = T

            line4 = Operator.getBoolChar(char1Bool) + "\t" + Operator.getBoolChar(!char2Bool) + "\t" + Operator.trueOrFalse(char1Bool, !char2Bool, '&');
            //a = T, b = F

            line5 = Operator.getBoolChar(!char1Bool) + "\t" + Operator.getBoolChar(!char2Bool) + "\t" + Operator.trueOrFalse(!char1Bool, !char2Bool, '&');
            //a = F, b = F

            truthTable = line1 + "\n" +
                    line2 + "\n" +
                    line3 + "\n" +
                    line4 + "\n" +
                    line5;
        }
        else if (operatorType.equals("|")){
            line1 = char1 + "\t" + char2 + "\t" + input;
            line2 = Operator.getBoolChar(char1Bool) + "\t" + Operator.getBoolChar(char2Bool) + "\t" + Operator.trueOrFalse(char1Bool, char2Bool, '|');
            //a = T, b = T

            line3 = Operator.getBoolChar(!char1Bool) + "\t" + Operator.getBoolChar(char2Bool) + "\t" + Operator.trueOrFalse(!char1Bool, char2Bool, '|');
            //a = F, b = T

            line4 = Operator.getBoolChar(char1Bool) + "\t" + Operator.getBoolChar(!char2Bool) + "\t" + Operator.trueOrFalse(char1Bool, !char2Bool, '|');
            //a = T, b = F

            line5 = Operator.getBoolChar(!char1Bool) + "\t" + Operator.getBoolChar(!char2Bool) + "\t" + Operator.trueOrFalse(!char1Bool, !char2Bool, '|');
            //a = F, b = F

            truthTable = line1 + "\n" +
                    line2 + "\n" +
                    line3 + "\n" +
                    line4 + "\n" +
                    line5;
        }



        return truthTable;
    }


}
