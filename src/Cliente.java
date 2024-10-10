import java.util.List;

    public class Cliente {
        private String nome;
        private String email;
        private String cpf;
        private String telefone;
        private String endereco;
        private List<Pedido> historicoCompras;
    
        public Cliente(String nome, String email, String cpf, String telefone, String endereco, List<Pedido> historicoCompras) {
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.telefone = telefone;
            this.endereco = endereco;
            this.historicoCompras = historicoCompras;
        }
    
        // Getters e Setters
    }
    

