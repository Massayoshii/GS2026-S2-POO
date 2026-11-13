package br.com.territory.excecoes;

public class DadosInvalidosException extends RuntimeException {
    public DadosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
