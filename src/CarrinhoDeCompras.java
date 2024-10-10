import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Cliente cliente;
    private Map<produto, Integer> produtos; // Produto e quantidade
    private double total;

    // Construtor
    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new HashMap<>();
        this.total = 0.0;
    }

    public void adicionarProduto(produto produto, int quantidade) {
        produtos.put(produto, quantidade);
        total += produto.getPreco() * quantidade;
    }

    public void removerProduto(produto produto) {
        if (produtos.containsKey(produto)) {
            total -= produto.getPreco() * produtos.get(produto);
            produtos.remove(produto);
        }
    }

    // Getters e Setters
}
