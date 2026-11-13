package br.com.territory.excecoes;

public class FonteIndisponivelException extends RuntimeException {
    public FonteIndisponivelException(String mensagem) {
        super(mensagem);
    }
}
