package com.trybe.acc.java.sistemadevotacao;

// TODO: Auto-generated Javadoc
/**
 * The Class PessoaCandidata.
 */
public class PessoaCandidata extends Pessoa {

  /** The numero. */
  private int numero;

  /** The votos. */
  private int votos;

  /**
   * Instantiates a new pessoa candidata.
   *
   * @param nome the nome
   * @param numero the numero
   */
  public PessoaCandidata(String nome, int numero) {
    super(nome);

    this.numero = numero;
    this.votos = 0;
  }

  /**
   * Gets the numero.
   *
   * @return the numero
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Sets the numero.
   *
   * @param numero the new numero
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Gets the votos.
   *
   * @return the votos
   */
  public int getVotos() {
    return votos;
  }

  /**
   * Sets the votos.
   *
   * @param votos the new votos
   */
  public void setVotos(int votos) {
    this.votos = votos;
  }

  /**
   * Receber voto.
   */
  public void receberVoto() {
    this.votos += 1;
  }
}
