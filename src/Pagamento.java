import java.time.LocalDateTime;

public class Pagamento {
    private String tipo; // "Cartão de Crédito", "Boleto", "Pix"
    private String status; // "Aprovado", "Pendente", "Rejeitado"
    private double valor;
    private LocalDateTime data;
    private Pedido pedido;

    public Pagamento(String tipo, String status, double valor, LocalDateTime data, Pedido pedido) {
        this.tipo = tipo;
        this.status = status;
        this.valor = valor;
        this.data = data;
        this.pedido = pedido;
    }

    // Getters e Setters
}

