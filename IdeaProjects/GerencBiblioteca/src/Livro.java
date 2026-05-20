public class Livro extends Publicacao {

    public Livro(String nome, Boolean disponivel) {
        super(nome, disponivel);
    }

    @Override
    public void Emprestar() {
        if (disponivel) {
            System.out.println("O livro " + this.getNome() + " foi emprestado!");
        } else {
            System.out.println("O livro " + this.getNome() + " Não está disponível.");
        }
    }

    @Override
    public void Devolver() {
        System.out.println("O livro " + this.getNome() + " foi devolvido!");
    }
}
