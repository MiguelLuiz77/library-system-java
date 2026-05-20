import java.sql.SQLOutput;

public class Revista extends Publicacao {

    public Revista(String nome, Boolean disponivel) {
        super(nome, disponivel);
    }

    @Override
    public void Emprestar() {
        if (disponivel) {
            System.out.println("A revista " + this.getNome() + " Foi emprestada!");
        } else {
            System.out.println("A revista " + this.getNome() + " Não está disponível.");
        }
    }

    @Override
    public void Devolver() {
        System.out.println("A revista " + this.getNome() + " que foi emprestada, foi devolvida.");
    }
}
