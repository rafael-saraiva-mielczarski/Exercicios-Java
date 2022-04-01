package application;

import java.util.Scanner;

public abstract class hotel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	     int[][] quartos = new int[4][6];
	     int opcao;
	     int exit = 1;
	     int i = 0 , j;
	     int pessoas = 1;
	     int diaria = 1;
	     double lotacao;
	     double dinheiro = 0;
	     while(exit==1){
	        System.out.print("1-Entra 2-Sai 3-Ver vagas 4-Ver faturamento 5-Ver lotação");
	        opcao = ler.nextInt();
	        switch (opcao){
	            case 1:
	              System.out.print("Digitar o andar: 0-P1 1-P2 2-P3 3-P4 ");
	              i = ler.nextInt();
	              System.out.print("Quanta pessoas: ");
	              pessoas = ler.nextInt();
	              System.out.print("Quantas diarias: ");
	              diaria = ler.nextInt();
	              System.out.print("1-Q1 2-Q2 3-Q3 4-Q4 5-Q5 6-Q6 ");
	              j = ler.nextInt();
	              if(j==1){
	                quartos[i][j-1] = 1;
	              }else{
	                  if(j==2){
	                quartos[i][j-1] = 1;
	              }else{
	                  if(j==3){
	                quartos[i][j-1] = 1;
	              }else{
	                  if(j==4){
	                quartos[i][j-1] = 1;
	              }else{
	                  if(j==5){
	                quartos[i][j-1] = 1;
	              }else{
	                  if(j==6){
	                quartos[i][j-1] = 1;
	              }
	                  }
	                  }
	                  }
	                  }
	              }
	             System.out.print("Cliente acomodado! ");
	            break;
	            case 2:
	              System.out.print("Retirar do andar:  ");
	              i = ler.nextInt();
	              System.out.print("1-Q1 2-Q2 3-Q3 4-Q4 5-Q5 6-Q6 ");
	              j = ler.nextInt();
	              if(j==1){
	                quartos[i][j-1] = 0;
	              }else{
	                  if(j==2){
	                quartos[i][j-1] = 0;
	              }else{
	                  if(j==3){
	                quartos[i][j-1] = 0;
	              }else{
	                  if(j==4){
	                quartos[i][j-1] = 0;
	              }else{
	                  if(j==5){
	                quartos[i][j-1] = 0;
	              }else{ 
	                  if(j==6){
	                quartos[i][j-1] = 0;
	                  }
	                  }
	                  }
	                  }
	                  }
	              }  
	               if(i != 4){
	                  dinheiro = dinheiro + pessoas * 150 * diaria;
	              }else{
	                    if(i == 4){
	                    dinheiro = dinheiro + pessoas * 200 * diaria;
	                    }
	                }
	            System.out.print("Cliente retirado! ");
	            break;
	            case 3:
	            for(i=0;i<=3;i++){
	                for(j=0;j<=5;j++){
	               System.out.print(" "+quartos[i][j]);
	                }
	                System.out.println(" ");
	                }
	            break;
	            case 4:
	                System.out.println("R$ "+dinheiro);
	            break;    
	            case 5:
	                lotacao = i * 100 / 24 ;
	                System.out.println("Sua lotação é de: "+lotacao+"%");
	            break;
	            default:
	                System.out.println("valor inválido! ");
	            break;
	        }
	        System.out.print("Deseja Continuar? 1-Sim 2-Não ");
	        exit = ler.nextInt();
	        System.out.print("Obrigado pelo uso!");
	     }
	     }   

	}