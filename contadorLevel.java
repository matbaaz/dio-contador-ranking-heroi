import java.util.Scanner;

public class contadorLevel{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o nome do seu Heroi:");
    String nomeHeroi = scan.nextLine();
    String ranking = "";
    System.out.println("Digite a xp do seu Heroi:");
    Double xpHeroi = scan.nextDouble();

    System.out.println("Seu heroi se chama "+nomeHeroi+" e tem "+xpHeroi+" de xp.");

    if (xpHeroi<0){
      System.out.println("Seu heroi "+nomeHeroi+" está fora dos rankings!");
      ranking = "Nenhum";
    }else if(xpHeroi<=1000){
      ranking = "Ferro";
    }else if(xpHeroi <=2000){
      ranking = "Bronze";
    }else if(xpHeroi <=5000){
      ranking = "Prata";
    }else if(xpHeroi<=7000){
      ranking = "Ouro";
    }else if(xpHeroi<=8000){
      ranking = "Platina";
    }else if(xpHeroi<=9000){
      ranking = "Ascendente";
    }else if(xpHeroi<=10000){
      ranking = "Imortal";
    }else{
      ranking = "Radiante";
    }
    System.out.println("O Heroi "+nomeHeroi+" se encontra no ranking "+ranking+"!");
  }
}
