package com.example.zan1.math_test.Mathclass;
import java.lang.Math;
import java.util.LinkedList;
import java.util.List;

public class Calc{


    List<Double> result;
/*
* udregn kantplade
* antal spær og spær rum
* antal plader
* tråd stk
* lille skinne mellem skinne
* vis retning
* kant skinne
*
* væg 1 = 4
*
* væg 2 = 5
* */

public double divedeBy2(double wall_Length){

    double newwall_Length = wall_Length / 2;
    return newwall_Length;
}
public double spaer_Plade_Mid_Mid(double wall_Length){

    double mid_Mid_WallDivBy2 = (Math.floor(((divedeBy2(wall_Length)*100)-30)/120)+1)*2; //antal af spær mid mid
   // double floor_mid_Mid_WallDivBy2 = Math.floor(mid_Mid_WallDivBy2)*2;
    return mid_Mid_WallDivBy2;
}
public double (){


}


}
