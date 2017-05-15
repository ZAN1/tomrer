package com.example.klisterdk.tomrer;

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
    //String wall13 = SwapMain.getWall13();
    //metode loft plade er midt på midtten af væg

    public static List<Double> Uregn(String wall12)
    {

        Uregn1 = new ArrayList<Double>();
        double  b, c, d, e, f, g, h, i;


        double a = Double.parseDouble(wall12);




        b = a / 2;//finder midt af væg
        c = b / 0.60;// finder rå mål på hvormange plader
        d = Math.floor(c);//runder ned til hel tal
        e = d * 0.60;//ganger halv tal med plade brede for at få længde på alle hele plader lagt sammen
        f = b - e;//halv væg - alle hele plader for at finde den sidste plade brede
        g = (d * 2) + 2;// antal plader i alt
        // redred spær antal
        h = (e / 1.20) * 2; // antal spær
        i = h - 1;//antal spærrum





        Uregn1.add(b);//0
        Uregn1.add(c);//1
        Uregn1.add(d);//2
        Uregn1.add(e);//3
        Uregn1.add(f);//4
        Uregn1.add(g);//5
        Uregn1.add(a);//6
        Uregn1.add(h);//7
        Uregn1.add(i);//8
        return Uregn1;



    }

    // metode pladekant er ind til midt
    public static List<Double> Uregn2(String wall12)
    {
        Uregn3  = new ArrayList<Double>();

        double a = Double.parseDouble(wall12);
        double  b, c, d, e, f, h, g, i, j;

        b = a / 2; //finder midt af væg
        c = b - 0.30;  //træker en halv plade fra halv væg
        d = c / 0.60;// finder rå mål på hvormange plader
        e = Math.floor(d);//runder ned til hel tal
        f = e * 0.60; //ganger hal tal med plade brede for at få længde på alle hele plader lagt sammen
        g = c - f;//halv væg - alle hele plader for at finde den sidste plade brede
        h = (e * 2) + 3;// antal plader i alt
        // spær blåblå
        i = (f / 1.20 + 1) * 2; //antal spær
        j = (f / 1.20) * 2;//antal spær rum
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
        Uregn3.add(i);//8
        Uregn3.add(j);//9
        // Uregn3.Add(j);//8
        // Uregn3.Add(k);//9
        //Uregn3.Add(l);//10
        //egn3.Add(m);//11

        return Uregn3;
    }

    //--------------------------------------------------------------------------------------
    //væg nr 2

    //metode loft plade er midt på midtten af væg
    public static List<Double> Uregnwall2(String wallv2)
    {
        wall2Uregn1 = new ArrayList<Double>();
        double  b, c, d, e, f, h, g, i;
       double a = Double.parseDouble(wallv2);




        b = a / 2;//finder midt af væg
        c = b / 0.60;// finder rå mål på hvormange plader
        d = Math.floor(c);//runder ned til hel tal
        e = d * 0.60;//ganger hal tal med plade brede for at få længde på alle hele plader lagt sammen
        f = b - e;//halv væg - alle hele plader for at finde den sidste plade brede
        g = (d * 2) + 2;// antal plader i alt
        h = (e * 2) / 1.20; // antal spær
        i = h + 1;//antalrum




        wall2Uregn1.add(b);//0
        wall2Uregn1.add(c);//1
        wall2Uregn1.add(d);//2
        wall2Uregn1.add(e);//3
        wall2Uregn1.add(f);//4
        wall2Uregn1.add(g);//5
        wall2Uregn1.add(h);//6
        wall2Uregn1.add(a);//7
        wall2Uregn1.add(h);//8
        wall2Uregn1.add(i);//9
        return wall2Uregn1;



    }
    // --
    // metode pladekant er ind til midt på væg nr 2
    //***************************************************************************
    public static List<Double> Uregn2wall2(String wallv2)
    {
        wall2Uregn3 = new ArrayList<Double>();
        double  b, c, d, e, f, h, g, i, j;
        double a = Double.parseDouble(wallv2);
        b = a / 2; //finder midt af væg
        c = b - 0.30;  //træker en halv plade fra halv væg
        d = c / 0.60;// finder rå mål på hvormange plader
        e = Math.floor(d);//runder ned til hel tal
        f = e * 0.60; //ganger hal tal med plade brede for at få længde på alle hele plader lagt sammen
        g = c - f;//halv væg - alle hele plader for at finde den sidste plade brede
        h = (e * 2) + 3;// antal plader i alt
        i = (f / 1.20 + 1) * 2; //antal spær
        j = (f / 1.20) * 2;//antal spær rum
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


        double a, b, c, d, e, f, g, h, i, j, k, l;
        a = Uregn3.get(4);//væg 1 alle hele plader
        d = wall2Uregn3.get(6);//antal plader
        i = Uregn3.get(7);//længde af væg
        j = wall2Uregn3.get(7);//væg 2 antal hele plade
        k = wall2Uregn3.get(4);//væg 2 alle hele plader
        l = Uregn3.get(6);//antal plader
        // double error = 9999;
        List<Double> sUregn = new ArrayList<Double>();
        if (a < k)
        {
            b = (a / 1.20 + 1) * 2; //antal spær
            c = (a / 1.20) * 2; //antal spær rum
            e = (d - 1) * c;//antal mellem spær
            f = (d - 1) * 3; // antal små spær i madt og kanter
            g = d * c;//antalet af små spær i spær rum
            h = g + f;// antal af små spær i alt



            sUregn.add(b);//0
            sUregn.add(e);//1
            sUregn.add(h);//2
            sUregn.add(c);//3

            return sUregn;
        }
        else if (k < a)
        {
            b = (k / 1.20 + 1) * 2; //antal spær
            c = (k / 1.20) * 2; //antal spær rum
            e = (l - 1) * c;//antal mellem spær
            f = (l - 1) * 3; // antal små spær i madt og kanter
            g = l * c;//antalet af små spær i spær rum
            h = g + f;// antal af små spær i alt

            sUregn.add(b);//0
            sUregn.add(e);//1
            sUregn.add(h);//2
            sUregn.add(c);//3

            return sUregn;
        }
        else if (a == k)
        {
            b = (a / 1.20 + 1) * 2; //antal spær
            c = (a / 1.20) * 2; //antal spær rum
            e = (d - 1) * c;//antal mellem spær
            f = (d - 1) * 3; // antal små spær i madt og kanter
            g = d * c;//antalet af små spær i spær rum
            h = g + f;// antal af små spær i alt



            sUregn.add(b);//0
            sUregn.add(e);//1
            sUregn.add(h);//2
            sUregn.add(c);//3

            return sUregn;
        }
        else
        {
            return sUregn;
        }

    }



    //****************************************************************

    public static List<Double> kantkant()
    {
        List<Double> kUregn = new ArrayList<Double>();
        double a, b, c, d, e, f, g, h, i, j, k, l, m, n;
        a = Uregn1.get(3);//længde af væg1 uden kantplade
        b = wall2Uregn1.get(3);//længde af væg2 uden kantplade
        d = Uregn1.get(6);//længde af væg1
        e = wall2Uregn1.get(7);//længde af væg2
        g = Uregn1.get(5);//antal plader væg 1
        h = wall2Uregn1.get(5);//antal plader væg 2
        if (d < e)//væg 1
        {

            c = (a * 2) / 1.2;//antal spær
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
        else if (e < d)//væg 2
        {
            c = (b * 2) / 1.2;//antal spær
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
            c = (a * 2) / 1.2;//antal spær
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

        double a, b, c, d, e, f, g, h, i, j, k, l, m, n;

        a = Uregn3.get(6);/* antal plader væg */
        b = wall2Uregn1.get(5);//antal plader væg 2
        c = Uregn1.get(8);//antal spær rum kantkant
        d = Uregn3.get(9);//antal spær rum midmid

        e = (b - 1) * d;//mellem spær mid kant**
        f = (b - 1) * 3;//små spær midt kant i midtten og kanter (blå rød)
        g = b * d;//små spær i spær rum mid kant(blå rød)
        h = g + f;// alle små spær hvis (blå rød)***
        i = (a - 1) * c;//antal mellem spær (rød blå)
        j = (a - 1) * 2;//mellem spær i kanterne (rød blå)
        k = i + j;//antal mellem spær i alt (rød blå) ***
        l = a * c;//antal små spær i spær rum (rød blå)
        m = a * 2;//antal små spær i kanter (rød blå)
        n = l + m;//antal små spær i alt (rød blå)**

        kkUregn.add(e);//0
        kkUregn.add(h);//1
        kkUregn.add(k);//2
        kkUregn.add(n);//3
        return kkUregn;
    }
    //**********************


}

