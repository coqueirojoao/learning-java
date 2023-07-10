package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Class Principal.
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    ArrayList<Short> idades = new ArrayList<Short>();
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    decimalFormat.setMinimumFractionDigits(1);
    Scanner scanner = new Scanner(System.in);


    System.out.println("Entre com o número correspondente à opção desejada: ");
    System.out.println("1 - Acessar o estabelecimento");
    System.out.println("2 - Finalizar sistema e mostrar relatório");

    byte linhaDeComando = scanner.nextByte();

    while (linhaDeComando != 1 && linhaDeComando != 2) {
      System.out.println("Entre com uma opção válida!");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      linhaDeComando = scanner.nextByte();
    }


    while (linhaDeComando == 1) {
      System.out.println("Entre com a sua idade: ");
      short idade = scanner.nextShort();
      idades.add(idade);

      if (idade < 18) {
        System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      } else if (idade >= 18 && idade <= 49) {
        System.out.println("Pessoa adulta, catraca liberada!");
      } else if (idade >= 50) {
        System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      }

      System.out.println("Entre com o número correspondente à opção desejada: ");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      linhaDeComando = scanner.nextByte();

    }

    int numeroDePessoas = idades.size();
    int menoresDeIdade = 0;
    int pessoasAdultas = 0;
    int pessoasIdosas = 0;

    for (int i = 0; i < idades.size(); i++) {
      if (idades.get(i) < 18) {
        menoresDeIdade += 1;
      } else if (idades.get(i) >= 18 && idades.get(i) <= 49) {
        pessoasAdultas += 1;
      } else if (idades.get(i) >= 50) {
        pessoasIdosas += 1;
      }
    }

    String percentualDeMenores =
        decimalFormat.format((double) menoresDeIdade / numeroDePessoas * 100);
    String percentualDeAdultos =
        decimalFormat.format((double) pessoasAdultas / numeroDePessoas * 100);
    String percentualDeIdosos =
        decimalFormat.format((double) pessoasIdosas / numeroDePessoas * 100);


    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menoresDeIdade);
    System.out.println("adultas: " + pessoasAdultas);
    System.out.println("a partir de 50: " + pessoasIdosas + "\n");

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + percentualDeMenores);
    System.out.println("adultas: " + percentualDeAdultos);
    System.out.println("a partir de 50: " + percentualDeIdosos + "\n");

    System.out.println("TOTAL: " + numeroDePessoas);
    scanner.close();



  }


}
