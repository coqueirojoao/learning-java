package com.trybe.acc.java.sistemadevotacao;

// TODO: Auto-generated Javadoc
/**
 * The Class PessoaEleitora.
 */
public class PessoaEleitora extends Pessoa {

  /** The cpf. */
  private String cpf;

  /**
   * Instantiates a new pessoa eleitora.
   *
   * @param nome the nome
   * @param cpf the cpf
   */
  public PessoaEleitora(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  /**
   * Gets the cpf.
   *
   * @return the cpf
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * Sets the cpf.
   *
   * @param cpf the new cpf
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


}
