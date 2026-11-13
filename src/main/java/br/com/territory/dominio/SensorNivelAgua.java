package br.com.territory.dominio;

import br.com.territory.excecoes.FonteIndisponivelException;

import java.util.Random;

public class SensorNivelAgua implements Sensor{
    private final Random random = new Random();
    private boolean funcionando = true;

    @Override
    public double realizarLeitura() {
        if (!verificarFuncionamento()) {
            throw new FonteIndisponivelException("Sensor de nivel da agua indisponivel");
        }

        return random.nextDouble(0.0, 150.0);
    }

    @Override
    public boolean verificarFuncionamento() {
        return funcionando;
    }

    @Override
    public String getTipo() {
        return "SensorNivelAgua";
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}
