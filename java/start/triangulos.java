import java.util.Scanner;
import java.lang.Math;

public class triangulos {
    public static void main(String args[]){
        double a,b,c;
        Scanner tec = new Scanner(System.in);
        a = tec.nextDouble();
        b = tec.nextDouble();
        c = tec.nextDouble();
        double holder;
        
        if (a<b) {
            holder = b;
            b = a;
            a = holder;
        }
        if (a<c){
            holder = c;
            c =a ;
            a=holder;
        }
        if (b<c) {
            holder =c;
            c=b;
            b=holder;
        }

        /////////
        if (a>=b+c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a*a == b*b + c*c)  System.out.println("TRIANGULO RETANGULO");
            if (a*a>b*b+c*c) System.out.println("TRIANGULO OBTUSANGULO");
            if (a*a<b*b+c*c) System.out.println("TRIANGULO ACUTANGULO");
            if (a==b & b==c) System.out.println("TRIANGULO EQUILATERO");
            if (a==b && b!=c || b==c && c!=a || a==c && c!=b) System.out.println("TRIANGULO ISOSCELES");
        }



    }
}
