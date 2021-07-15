import java.util.Scanner;
import java.lang.Math;

public class maior_sem_if {
    public static void main(String args[]){
        int a,b,c,t1,tf;
        Scanner tec = new Scanner(System.in);
        a = tec.nextInt();
        b = tec.nextInt();
        c = tec.nextInt();

        t1 = (a+b+Math.abs(a-b))/2;
        tf = (t1+c+Math.abs(t1-c))/2;


        System.out.format("%d eh o maior%n",tf);
        
    }
}

