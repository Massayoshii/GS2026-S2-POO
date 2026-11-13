package br.com.territory.dominio;

public interface Sensor {
    double realizarLeitura();

    boolean verificarFuncionamento();

    String getTipo();
}
