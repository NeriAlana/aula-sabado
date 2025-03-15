// Faça um método que calcule a média de um aluno de acordo com o 
// critério definido neste curso. Além disso, faça um outro método 
// que informe o status do aluno de acordo com a tabela a seguir: 
// Nota maior ou igual a 7: “Aprovado” ;
// Nota entre 5 e 6,9: “Verificação Suplementar” ;
// Nota abaixo de 5: “Reprovado”.

public class CalcularMedia {
    public static void main(String[] args) {
       String aluno = "Alana"; 
       double nota1 =  8.0;
       double nota2 = 6.1;
       double media = (nota1 + nota2)/2;
       
       System.out.printf(" O aluno %s, com média: %.2f está ", aluno, media );

       if (media >= 7) {
           System.out.println("Aprovado");
       } else if (media < 7 && media == 5) {
           System.out.println("Verificação Suplementar");  
       } else {
           System.out.println("Reprovado"); 
       }
    
    }
}
