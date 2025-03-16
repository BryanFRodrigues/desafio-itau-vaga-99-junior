package itauprojeto.com.service;
import java.util.List;

import org.springframework.stereotype.Service;

import itauprojeto.com.estatisticaTransacao.EstatisticaTransacao;
import itauprojeto.com.transacao.Transacao;
import itauprojeto.com.transacaoRepository.TransacaoRepository;


@Service
public class TransacaoService {

    private final TransacaoRepository repository;

    public TransacaoService(TransacaoRepository repository) {
        this.repository = repository;
    }
    
        public EstatisticaTransacao operacaoAnaltica() {
            List<Transacao> transacoes = repository.findAll();
            int total = 0;
            Double soma = 0.0;
            Double media = 0.0;
            Double min = Double.MAX_VALUE; 
            Double max = Double.MIN_VALUE; 
    
            for (Transacao transacao : transacoes) {
                total++;
                soma += transacao.getValor();
                media = soma / total;
                min = Math.min(min, transacao.getValor());
                max = Math.max(max, transacao.getValor());
            }
    
            return new EstatisticaTransacao(soma, total, media, min, max);
                
        }
            
                
}
