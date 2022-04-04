package application;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class bomba {

     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     Random gerador = new Random();
     
     String[][]  grade = new String[4][4];
     int l,c,i,j;
     int acaba = 0;
     
     for(i=0;i<=2;i++){
        l = gerador.nextInt(3);
        c = gerador.nextInt(3);
          grade[l][c] = "Bomb";
     }
     
     for(i=0;i<=3;i++){
         for(j=0;j<=3;j++){
           if(!"Bomb".equals(grade[i][j])){
              grade[i][j] = "_";
           }
        }
    
      while(acaba==0){
        System.out.print("Linha: ");
        l = ler.nextInt();
        System.out.print("Coluna: ");
        c = ler.nextInt();
       
        if("Bomb".equals(grade[l][c])){
          acaba = 1;
        }
        if(!"Bomb".equals(grade[l][c])){
          grade[l][c]="F";
        }
        
        for(i=0;i<=3;i++){
          for(j=0;j<=3;j++){
            if("Bomb".equals(grade[i][j])){
              System.out.print("_");
            }else{
              System.out.print(" "+grade[i][j]);
            }
          }
          
          System.out.println(" ");
          
          }
        }
      }
    }
  }
