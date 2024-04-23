public class Agenda {

    private Contato[] contatos;
    private int qtdeContatos;
    private int contatoAtual;

    public Agenda(int qtdeContatos){
        this.qtdeContatos = qtdeContatos;
        contatos = new Contato[this.qtdeContatos];
        contatoAtual = 0;
    }

    public void adicionarContato(Contato c){
        
        if (contatoAtual == qtdeContatos) {
            System.out.println("\nAgenda cheia...");
            System.out.println("Não é possível adicionar mais contatos");
            return;
        }

        contatos[contatoAtual] = new Contato();
        contatos[contatoAtual] = c;
        
        System.out.println("\nContato adicionado à agenda:");
        System.out.println("Posição na agenda: " + contatoAtual);
        System.out.println("Nome: " + c.getNome());
        System.out.println("Telefone: " + c.getTelefone());
        System.out.println();
        
        contatoAtual++;
    }

    public void buscarContato(String nome) {
        for (int i = 0; i < contatoAtual; i++) {
            
            if (contatos[i].getNome().equals(nome)) {
                System.out.println("\nContato localizado: ");
                System.out.println("Posição na agenda: " + i);
                System.out.println("Nome: " + contatos[i].getNome());
                System.out.println("Telefone: " + contatos[i].getTelefone());
                System.out.println();
                return;
            }
        }

        System.out.println("\nContato " + nome + " não localizado...\n");
    }



}