

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


    }
}
