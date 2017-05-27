package com.andreas.gc;

/**
 * Created by Andreas on 5/31/16.
 */

//Se studieze intersectia a doua segmente date din R2.

public class Problema3 {

    public static void main(String[] args) {
        Punct A=new Punct(1,2);
        Punct B=new Punct(1,2);
        Punct C=new Punct(3,4);
        Punct D=new Punct(3,4);
        Punct segmentul1=new Punct(B.getX()-A.getX(),B.getY()-A.getY());
        Punct segmentul2=new Punct(D.getX()-C.getX(),D.getY()-C.getY());
        double s1=(segmentul1.getX()*(A.getY()-C.getY())-segmentul1.getY()*(A.getX()-C.getX()))/(segmentul1.getX()*segmentul2.getY()-segmentul2.getX()*segmentul1.getY());
        double s2=(segmentul2.getX()*(A.getY()-C.getY())-segmentul2.getY()*(A.getX()-C.getX()))/(segmentul1.getX()*segmentul2.getY()-segmentul2.getX()*segmentul1.getY());;
        if (s1>=0 && s1<=1 && s2>=0 && s2<=1) {
            double cx=A.getX()+s2*segmentul1.getX();
            double cy=A.getY()+s2*segmentul1.getY();
            System.out.println("Coliziune in punctul ("+cx+","+cy+")!");
            System.exit(-1);
        }
        if (A.getX()==C.getX() && A.getX()==C.getY() && B.getX()==D.getX() && B.getX()==D.getY()) {
            System.out.println("Segmentele se suprapun!");
            System.exit(-1);
        }
        if (A.getX()==C.getX() && A.getY()==C.getY()) {
            System.out.println("Coliziune in punctul ("+A.getX()+","+A.getY()+")!");
            System.exit(-1);
        }
        if (A.getX()==D.getX() && A.getY()==D.getY()) {
            System.out.println("Coliziune in punctul ("+A.getX()+","+A.getY()+")!");
            System.exit(-1);
        }
        if (B.getX()==C.getX() && B.getY()==C.getY()) {
            System.out.println("Coliziune in punctul ("+B.getX()+","+B.getY()+")!");
            System.exit(-1);
        }
        if (B.getX()==D.getX() && B.getY()==D.getY()) {
            System.out.println("Coliziune in punctul ("+B.getX()+","+B.getY()+")!");
            System.exit(-1);
        }
        if (((A.getX()-B.getX())*(C.getY()-D.getY())*(A.getY()-B.getY()))==0 && ((A.getX()-C.getX())*(B.getX()-D.getY())-(B.getX()-D.getX())*(A.getY()-C.getY()))==0 && ((A.getX()-D.getX())*(C.getY()-B.getY())-(C.getX()-B.getX())*(A.getY()-D.getY()))==0) {
            if (A.getX()>B.getX()) {
                double aux;
                aux=B.getX();
                B.setX(A.getX());
                A.setX(aux);
                aux=B.getY();
                B.setY(A.getY());
                A.setY(aux);
            }
            if (C.getX()>D.getX()) {
                double aux;
                aux=D.getX();
                D.setX(C.getX());
                C.setX(aux);
                aux=D.getY();
                D.setY(C.getY());
                D.setY(aux);
            }
            if (A.getX()<=C.getX() && C.getX()<=B.getX() && B.getX()<=D.getX()) {
                System.out.println("Segmentele se suprapun din punctul ("+C.getX()+","+C.getY()+") pana in punctul ("+B.getX()+","+B.getY()+")!");
                System.exit(-1);
            }
            if (C.getX()<=A.getX() && A.getX()<=D.getX() && D.getX()<=B.getX()) {
                System.out.println("Segmentele se suprapun din punctul ("+A.getX()+","+A.getY()+") pana in punctul ("+D.getX()+","+D.getY()+")!");
                System.exit(-1);
            }
            if (A.getX()<=B.getX() && B.getX()<=C.getX() && C.getX()<=D.getX()) {
                System.out.println("Segmentele sunt pe aceeasi dreapta, dar nu se suprapun!");
                System.exit(-1);
            }
            if (C.getX()<=D.getX() && D.getX()<=A.getX() && A.getX()<=B.getX()) {
                System.out.println("Segmentele sunt pe aceeasi dreapta, dar nu se suprapun!");
                System.exit(-1);
            }
            if (A.getX()<=C.getX() && C.getX()<=D.getX() && D.getX()<=B.getX()) {
                System.out.println("Segmentele se suprapun din punctul ("+C.getX()+","+C.getY()+") pana in punctul ("+D.getX()+","+D.getY()+")!");
                System.exit(-1);
            }
            if (C.getX()<=A.getX() && A.getX()<=B.getX() && B.getX()<=D.getX()) {
                System.out.println("Segmentele se suprapun din punctul ("+A.getX()+","+A.getY()+") pana in punctul ("+B.getX()+","+B.getY()+")!");
                System.exit(-1);
            }
        }
            System.out.println("Nu exista coliziune!");
    }
}
