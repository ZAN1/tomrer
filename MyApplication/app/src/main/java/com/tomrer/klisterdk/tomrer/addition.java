package com.tomrer.klisterdk.tomrer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian on 13-May-17.
 */

public class addition extends MainActivity{



    static List<Double> wall2Uregn1 = new ArrayList<Double>();
    static List<Double> Uregn3 = new ArrayList<Double>();
    static List<Double> Uregn1 = new ArrayList<Double>();
    static List<Double> wall2Uregn3 = new ArrayList<Double>();
    static List<Double> sUregn = new ArrayList<Double>();
    static List<Double> kUregn = new ArrayList<Double>();
    static List<Double> kkUregn = new ArrayList<Double>();
    //String wall12 = SwapMain.getWall12();
  //  String wall13 = SwapMain.getWall13();
    //metode loft plade er midt på midtten af væg
//    List<Double> formuregn = Uregn(wall12);
//    List<Double> formuregn2 = Uregn2(wall12);
//    List<Double> formUregnwall2 = Uregnwall2(wall13);
//    List<Double> formUregn2wall2  = Uregn2wall2(wall13);

    public static List<Double> Uregn(String v1)
    {
        Uregn1 = new ArrayList<Double>();
        double b, c, d, e, f, g, h, i;


        double a = Double.parseDouble(v1);


        b = a / 2;//finder midt af væg
        c = b / 0.60;// finder rå mål på hvormange plader
        d = Math.floor(c);//runder ned til hel tal
        e = d * 0.60;//ganger halv tal med plade brede for at få længde på alle hele plader lagt sammen
        f = b - e;//halv væg - alle hele plader for at finde den sidste plade brede

        // redred spær antal
        h = (e / 1.20) * 2; // antal spær
        i = Math.floor((e / 1.2)) * 2 ;//antal spærrum
        g = (i * 2)+4 ;// antal plader i alt


        Uregn1.add(b);//0
        Uregn1.add(c);//1
        Uregn1.add(d);//2
        Uregn1.add(e);//3
        Uregn1.add(f);//4
        Uregn1.add(g);//5
        Uregn1.add(a);//6
        Uregn1.add(h);//7
        Uregn1.add(i);//8
        Uregn1.add(a);//9
        return Uregn1;





    }

    // metode pladekant er ind til midt
    public static List<Double> Uregn2(String v1)
    {
        Uregn3  = new ArrayList<Double>();

        double a = Double.parseDouble(v1);
        double  b, c, d, e, f, h, g, i, j, k;

        b = a / 2; //finder midt af væg
        c = b - 0.30;  //træker en halv plade fra halv væg
        d = c / 0.60;// finder rå mål på hvormange plader
        e = Math.floor(d);//runder ned til hel tal
        f = e * 0.60; //ganger hal tal med plade brede for at få længde på alle hele plader lagt sammen
        g = c - f;//halv væg - alle hele plader for at finde den sidste plade brede

        // spær blåblå
        i = (f / 1.20 + 1) * 2; //antal spær

        j = Math.floor((f / 1.20)) * 2;//antal spær rum
        h = (j * 2) + 3;// antal plader i alt
        //    k = j * wall2Uregn3[6];//væg hvor spær kommer ud små spær tal ved midt og kanter og mellemspær
        //   l = (wall2Uregn3[6] - 1) * 3; //antal små spær i midtten og kanter
        //     m = k + l;  //antal små spær i alt


        Uregn3.add(b);// 0
        Uregn3.add(c);//1
        Uregn3.add(d);//2
        Uregn3.add(e);//3
        Uregn3.add(f);//4
        Uregn3.add(g);//5
        Uregn3.add(h);//6
        Uregn3.add(a);//7
        Uregn3.add(i);//8 antal spær
        Uregn3.add(j);//9 spærrum
        // Uregn3.Add(j);//8
        // Uregn3.Add(k);//9
        //Uregn3.Add(l);//10
        //egn3.Add(m);//11

        return Uregn3;
    }

    //--------------------------------------------------------------------------------------
    //væg nr 2

