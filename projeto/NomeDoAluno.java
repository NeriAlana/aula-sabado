
// Exercício:
// Óculos em cima de um livro
// Escrever um programa que leia o nome de um aluno e as notas 
// das duas provas que ele obteve no semestre. 
// No final informar o nome do aluno e a sua média (aritmética).
// Se a média aritmética do aluno for menor que 7, o aluno está reprovado.



public class NomeDoAluno {
    public static void main(String[] args) {
        String aluno = "Alana";
        double nota1 = 8.0;
        double nota2 = 7.5;
        double media = (nota1 + nota2)/2;

        
        System.out.printf("%s, média %.2f. \n", aluno, media);

        if (media >= 7) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO");
        }

    }
}
