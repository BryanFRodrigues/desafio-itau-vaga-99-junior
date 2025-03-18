package itauprojeto.com.TransacaoRepository;
import org.springframework.stereotype.Repository;
import itauprojeto.com.Transacao.Transacao;

import java.time.OffsetDateTime;
import java.util.*;

@Repository
public class TransacaoRepository {
    
    private final Map<Long, Transacao> transacoes = new HashMap<>();
    private static long idFinal = 1; 

    public List<Transacao> findAll() {
        return new ArrayList<>(transacoes.values());
    }

    public Transacao remove(long id) {
        return transacoes.remove(id);
    }

    private void validarTransacao(Transacao transacao) {
        if (transacao.getValor() == null || transacao.getValor() <= 0) {
            throw new IllegalArgumentException("O valor da transação deve ser maior que 0");
        }
    }

    public Transacao save(Transacao transacao) {
        validarTransacao(transacao); 
        
        long idGerado = idFinal++; 
        transacao.setId(idGerado);

        if (transacao.getDataHora() == null) {
            transacao.setDataHora(OffsetDateTime.now()); 
        }

        transacoes.put(idGerado, transacao); 
        return transacao;
    }


}
