import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int id;
    private LocalDateTime data;
    private Cliente cliente;
    private List<produto> produtos;
    private double total;
    private String status;

    public Pedido(int id, LocalDateTime data, Cliente cliente, List<produto> produtos, double total, String status) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = total;
        this.status = status;
    }

    // Getters e Setters
}
