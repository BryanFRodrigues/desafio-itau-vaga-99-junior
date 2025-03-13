package itauprojeto.com.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import itauprojeto.com.TransacaoRepository.TransacaoRepository;
import itauprojeto.com.Transacao.Transacao;


@Service
public class TransacaoService {

    private final TransacaoRepository repository;

    public TransacaoService(TransacaoRepository repository) {
        this.repository = repository;
    }
    
    public List<Transacao> listarTransacoes() {
        return repository.findAll();
    }

    public Transacao salvarTransacao(Transacao transacao) {
        if(transacao.getValor() < 0) {
            throw new IllegalArgumentException("Valor da transação não pode ser negativo");
        }
        return repository.save(transacao);
    }

    public void deletarTransacao(Long id) {
        repository.remove(id);
    }
}
