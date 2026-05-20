public class Principal {
    static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        Livro l1 = new Livro("Pequeno Principe", true);
        Livro l2 = new Livro("O alquimista", true);

        Revista r1 = new Revista("Superinteressante", true);

        System.out.println("--- TESTANDO AS INSERÇÕES ---");

        minhaBiblioteca.adicionarItem(l1);

        minhaBiblioteca.adicionarItem(l2);

        minhaBiblioteca.adicionarItem(r1);

        minhaBiblioteca.mostrarAcervo();

        System.out.println("--- TESTANDO EMPREÉSTIMO ---");

        minhaBiblioteca.emprestarItem("Pequeno principe");

        minhaBiblioteca.emprestarItem("Pequeno Principe");

        minhaBiblioteca.emprestarItem("Harry Potter");

        System.out.println("--- TESTANDO DEVOLUÇÃO ---");

        minhaBiblioteca.devolverItem("Pequeno Principe");

        minhaBiblioteca.mostrarAcervo();
    }
}
