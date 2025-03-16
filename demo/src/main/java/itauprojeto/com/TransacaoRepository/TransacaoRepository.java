package itauprojeto.com.transacaoRepository;
import org.springframework.stereotype.Repository;
import itauprojeto.com.transacao.Transacao;

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

    public String transacoesSum(){
        List<Transacao> transacoes = this.findAll();
        int total =  0;
        Double soma = 0.0;
        Double media = 0.0;
        Double min = 0.0;
        Double max = 0.0;

        for(Transacao transacao: transacoes){
            total ++;
            soma += transacao.getValor();
            media = soma/total;
            min = Math.min(transacao.getValor(), transacao.getValor());
            max = Math.max(transacao.getValor(), transacao.getValor());
        }

        return soma + "\n " + total + " \n" + media +  " \n" + min + " \n"  + max ;
    }
}
