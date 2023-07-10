package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class GerenciamentoVotacao.
 */
public class GerenciamentoVotacao {

  /** The pessoas candidatas. */
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();

  /** The pessoas eleitoras. */
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();

  /** The cpf computado. */
  private ArrayList<String> cpfComputado = new ArrayList<String>();

  /** The total votos. */
  private int totalVotos;

  /**
   * Cadastrar pessoa candidata.
   *
   * @param nome the nome
   * @param numero the numero
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    boolean numeroUtilizado = false;

    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      int numeroDoCandidato = pessoaCandidata.getNumero();

      if (numero == numeroDoCandidato) {
        numeroUtilizado = true;
        break;
      }
    }

    if (numeroUtilizado) {
      System.out.println("Número de pessoa candidata já utilizado!");
    } else {
      PessoaCandidata novaPessoa = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(novaPessoa);
    }
  }

  /**
   * Cadastrar pessoa eleitora.
   *
   * @param nome the nome
   * @param cpf the cpf
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    boolean cpfUtilizado = false;

    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      String cpfDoEleitor = pessoaEleitora.getCpf();

      if (cpf.equals(cpfDoEleitor)) {
        cpfUtilizado = true;
        break;
      }
    }

    if (cpfUtilizado) {
      System.out.println("Pessoa eleitora já cadastrada!");
    } else {
      PessoaEleitora novaPessoa = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novaPessoa);
    }


  }

  /**
   * Votar.
   *
   * @param cpfPessoaEleitora the cpf pessoa eleitora
   * @param numeroPessoaCandidata the numero pessoa candidata
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    boolean cpfUtilizado = false;

    for (String cpfDoEleitor : cpfComputado) {

      if (cpfDoEleitor.equals(cpfPessoaEleitora)) {
        cpfUtilizado = true;
        break;
      }
    }

    if (cpfUtilizado) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        int numeroDoVoto = pessoaCandidata.getNumero();
        if (numeroDoVoto == numeroPessoaCandidata) {
          pessoaCandidata.receberVoto();
          cpfComputado.add(cpfPessoaEleitora);
        }
      }
    }
  }

  /**
   * Calcular porcentagem votos.
   *
   * @param index the index
   * @return the double
   */
  private double calcularPorcentagemVotos(int index) {
    totalVotos = cpfComputado.size();
    PessoaCandidata pessoaCandidata = pessoasCandidatas.get(index);
    int quantidadeDeVotos = pessoaCandidata.getVotos();
    double calculo = ((double) quantidadeDeVotos / (double) totalVotos) * 100;
    return Math.round(calculo);

  }

  /**
   * Mostrar resultado.
   */
  public void mostrarResultado() {
    totalVotos = cpfComputado.size();
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (int i = 0; i < pessoasCandidatas.size(); i += 1) {
        PessoaCandidata pessoaCandidata = pessoasCandidatas.get(i);
        int quantidadeDeVotos = pessoaCandidata.getVotos();
        String nomeDoCandidato = pessoaCandidata.getNome();
        double porcentagem = this.calcularPorcentagemVotos(i);

        System.out.println("Nome: " + nomeDoCandidato + " - " + quantidadeDeVotos + " votos ( "
            + porcentagem + "% )");

      }

      System.out.println("Total de votos: " + totalVotos);
    }
  }

}
