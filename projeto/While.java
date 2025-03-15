// Altere o exercício que solicita notas para o usuário e  
// valide a nota que o usuário está inserindo. 
// Caso seja menor que zero ou maior que dez, repita a
// pergunta. 
import java.util.Scanner;


public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avaliacao;
        do{
            System.out.println("Avalie nosso atendimento. de 0 a 10 estrelas: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
            avaliacao = scanner.nextInt();

            if (avaliacao < 0 || avaliacao > 10) {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
            }
        } while (avaliacao < 0 || avaliacao > 10);

        System.out.println("Obrigado pela sua avaliação: " + avaliacao + " estrelas!");
        scanner.close();
    }
    
}
