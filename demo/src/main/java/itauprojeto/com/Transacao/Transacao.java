package itauprojeto.com.transacao;

import java.time.OffsetDateTime;

public class Transacao {
    private Long id;
    private Double valor;
    private OffsetDateTime dataHora;

    public Transacao(Long id, Double valor, OffsetDateTime dataHora) {
        this.id = id;
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public OffsetDateTime getDataHora() { return dataHora; }
    public void setDataHora(OffsetDateTime dataHora) { this.dataHora = dataHora; }
}