    //metode loft plade er midt på midtten af væg
    public static List<Double> Uregnwall2(String wall13)
    {
        wall2Uregn1 = new ArrayList<Double>();
        double  b, c, d, e, f, h, g, i;
       double a = Double.parseDouble(wall13);




        b = a / 2;//finder midt af væg
        c = b / 0.60;// finder rå mål på hvormange plader
        d = Math.floor(c);//runder ned til hel tal
        e = d * 0.60;//ganger hal tal med plade brede for at få længde på alle hele plader lagt sammen
        f = b - e;//halv væg - alle hele plader for at finde den sidste plade brede
       // g = (d * 2) + 2 ;// antal plader i alt
        h = (e * 2) / 1.20; // antal spær
        i = Math.floor((e / 1.2)) * 2 ;//antal spærrum
        g = (i * 2)+4 ;// antal plader i alt



        wall2Uregn1.add(b);//0
        wall2Uregn1.add(c);//1
        wall2Uregn1.add(d);//2
        wall2Uregn1.add(e);//3
        wall2Uregn1.add(f);//4
        wall2Uregn1.add(g);//5 antal plader væg 2 rød
        wall2Uregn1.add(h);//6
        wall2Uregn1.add(a);//7
        wall2Uregn1.add(h);//8
        wall2Uregn1.add(i);//9
        return wall2Uregn1;



    }
    // --
    // metode pladekant er ind til midt på væg nr 2
    //***************************************************************************
    public static List<Double> Uregn2wall2(String wall13)
    {
        wall2Uregn3 = new ArrayList<Double>();
        double  b, c, d, e, f, h, g, i, j;
        double a = Double.parseDouble(wall13);
        b = a / 2; //finder midt af væg
        c = b - 0.30;  //træker en halv plade fra halv væg
        d = c / 0.60;// finder rå mål på hvormange plader
        e = Math.floor(d);//runder ned til hel tal
        f = e * 0.60; //ganger hal tal med plade brede for at få længde på alle hele plader lagt sammen
        g = c - f;//halv væg - alle hele plader for at finde den sidste plade brede

        i = (f / 1.20 + 1) * 2; //antal spær
        j = Math.floor((f / 1.20)) * 2;//antal spær rum
        h = (j * 2) + 3;// antal plader i alt
        //   k = j * Uregn3[6];//væg hvor spær kommer ud små spær tal ved midt og kanter og mellemspær
        //   l = (Uregn3[6] - 1) * 3; //antal små spær i midtten og kanter
        //   m = k + l;  //antal små spær i alt
        wall2Uregn3.add(b);//0
        wall2Uregn3.add(c);//1
        wall2Uregn3.add(d);//2
        wall2Uregn3.add(e);//3
        wall2Uregn3.add(f);//4
        wall2Uregn3.add(g);//5
        wall2Uregn3.add(h);//6
        wall2Uregn3.add(a);//7
        wall2Uregn3.add(i);//8
        wall2Uregn3.add(j);//9
        //  wall2Uregn3.Add(j);//8
        //   wall2Uregn3.Add(k);//9
        //   wall2Uregn3.Add(l);//10
        //  wall2Uregn3.Add(m);//11
        return wall2Uregn3;
    }

    //********************************************************

