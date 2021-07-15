import java.util.Scanner;
import java.lang.Math;

public class jogoduracao {
    public static void main(String args[]){
        int startT,endT,startM,endM,totM,totH;
        Scanner tec = new Scanner(System.in);
        startT = tec.nextInt();
        startM = tec.nextInt();
        endT = tec.nextInt();
        endM = tec.nextInt();

        if (startT>=endT) {
            totH = 24+endT-startT;

        } else {
            totH = endT-startT;
        }

        if (startM>endM) {
            totM = endM+60-startM;
            totH--;
        } else if (startM==endM) {
            totM=0;
        } else {
             totM = endM-startM;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS(S)\n",totH,totM);





    }
}
