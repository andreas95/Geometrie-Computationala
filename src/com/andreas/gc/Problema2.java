package com.andreas.gc;

import static java.lang.Math.abs;

/**
 * Created by Andreas on 5/31/16.
 */

/*
Se dau patru puncte in R2. Sa se decida daca ele formeaza un patrulater convex.
Sa se decida daca un al cincelea punct apartine acoperirii convexe a celor 4 puncte.
*/

public class Problema2 {

    public static void main(String[] args) {
        Punct A=new Punct(1,2);
        Punct B=new Punct(3,4);
        Punct C=new Punct(5,6);
        Punct D=new Punct(7,8);
        Punct E=new Punct(0,0);
        if (isConvex(A,B,C,D)) {
            System.out.println("Patrulaterul este convex.");
        } else {
            System.out.println("Patrulaterul este concav.");
            System.exit(-1);
        }
        boolean ok=false;
        double area1=area(A,B,C);
        double area2=area(A,C,D);
        double area3=area(A,B,D);
        double area4=area(B,C,D);
        if ((area(A,B,E)+area(A,C,E)+area(B,C,E))==area1) {
            ok=true;
        }
        if ((area(A,C,E)+area(A,D,E)+area(C,D,E))==area2) {
            ok=true;
        }
        if ((area(A,B,E)+area(A,D,E)+area(B,D,E))==area3) {
            ok=true;
        }
        if ((area(B,C,E)+area(B,D,E)+area(C,D,E))==area4) {
            ok=true;
        }
        if (ok) {
            System.out.println("Punctul este interior acoperirii convexe");
        } else {
            System.out.println("Punctul este exterior acoperirii convexe");
        }
    }

    public static int conv_area(Punct A, Punct B, Punct C) {
        double area= (B.getX() - A.getX()) * (C.getY() - A.getY()) - (B.getY() - A.getY()) * (C.getX() - A.getX());
        if (area>0) {
            return -1;
        } else if (area<0) {
            return 1;
        }
        return 0;
    }

    public static boolean isConvex(Punct A, Punct B, Punct C, Punct D) {
        int constarea=conv_area(A,B,C);
        if (constarea!=conv_area(A,B,D)) {
            return false;
        }
        if (constarea!=conv_area(B,C,D)) {
            return false;
        }
        if (constarea!=conv_area(A,C,D)) {
            return false;
        }
        return true;
    }

    public static double area(Punct A, Punct B, Punct C) {
        return abs((A.getX()*B.getY()+C.getX()*A.getY()+B.getX()*C.getY()-B.getY()*C.getX()-A.getY()*B.getX()-C.getY()*A.getX())/2);
    }
}
