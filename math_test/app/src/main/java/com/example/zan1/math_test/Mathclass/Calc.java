package com.example.zan1.math_test.Mathclass;
import java.lang.Math;
import java.util.LinkedList;
import java.util.List;

public class Calc {


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

    public double divedeBy2(double wall_Length) {

        double newwall_Length = wall_Length / 2;
        return newwall_Length;
    }

    public double spaer_Plade_Mid_Mid(double wall_Length) {

        double mid_Mid_Antal_Spaer = (Math.floor(((divedeBy2(wall_Length) * 100) - 30) / 120) + 2) * 2; //antal af spær mid mid
        // double floor_mid_Mid_WallDivBy2 = Math.floor(mid_Mid_WallDivBy2)*2;
        return mid_Mid_Antal_Spaer;
    }

    public double spaer_Rum_Mid_Mid(double wall_Length) {

        double mid_Mid_spaer_Rum = (Math.floor((divedeBy2(wall_Length) * 100) - 30) / 120) * 2; //antal af spær mid mid

        return mid_Mid_spaer_Rum;
    }

    public double antal_Plader_Mid_Mid(double wall_Length) {


        double antal_plader = (Math.ceil(((divedeBy2(wall_Length)*100)-30)/60)*2)+1;

        return antal_plader;
    }

    public double antal_Plader_Kant_Mid(double wall_Length) {


        double antal_plader = (Math.ceil((divedeBy2(wall_Length)*100)/60)*2);

        return antal_plader;
    }

    public double kant_Plade_Mid_mid(double wall_Length){

        double kant_Plade = ((divedeBy2(wall_Length)*100)-30) - Math.floor((((divedeBy2(wall_Length) * 100) - 30)/60))*60;

        return kant_Plade;
    }

    public double kant_Plade_Red_Red(double wall_Length){

        double kant_Plade = (divedeBy2(wall_Length)*100)-(Math.floor((divedeBy2(wall_Length) * 100)/60)*60);

        return kant_Plade;
    }
    public double antal_Plader_I_Alt(double wall_Length1, double wall_Length2) {


        double antal_plader_I_Alt_Mid_Kant = antal_Plader_Mid_Mid(wall_Length1) * antal_Plader_Kant_Mid(wall_Length2);
        double antal_plader_I_Alt_Mid_Mid = antal_Plader_Mid_Mid(wall_Length1) * antal_Plader_Mid_Mid(wall_Length2);
        double antal_plader_I_Alt_Kant_Kant = antal_Plader_Kant_Mid(wall_Length1) * antal_Plader_Kant_Mid(wall_Length2);

        return antal_plader_I_Alt_Mid_Kant;
    }

}
