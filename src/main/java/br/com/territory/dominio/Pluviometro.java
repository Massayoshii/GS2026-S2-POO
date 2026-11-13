package br.com.territory.dominio;

import java.util.Random;

public class Pluviometro implements Sensor{
    private final Random random = new Random();
    private boolean funcionando = true;

    @Override
    public double realizarLeitura() {
        if (!verificarFuncionamento()){
            throw new IllegalStateException("Pluviometro indisponivel");
        }

        return random.nextDouble(0.0,100.0);
    }

    @Override
    public boolean verificarFuncionamento() {
        return funcionando;
    }

    @Override
    public String getTipo() {
        return "Pluviometro";
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}
