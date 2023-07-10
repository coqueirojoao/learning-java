package com.trybe.acc.java.sistemadevotacao;

// TODO: Auto-generated Javadoc
/**
 * The Class Pessoa.
 */
public abstract class Pessoa {

  /** The nome. */
  protected String nome;

  /**
   * Instantiates a new pessoa.
   *
   * @param nome the nome
   */
  public Pessoa(String nome) {
    this.nome = nome;
  }

  /**
   * Gets the nome.
   *
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * Sets the nome.
   *
   * @param nome the new nome
   */
  public void setNome(String nome) {
    this.nome = nome;
  }


}
