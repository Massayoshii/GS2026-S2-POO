package br.com.territory.dominio;

public class DadosTerritorio {

    private double limiarChuva;
    private double limiarNivelAgua;
    private double limiarUmidadeSolo;

    public DadosTerritorio() {
        this.limiarChuva = 50.0;
        this.limiarNivelAgua = 80.0;
        this.limiarUmidadeSolo = 80.0;
    }

    public double getLimiarChuva() {
        return limiarChuva;
    }

    public void setLimiarChuva(double limiarChuva) {
        if (limiarChuva <= 0) {
            throw new IllegalArgumentException(
                    "O limiar de chuva deve ser maior que zero"
            );
        }

        this.limiarChuva = limiarChuva;
    }

    public double getLimiarNivelAgua() {
        return limiarNivelAgua;
    }

    public void setLimiarNivelAgua(double limiarNivelAgua) {
        if (limiarNivelAgua <= 0) {
            throw new IllegalArgumentException(
                    "O limiar do nivel da agua deve ser maior que zero"
            );
        }

        this.limiarNivelAgua = limiarNivelAgua;
    }

    public double getLimiarUmidadeSolo() {
        return limiarUmidadeSolo;
    }

    public void setLimiarUmidadeSolo(double limiarUmidadeSolo) {
        if (limiarUmidadeSolo <= 0 || limiarUmidadeSolo > 100) {
            throw new IllegalArgumentException(
                    "O limiar de umidade deve estar entre 0 e 100"
            );
        }

        this.limiarUmidadeSolo = limiarUmidadeSolo;
    }
}
