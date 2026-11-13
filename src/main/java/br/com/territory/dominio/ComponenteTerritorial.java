
package br.com.territory.dominio;

public abstract class ComponenteTerritorial {

    private Long id;
    private String nome;
    private String regiao;
    private String status;

    public ComponenteTerritorial(Long id, String nome, String regiao, String status) {
        this.id = id;
        this.nome = nome;
        this.regiao = regiao;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void verificarStatus();
}
