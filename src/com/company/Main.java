package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println(maxVal(1,2,3));
        //2
        System.out.println(minVal(1,2,3));
        //solve alg func

        //4
        Math.abs(5);

        //5
        System.out.println(maxVal(1.3,2.4,3.6));

        //8
        System.out.println(minVal(2.3,2.5,3.5));

        //10
        System.out.println(exprEx(1,2));


        //11
        System.out.println(positiveNegative(5));

        //14


    }

    private static void monthYear(Integer month){

        //example
        switch(month){
            case 1:
                System.out.println("January");
        }
    }

    private static String positiveNegative(Integer number){
        if(number == 0) return "Zero";
        else if(number > 0)return "Positive";
        else return "Negative";
    }

    private static Integer exprEx(Integer a,Integer b){
          return a > b ? a - b : b - a;
    }



    private static Integer maxVal(Integer ...vals){
        if (vals.length <= 3 )
          return Collections.max(Arrays.asList(vals));
         else
            throw new IndexOutOfBoundsException("type smaller arr");
    }

    private static Integer minVal(Integer ...vals){
        if(vals.length <= 3)
           return Collections.min(Arrays.asList(vals));
        else
            throw new IndexOutOfBoundsException("type smaller arr");
    }

    private static Double maxVal(Double ...vals){
        if (vals.length <= 4)
            return Collections.max(Arrays.asList(vals));
        else
            throw new IndexOutOfBoundsException("type smaller arr");
    }

    private static Double minVal(Double ...vals){
        if(vals.length <= 4)
            return Collections.min(Arrays.asList(vals));
        else
            throw new IndexOutOfBoundsException("type smaller arr");
    }

    private static void solveAlgExpression(){

    }

}
