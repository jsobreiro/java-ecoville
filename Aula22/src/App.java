public class App {
    public static void main(String[] args) throws Exception {
    
        Gerente g1 = null;

        try {
            FolhaPagamento.cadastrar(g1);
        
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            
        }

    }
}
