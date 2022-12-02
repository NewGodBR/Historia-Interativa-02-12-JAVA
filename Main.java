//importar scanner

import java.util.Scanner;

// Começo da classe:

public class Main {
    public static void main(String[] args) throws Exception {

        //Definir variáveis e criar escaneador

        String escolha;
        
        Scanner imput = new Scanner(System.in);

        // Apresentação da historia

        System.out.println("Você se vê andando a noite na rua, deserta");

        // Acontecimento anterior a decisão

        System.out.println("Escuta um som de motor distante, você olha pra trás\n"+
        "e vê uma moto com duas pessoas se aproximando\n"+
        
        //Opções:
        "~ Será que que vou ser assaltado?\n"+
        "~ E agora? será que eu [Corro] ou continuo [Andando]"
        );

        // Tomada de Decisão

        escolha = imput.nextLine();
        
        // Acontecimentos pós Decisão e por assim vai
        
        if (escolha.equals("Corro")){
            // continuação
            System.out.println("~ Eu acho melhor correr to com muito dinheiro no bolso\n"+
            "Você então começa a correr em direção a uma rua mais movimentada e escuta a moto acelerar\n"+
            "~~~\n"+
            "A claridade da rua começa a tomar conta da sua visão\n"+
            "*Barulho do exaustor, e então vc olha pra trás e vê que a moto desistiu\n"+
            "Um policial observa você se aproximando esbaforido e vai ao seu encontro\n"+
            "== Alto lá cidadão de onde você vem? O que aconteceu?\n"+
            "~ Conto sobre a [Moto] ou falo que só vou ao [Banco]?\n"
            );
            // Tomada de Decisão
            escolha = imput.nextLine();
            if (escolha.equals("Moto")){
                System.out.println(
                "--Senhor Policial *arg*, eu estava vindo de casa para o banco, e dois caras\n"+
                "numa moto começaram a me perseguir na rua de tras * você aponta* pensei que seria um assalto\n"+
                "*vc explica todos os detalhes que se lembra ao policial e responde à umas perguntas de rotina\n"+
                "== Certo, daremos um alerta de aviso, mas o que vai fazer no banco à essa hora ? Já está fechado\n"+
                "Você então pega o seu celular e vê que ao desviar o caminho fugindo da moto que já é tarde\n"+
                "o Banco fechou e agora (sexta) o pagamento só vai constar na segunda, ATRASADA"
                );
            }
            else if (escolha.equals("Banco")){
                System.out.println(
                "--o BANCO, VAI FECHAR... \n"+
                "*Você para um momento cumprimenta o policial e explica rapido que está indo ao banco pagar uma conta\n"+
                "De alguma forma você consegue chegar a tempo ao banco e tem UM caixa livre que ta brilhando nos seus olhos\n"+
                "CONTA PAGA"
                );
            }
            else{
                System.out.println(
                "*Não importa o que você tenha falado ou feito, o policial não foi com sua cara e\n"+
                "Pula em sua direção e te leva preso por desacato\n"+
                "UMA NOITE NA CADEIA"
                );
            }
        }
        else if (escolha.equals("Andando")){
            System.out.println(
            "~~ Vou continuar andando\n"+
            "Você começa a cantarolar a musica BREAK MY STRIDE\n"+
            "-- ..nothin' gonna break my stryde\n"+
            "-- nobody gonna slow me down\n\n"+
            "a moto para do seu lado, sem gritaria nem ameaças, o garupa saca uma arma e te da um tiro\n"+
            "VOCE MORREU *e roubaram suas coisas"
            );
        }
        else {
            System.out.println(
            "A moto começa a acelerar e você vai escutando o escapamento fazendo um barulho muito alto\n"+
            "Você ter "+escolha+" não impediu os bandidos de te matarem, aparentemente foi planejado\n"+
            "VOCE MORREU"
            );
        }
        imput.close();
    }
}