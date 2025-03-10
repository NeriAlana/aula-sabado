
//Exercício:

//A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) 
//prestações sem juros. Faça um programa que receba um valor de 
//uma compra e mostre o valor das prestações. 
//No final informar o nome do mercado e valor de cada parcela.


public class LojaMamaoComAcucar {
    public static void main(String[] args) {
        
        double produto1 = 5.000;
        double produto2 = 8.000;
        double produto3 = 2.000;
    
        double parcela1 = (produto1 / 5);
        double parcela2 = (produto2 / 5);
        double parcela3 = (produto3 / 5);
        
        String formattString = String.format("Valor do Produto1: %.3f., em 5 parcelas de %.3f. \n " +
                                            "Valor do Produto2: %.3f., em 5 parcelas de %.3f. \n  " +
                                            "Valor do produto3: %.3f., em 5 parcelas de %.3f. ", produto1, parcela1, produto2, parcela2, produto3, parcela3);
    
        System.out.println("Loja Mamão com Açúcar");
        System.out.println(formattString);
    }

}

