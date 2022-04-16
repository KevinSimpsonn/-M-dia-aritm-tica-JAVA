import java.util.Scanner;

public class media {


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double n1, n2, n3;
        double soma = 0;
        double media;
        double recuperacao;
        double prova_final;


        System.out.println("Digite a Primeira Nota: ");
        n1 = a.nextDouble();
        System.out.println("Digite a Segunda Nota: ");
        n2 = a.nextDouble();
        System.out.println("Digite a Terceira Nota: ");
        n3 = a.nextDouble();

        soma = n1 + n2 + n3;
        media = soma / 3;
        System.out.println("Sua media e: " + media);

        recuperacao = 10 - media + 2;
        prova_final = 10 + media;

        if( (media >= 0) && (media <= 4.9) ){
            System.out.println("Aluno em RECUPERACAO");
            System.out.println("Voce precisa de " + recuperacao + " para ser Aprovado!");
        } else if( (media >= 5 ) && (media <= 6.9) ) {
            System.out.println("Aluno vai fazer PROVA FINAL");
            System.out.println("Voce precisa de " + prova_final + " para ser Aprovado!");
        } else {
            System.out.println("Aluno APROVADO POR MEDIA!");
        }



    }

}
