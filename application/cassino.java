package application;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class cassino {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Random gerador = new Random();
    int a,b,c;
    int exit = 0;
    double aposta;
     
    System.out.println("digite sua aposta: ");
        aposta = ler.nextDouble();
    System.out.println("Você botou "+aposta+"R$!");
    
        while(exit==0){
            a=gerador.nextInt(2);
            b=gerador.nextInt(2);
            c=gerador.nextInt(2);
            
            System.out.println("A: "+a+" B: "+b+" C: "+c);
     
            if(a==b && b==c){
                System.out.println("foi");
                aposta = aposta + 100;
            }else{
                aposta = aposta  - 50;
                System.out.println("não foi");
            }
      
        System.out.println("Voce tem ainda: R$ "+aposta);
        System.out.println("Continuar??? 0-sim qualquer numero-não");
            exit = ler.nextInt();
        }
    }
}
