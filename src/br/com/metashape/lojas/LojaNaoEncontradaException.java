package br.com.metashape.lojas;

/**
 *
 * @author pedrobertolini
 */
public class LojaNaoEncontradaException extends Exception {

    private String matricula;

    public LojaNaoEncontradaException(String matricula) {
        super("Funcionário não encontrado!");
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
