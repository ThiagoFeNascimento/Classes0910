import java.util.List;

public class Fornecedor {
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private List<produto> produtosDisponiveis;

    public Fornecedor(String nome, String cnpj, String telefone, String email, List<produto> produtosDisponiveis) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.produtosDisponiveis = produtosDisponiveis;
    }

    // Getters e Setters
}

