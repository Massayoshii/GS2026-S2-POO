package br.com.territory.dominio;

import br.com.territory.excecoes.FonteIndisponivelException;

import java.util.Random;

public class SensorUmidadeSolo implements Sensor {

    private final Random random = new Random();
    private boolean funcionando = true;

    @Override
    public double realizarLeitura() {
        if (!verificarFuncionamento()) {
            throw new FonteIndisponivelException("Sensor de umidade do solo indisponivel");
        }

        return random.nextDouble(0.0, 100.0);
    }

    @Override
    public boolean verificarFuncionamento() {
        return funcionando;
    }

    @Override
    public String getTipo() {
        return "SensorUmidadeSolo";
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}