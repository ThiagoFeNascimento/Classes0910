import java.util.Map;

public class produto {
    private String nome;
    private String categoria;
    private String marca;
    private String modelo;
    private double preco;
    private int estoque;
    private String descricao;
    private Map<String, String> especificacoes; // Ex.: {"Clock Base": "1.44GHz", "Memória": "10GB GDDR6X"}
    private int garantia; // em meses

    public produto(String nome, String categoria, String marca, String modelo, double preco, int estoque, String descricao, Map<String, String> especificacoes, int garantia) {
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.estoque = estoque;
        this.descricao = descricao;
        this.especificacoes = especificacoes;
        this.garantia = garantia;
    }

    // Getters e Setters
}