    public static List<Double> midmid()
    {

           List<Double> sUregn = new ArrayList<>();
        double a, b, c, d, e, f, g, h, i, j, k, l,m,n,o,p,q;


//
//        double pladerialtblabla = formuregn2.get(6) * formUregn2wall2.get(6);
//        double pladerialtblared = formuregn2.get(6) * formUregnwall2.get(5);
//        double pladerialtredred = formuregn.get(5) * formUregnwall2.get(5);
//        double pladerialtredbla = formuregn2.get(5) * formUregn2wall2.get(6);


        a = Uregn3.get(4);//væg 1 alle hele plader lagt sammen
        d = wall2Uregn3.get(6);//antal plader væg 2 blå
        i = wall2Uregn3.get(9);//spærrum væg 2 blå
        j = wall2Uregn3.get(8);//antal spær væg 2 blå
        k = wall2Uregn3.get(4);//væg 2 alle hele plader
        l = Uregn3.get(6);//antal plader væg 1 blå
        m = wall2Uregn1.get(7);//længde af væg 2
        n = Uregn1.get(9);//længde af væg 1
        o = Uregn3.get(9); // væg 1 blå spærrum
        p = wall2Uregn3.get(9); // væg 2 blå spærrum
        q = Uregn3.get(8); //antal spær væg 1 blå
        // double error = 9999;
       // List<Double> sUregn = new ArrayList<Double>();
        if (n < m)
        {
            b = (a / 1.20 + 1) * 2 ; //antal spær væg 1 < væg 2 blå blå
            c = (a / 1.20) * 2; //antal spær rum
            e = (d - 1) * o;//antal mellem spær væg 1 < væg 2 blå blå
            f = (d - 1) * 3; // antal små spær i madt og kanter
            g = d * o;//antalet af små spær i spær rum
            h = g + f;// antal af små spær i alt




            sUregn.add(q);//0 stor blå blå v1 < v2
            sUregn.add(e);//1 mellem blå blå
            sUregn.add(h);//2 små blå blå
            sUregn.add(c);//3
            sUregn.add(m);//4
            return sUregn;
        }
        else if (m < n)
        {
            b = (k / 1.20 + 1) * 2; //antal spær
            c = (k / 1.20) * 2; //antal spær rum
            e = (l - 1) * i;//antal mellem spær
            f = (l - 1) * 3; // antal små spær i madt og kanter
            g = l * i;//antalet af små spær i spær rum
            h = g + f;// antal af små spær i alt
            //////////////////////////////////////////
//            b = (a / 1.20 + 1) * 2 ; //antal spær væg 1 < væg 2 blå blå
//            c = (a / 1.20) * 2; //antal spær rum
//            e = (d - 1) * o;//antal mellem spær væg 1 < væg 2 blå blå
//            f = (d - 1) * 3; // antal små spær i madt og kanter
//            g = d * o;//antalet af små spær i spær rum
//            h = g + f;// antal af små spær i alt


            sUregn.add(j);//0 stor blå blå
            sUregn.add(e);//1 mellem blå blå
            sUregn.add(h);//2 lille blå blå v2 < v1
            sUregn.add(c);//3
            sUregn.add(m);//4
            return sUregn;
        }
        else if (a == k)
        {
            b = (a / 1.20 + 1 ) * 2; //antal spær
            c = (a / 1.20) * 2; //antal spær rum
            e = (d - 1) * o;//antal mellem spær
            f = (d - 1) * 3; // antal små spær i madt og kanter
            g = d * o;//antalet af små spær i spær rum
            h = g + f;// antal af små spær i alt



            sUregn.add(q);//0
            sUregn.add(e);//1
            sUregn.add(h);//2
            sUregn.add(c);//3
            sUregn.add(m);//4

            return sUregn;
        }
        else
        {
            return sUregn;
        }
            //return sUregn;
    }



    //****************************************************************

    public static List<Double> kantkant()
    {
        List<Double> kUregn = new ArrayList<Double>();
        double a, b, c, d, e, f, g, h, i, j, k, l, m, n,o,p;
        a = Uregn1.get(3);//længde af væg1 uden kantplade
        b = wall2Uregn1.get(3);//længde af væg2 uden kantplade
        d = Uregn1.get(6);//længde af væg1
        e = wall2Uregn1.get(7);//længde af væg2
        g = Uregn1.get(5);//antal plader væg 1
        h = wall2Uregn1.get(5);//antal plader væg 2

        if (d < e)//væg 1
        {

            c = (a * 2) / 1.2 ;//antal spær
            f = c - 1;//antal spær rum
            i = (h - 1) * f;//antal af mellem spær i spær rum
            j = (h - 1) * 2;//antal mellem spær i kant rum
            k = h * 2;//antal af små spær i kant rum
            l = h * f;//antal af små spær i spær rum
            m = i + j;//mallem spær i alt
            n = k + l;//små spær i alt


            kUregn.add(c);//0 stor
            kUregn.add(m);//1 mellem
            kUregn.add(n);//2 små
            kUregn.add(f);//3

            return kUregn;
        }
        else if (e < d)//væg 2
        {
            c = (b * 2) / 1.2 ;//antal spær
            f = c - 1;//antal spær rum
            i = (g - 1) * f;//antal af mellem spær i spær rum
            j = (g - 1) * 2;//antal mellem spær i kant rum
            k = g * 2;//antal af små spær i kant rum
            l = g * f;//antal af små spær i spær rum
            m = i + j;//mallem spær i alt
            n = k + l;//små spær i alt


            kUregn.add(c);//0
            kUregn.add(m);//1
            kUregn.add(n);//2
            kUregn.add(f);//3
            return kUregn;
        }
        else if (d == e)
        {
            c = (a * 2) / 1.2 ;//antal spær
            f = c - 1;//antal spær rum
            i = (h - 1) * f;//antal af mellem spær i spær rum
            j = (h - 1) * 2;//antal mellem spær i kant rum
            k = h * 2;//antal af små spær i kant rum
            l = h * f;//antal af små spær i spær rum
            m = i + j;//mallem spær i alt
            n = k + l;//små spær i alt


            kUregn.add(c);//0
            kUregn.add(m);//1
            kUregn.add(n);//2
            kUregn.add(f);//3
            return kUregn;
        }
        else
        {
            return kUregn;
        }

    }

