import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercício 17: "Programa para loja de tintas"

        //Entradas: O programa deverá pedir o tamanho em m² da área a ser pintada
        System.out.println("Entre com a metragem a ser pintada em m²");
        Scanner teclado = new Scanner(System.in);
        double metragem = teclado.nextDouble();
        teclado.close();

        //Processamentos: 
        // 1°: cobertura 1L por 6m² = 1L/6m²
        double rendimentoLitros = 6;

        // 2°: Lata 18L = 80 reais
        double precoLata = 80;
        double volumeLataLitros = 18;

        // 3°: Galões 3,6L = 25 reais
        double precoGalao = 25;

        // 4°: Calcular quantas latas de 18L
            // 1 -> 1 -> 6
            // metragem / (6 * 18) = 
        double quantidadeLatas = metragem / (volumeLataLitros * rendimentoLitros);

        // 5°: Calcular o valor total em latas
        double valorTotalLatas = quantidadeLatas * precoLata;

        // 6°: Calcular quantos galões de 3,6L
        // 7°: Calcular a melhor quantidade de latas e galões, considerando quantidades de latas/galões cheios e 10% de folga.

        //Saídas: apresentar os resultados dos cálculos.
        System.out.printf("A metragem a ser pintada é de %f metros quadrados", metragem);
        System.out.println("");
        System.out.printf("A quantidade de latas é %f e o valor total em latas é %f", quantidadeLatas, valorTotalLatas);


    }
}
