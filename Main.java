//importar scanner

import java.util.Scanner;

// Começo da classe:

public class Main {
    public static void main(String[] args) throws Exception {

        //Definir variáveis e criar escaneador

        String escolha;
        
        Scanner imput = new Scanner(System.in);

        // Apresentação da historia

        System.out.println("Um maluco está correndo e gritando ");

        // Acontecimento anterior a decisão

        System.out.println("vindo em sua direção:\n"+
        
        //Opções:
        "[Correr]"+
        "[Gritar]"+
        "[Nada]");

        // Tomada de Decisão

        escolha = imput.nextLine();
        
        // Acontecimentos pós Decisão e por assim vai
        
        if (escolha.equals("Correr")){
            // continuação
            
        }
        imput.close();
    }
}