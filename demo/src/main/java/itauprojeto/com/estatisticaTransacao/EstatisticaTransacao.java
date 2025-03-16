package itauprojeto.com.estatisticaTransacao;

public class EstatisticaTransacao {
    private Double soma;
    private int total;
    private Double media;
    private Double min;
    private Double max;

 

    public EstatisticaTransacao(Double soma, int total, Double media, Double min, Double max) {
        this.soma = soma;
        this.total = total;
        this.media = media;
        this.min = min;
        this.max = max;
    }

   
    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }
}
