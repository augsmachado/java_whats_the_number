package whatsnumber;

import java.util.Scanner;
import java.util.Random;

public class WhatsNumber {

    public static void main(String[] args) {
        int palpite = 0,
                sorteado,
                tentativas = 0;
        Scanner e = new Scanner(System.in);
        
        Random geradorAleatorios = new Random();
        sorteado = geradorAleatorios.nextInt(1000) +1;
        System.out.println("Número entre 1 e 1000 sorteado!");
        
        do {
            System.out.printf("\n\n\n--------------------\n");
            System.out.println("Número de tentativas: " +tentativas);
            
            System.out.print("Qual é o seu palpite: ");
            palpite = e.nextInt();
            
            tentativas++;
            
            dica(palpite, sorteado, tentativas);
        } while (palpite != sorteado);
    }
    
    public static void dica(int palpite, int num, int tentativas) {
        if (palpite > num) {
            System.out.println("Seu palpite é maior do que o número sorteado.");
        } else {
            if (palpite < num) {
                System.out.println("Seu palpite é menor do que o número sorteado.");
            } else {
                System.out.println("Parabéns, você acertou! O número era " +num);
                System.out.println("Você tentou " +tentativas +" vezes antes de acertar!");
            }
        }
    }
}
