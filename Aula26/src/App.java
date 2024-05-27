

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Cadastrar Obra de Arte:");
        //  título, artista, ano de criação, tipo de obra e localização.
        String titulo = Console.lerString("Informe o título");
        String artista = Console.lerString("Informe o artista");
        int anoCriacao = Console.lerInt("Informe o ano de criação");
        String tipoObra = Console.lerString("Tipo de obra (pintura, escultura ou fotografia)");
        String localNoMuseu = Console.lerString("Local onde se encontra no museu");

        ObraArte obraArte = new ObraArte(titulo, artista, anoCriacao, tipoObra, localNoMuseu);

        System.out.println("\nObra Cadastrada:");
        System.out.println(obraArte);

        ListaObras.salvarObra(obraArte);

        System.out.println("\nObras cadastradas:");
        ListaObras.getListaObras();

        System.out.println("\nProcurar por Monalisa:");
        ObraArte tempObra = ListaObras.buscarObraArte("Monalisa");

        if (tempObra != null) {
            System.out.println("Obra encontrada:");
            System.out.println(tempObra);

            //  Atualizando dados
            titulo = Console.lerString("\nInforme novo título");
            artista = Console.lerString("Informe novo artista");
            anoCriacao = Console.lerInt("Informe novo ano de criação");
            tipoObra = Console.lerString("Tipo de obra (pintura, escultura ou fotografia)");
            localNoMuseu = Console.lerString("Novo local onde se encontra no museu");

            tempObra.setTitulo(titulo);
            tempObra.setArtista(artista);
            tempObra.setAnoCriacao(anoCriacao);
            tempObra.setTipoObra(tipoObra);
            tempObra.setLocalNoMuseu(localNoMuseu);

            System.out.println("\nObra Atualizada:");
            System.out.println(tempObra);

            System.out.println("\nAgora iremos excluir a obra...");
            
            ListaObras.excluirObra(tempObra);
            System.out.println("\nObra excluída com sucesso!");

        } else {
            System.out.println("Obra não encontrada");
        }


    }
}
