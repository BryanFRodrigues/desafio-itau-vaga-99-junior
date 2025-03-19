package itauprojeto.com.Transacao;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Transacao {
    @JsonIgnore
    private Long id;
    private Double valor;
    private OffsetDateTime dataHora;
 
}