    //********************************************************************

    public static List<Double> midkant()
    {

        List<Double> kkUregn = new ArrayList<Double>();

        double a, b, c, d, e, f, g, h, i, j, k, l, m, n,o,p,q,w,z,r,s;
       // l = Uregn3.get(6);//antal plader væg 1 blå
        d = wall2Uregn3.get(6);//antal plader væg 2 blå
        //a = Uregn3.get(6);/* antal pldaer væg */
       // b = wall2Uregn1.get(5);//antal plader væg 2
        //c = Uregn1.get(8);//antal spær rum kantkant
        a = wall2Uregn3.get(8);//antal spær væg 2 blå
        o = Uregn1.get(8);//spærrum væg 1 rød
        p = wall2Uregn1.get(9);//spærrum væg 2 rød
        q = Uregn1.get(7);//antal spær væg 1 rød
        w = wall2Uregn1.get(6);//antal spær væg 2 rød
       b = Uregn3.get(8);//8 antal spær blå væg 1
       l = Uregn3.get(9);//9 spærrum blå væg 1
       z = wall2Uregn1.get(5);//5 antal plader væg 2 rød
        h = wall2Uregn3.get(9);//væg 2 spærrum blå
        j = Uregn1.get(5);//antal plader væg 1 rød
        r = Uregn3.get(6);// antal plader væg 1 blå
        s = wall2Uregn1.get(8);//spærrum væg 2 rød



        e = (z - 1) * l;//mellem spær mid kant (blå rød)**
        f = ( l * z) + (z-1) * 3;//små spær midt kant i midtten og kanter (blå rød)
        g = (p + 2) * r;//små spær (blå rød modsat)
        c = (r-1)*(p + 2);// alle mellem spær hvis (rød blå modsat)***
        i = ( h * j) + (j-1) * 3;//antal små spær (blå rød modsat)

        k = (j - 1) * h;//antal mellem spær  (blå rød modsat) ***

        m = (o + 2) * d;//antal små spær rød blå (rød blå)**
        n = (d-1)*(o + 2);//antal mellem spær i alt (rød blå)**

        kkUregn.add(e);//0 mellemspær blå rød
        kkUregn.add(f);//1 små spær blå rød
        kkUregn.add(b);//2 antal store spær væg 1 blå
        kkUregn.add(n);//3 mellem spær rød blå
        kkUregn.add(m);//4 små spær rød blå
        kkUregn.add(q);//5 antal store spær væg 1 rød
        kkUregn.add(a);//6 antal store spær væg 2 blå
        kkUregn.add(k);//7 mellem spær blå rød modsat
        kkUregn.add(i);//8 små spær blå rød modsat
        kkUregn.add(w);//9antal store spær rød blå
        kkUregn.add(c);//mellem spær rød blå modsat
        kkUregn.add(g);//små spær rød blå modsat

        return kkUregn;
    }
    //**********************
//    public void antalPlader(){
//
//        double a = formuregn2.get(6) * formUregn2wall2.get(6);
//
//        String  b = Double.toString(a);
//
//    }


}

