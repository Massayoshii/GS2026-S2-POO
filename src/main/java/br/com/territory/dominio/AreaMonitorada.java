package br.com.territory.dominio;

public class AreaMonitorada extends ComponenteTerritorial {

    public AreaMonitorada(Long id, String nome, String regiao, String status) {
        super(id, nome, regiao, status);
    }

    @Override
    public void verificarStatus() {

        if (getNome() == null || getNome().trim().isEmpty()
                || getRegiao() == null || getRegiao().trim().isEmpty()) {

            setStatus("DADOS INCOMPLETOS");

        } else {

            setStatus("EM MONITORAMENTO");
        }
    }
}
