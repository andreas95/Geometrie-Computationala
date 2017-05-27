package com.andreas.gc;

/**
 * Created by Andreas on 5/31/16.
 */

/*
Fie ABCD un patrulater convex dat prin coordonatele varfurilor sale.
Sa se decida pozitia punctului D fata de cercul circumscris triunghiului ABC
si daca patrulaterul ABCD este circumscriptibil (admite un cerc tangent la toate laturile sale).
*/
public class Problema4 {

    public static final double PI=3.14159265;
    public static void main(String[] args) {
        Punct A=new Punct(1,2);
        Punct B=new Punct(3,4);
        Punct C=new Punct(5,6);
        Punct D=new Punct(7,8);
        double a,b,c,d;
        a=B.getX()-C.getX();
        b=B.getY()-C.getY();
        c=B.getX()-A.getX();
        d=B.getY()-A.getY();
        double angle1=Math.atan2(a,b);
        double angle2=Math.atan2(c,d);
        double angle3=(angle1-angle2)*180/PI;
        if (angle3<0) {
            angle3+=360;
        }
        a=D.getX()-C.getX();
        b=D.getY()-C.getY();
        c=D.getX()-A.getX();
        d=D.getY()-A.getY();
        angle1=Math.atan2(b,a);
        angle2=Math.atan2(d,c);
        double angle4=(angle1-angle2)*180/PI;
        if (angle4<0) {
            angle4+=360;
        }
        double angle5=angle4+angle3;
        if (angle5<180) {
            System.out.println("Punctul D se afla in afara cercului.");
        } else if (angle5==180) {
            System.out.println("Punctul D se afla pe cerc.");
        } else {
            System.out.println("Punctul D se afla in interiorul cercului.");
        }
        double ab=Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));
        double cd=Math.sqrt(Math.pow(D.getX()-C.getX(),2)+Math.pow(D.getY()-C.getY(),2));
        double ad=Math.sqrt(Math.pow(D.getX()-A.getX(),2)+Math.pow(D.getY()-A.getY(),2));
        double bc=Math.sqrt(Math.pow(C.getX()-B.getX(),2)+Math.pow(C.getY()-B.getY(),2));
        if (ab+cd==ad+bc) {
            System.out.println("Patrulaterul ABCD este circumscriptibil.");
        } else {
            System.out.println("Patrulaterul ABCD nu este circumscriptibil.");
        }
    }
}
