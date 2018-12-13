package com.company;

/**
 * Created by bb222 on 12/13/18.
 */
public  class Operator {
    public  Operator (){

    }
    static String truthTable;
    static char char1;
    static char char2;
    public static String getTruthTable(String input){

        if (input.charAt(input.length()/2) == '&'){
            char1 = input.charAt(input.length()/2 - 1);
            char2 = input.charAt(input.length()-1); //todo: get char after &&

            truthTable = "hi" + char1 + char2;
        }




        return truthTable;
    }


}
