package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
            
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu){
            System.out.println("Conseguimos contado com o candidato (a) " + candidato + " NA " + tentativasRealizadas + " Tentativa(s)");    
        }
        else{
            System.out.println("Não conseguimos contato com o candidato (a) " + candidato + " número máximo de tentativas " + tentativasRealizadas + " realizada(s)");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        //usa o for tradicional para imprimir o indice
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for(int i=0; i<candidatos.length; i++){
            System.out.println("O candidato de numero: " + (i + 1) + " é " + candidatos[i]);
        }

        System.out.println("Forma abreviada de iteração for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato); 
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor pretendido " + salarioPretendido);
            if(salarioBase > salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando os resultados dos demais candidatos");
        }

    }

    
}