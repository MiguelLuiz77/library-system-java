public abstract class Publicacao {
    protected String nome;
    protected Boolean disponivel;

    public abstract void Emprestar();
    public abstract void Devolver();

    public Publicacao(String nome, Boolean disponivel) {
        this.nome = nome;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }
}

