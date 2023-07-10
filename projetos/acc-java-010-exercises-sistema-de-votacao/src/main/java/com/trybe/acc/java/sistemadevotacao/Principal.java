package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Principal.
 */
public class Principal {

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Cadastrar pessoa candidata?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada: ");
    byte respostaPessoaCandidata = scanner.nextByte();

    while (respostaPessoaCandidata == 1) {
      String nome;

      System.out.println("Entre com o nome da pessoa candidata: ");
      nome = scanner.next();
      System.out.println("Entre com o número da pessoa candidata: ");
      int numero = scanner.nextInt();

      gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);

      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada: ");
      respostaPessoaCandidata = scanner.nextByte();
    }

    System.out.println("Cadastrar pessoa eleitora?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada: ");
    byte respostaPessoaEleitora = scanner.nextByte();

    while (respostaPessoaEleitora == 1) {
      String nome;

      System.out.println("Entre com o nome da pessoa eleitora: ");
      nome = scanner.next();
      System.out.println("Entre com o CPF da pessoa eleitora: ");
      String cpf = scanner.next();

      gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);

      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada: ");
      respostaPessoaEleitora = scanner.nextByte();
    }

    System.out.println("Entre com o número correspondente à opção desejada: ");
    System.out.println("1 - Votar");
    System.out.println("2 - Resultado Parcial");
    System.out.println("3 - Finalizar Votação");
    byte respostaFinal = scanner.nextByte();

    while (respostaFinal == 1) {
      String cpf;

      System.out.println("Entre com o CPF da pessoa eleitora: ");
      cpf = scanner.next();
      System.out.println("Entre com o número da pessoa candidata: ");
      int numero = scanner.nextInt();

      gerenciamentoVotacao.votar(cpf, numero);

      System.out.println("Entre com o número correspondente à opção desejada: ");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      respostaFinal = scanner.nextByte();
    }

    while (respostaFinal == 2) {
      gerenciamentoVotacao.mostrarResultado();

      System.out.println("Entre com o número correspondente à opção desejada: ");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      respostaFinal = scanner.nextByte();
    }

    if (respostaFinal == 3) {
      gerenciamentoVotacao.mostrarResultado();
    }

    scanner.close();
  }
}
