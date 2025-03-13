package itauprojeto.com.TransacaoRepository;

import org.springframework.stereotype.Repository;

import itauprojeto.com.Transacao.Transacao;

import java.util.*;

@Repository

public class TransacaoRepository{
    private final Map<Long, Transacao> transacoes = new HashMap<>();

    public List<Transacao> findAll(){
        return new ArrayList<>(transacoes.values());
        
    }

    public Transacao remove(Long id){
        return transacoes.remove(id);
    }

    public Transacao save(Transacao transacao){
        transacoes.put(transacao.getId(), transacao);
        return transacao; 
    }

}