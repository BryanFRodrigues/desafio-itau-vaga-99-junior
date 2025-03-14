package itauprojeto.com.transacaoRepository;

import org.springframework.stereotype.Repository;
import itauprojeto.com.demo.DemoApplication;
import itauprojeto.com.transacao.Transacao;

import java.time.OffsetDateTime;
import java.util.*;

@Repository

public class TransacaoRepository{
    private final Map<Long, Transacao> transacoes = new HashMap<>();
    private static long idFinal;


    public List<Transacao> findAll(){
        return new ArrayList<>(transacoes.values());
        
    }

    public Transacao remove(Long id){
        return transacoes.remove(id);
    }

    public Transacao save(Transacao transacao){
        if(transacao.getId() == null){ //Lógica para setar o ID automaticamente e incrementar
            transacao.setId(idFinal++); 
        }

        if(transacao.getDataHora() == null){  //Lógica aplicada também para não preencher o horário
            transacao.setDataHora(OffsetDateTime.now());
        }
        transacoes.put(transacao.getId(), transacao);
        return transacao; 
    }

    

}