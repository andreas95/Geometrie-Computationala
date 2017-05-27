package com.andreas.gc;

/**
 * Created by Andreas on 5/31/16.
 */

/*
Se dau 3 puncte in R3 . Sa se decida daca sunt coliniare.
In caz afirmativ sa se calculeze unul dintre rapoartele determinate de cele 3 puncte.
Sa se exprime unul dintre puncte ca o combinatie afina a celorlale 2 puncte.
*/

public class Problema1 {

    public static void main(String[] args) {
        Punct A=new Punct(3,4,-2);
        Punct B=new Punct(7,8,-8);
        Punct C=new Punct(13,14,-17);
        double d1=A.getX()*B.getY() + A.getY()*C.getX() + B.getX()*C.getY() - C.getX()*B.getY() - B.getX()*A.getY() - A.getX()*C.getY();
        double d2=A.getX()*B.getZ() + A.getZ()*C.getX() + B.getX()*C.getZ() - C.getX()*B.getZ() - B.getX()*A.getZ() - A.getX()*C.getZ();
        double d3=A.getZ()*B.getY() + A.getY()*C.getZ() + B.getZ()*C.getY() - C.getZ()*B.getY() - B.getZ()*A.getY() - A.getZ()*C.getY();
        if (d1==d2 && d2==d3 && d3==0) {
            System.out.println("Punctele sunt coliniare!");
            if (A.getX()==C.getX() && A.getY()==C.getY() && A.getZ()==C.getZ()) {
                System.out.println("A=C*1+0*B");
            } else {
                double raport=0;
                if ((B.getX() - C.getX()) != 0 && (A.getX() - C.getX()) != 0) {
                    raport = (B.getX() - C.getX()) / (A.getX() - C.getX());
                }
                if ((B.getY() - C.getY()) != 0 && (A.getY() - C.getY()) != 0) {
                    raport = (B.getY() - C.getY()) / (A.getY() - C.getY());
                }
                if ((B.getZ() - C.getZ()) != 0 && (A.getZ() - C.getZ()) != 0) {
                    raport = (B.getZ() - C.getZ()) / (A.getZ() - C.getZ());
                }
                System.out.println("B="+raport+"*A+"+(1-raport)+"*C;");
            }
        } else {
            System.out.println("Punctele nu sunt coliniare!");
        }
    }
}