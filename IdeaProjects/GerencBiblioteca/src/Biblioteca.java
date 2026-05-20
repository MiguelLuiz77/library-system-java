import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacao> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<Publicacao>();
    }

    public void adicionarItem(Publicacao item) {
        this.acervo.add(item);
        System.out.println("" + item.getNome() + "" + " adicionado ao acervo");
    }

    public void emprestarItem(String nome) {
        for (Publicacao p : acervo) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                if (p.isDisponivel()) {
                    p.setDisponivel(false);
                    System.out.println("Empréstimo realizado com sucesso: " + nome);
                    return;

                }
            }
        }
        System.out.println("O item " + nome + " não foi encontrado no acervo.");
    }

    public void devolverItem(String nome) {
        for (Publicacao p : acervo) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                if (!p.isDisponivel()) {
                    p.setDisponivel(true);
                    System.out.println("Devolução realizada com sucesso: " + nome);
                    return;
                } else {
                    System.out.println("Este item já estava na Biblioteca.");
                    return;
                }
            }
        }
        System.out.println("O item " + nome + "não pertence a biblioteca.");
    }

    public void mostrarAcervo() {
        System.out.println("\n--- ACERVO DA BIBLIOTECA ---");
        if (acervo.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            for (Publicacao p: acervo) {
                String status = p.isDisponivel() ? "Disponível" : "Emprestado";
                System.out.println("- " + p.getNome() + " [" + status + "]");
            }
        }
        System.out.println("-----------------------\n");
    }
}