package itauprojeto.com.estatisticaTransacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EstatisticaTransacao {
    private Double soma;
    private int total;
    private Double media;
    private Double min;
    private Double max;

 
}
