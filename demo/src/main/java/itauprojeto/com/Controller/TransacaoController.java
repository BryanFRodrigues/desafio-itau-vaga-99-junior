package itauprojeto.com.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import itauprojeto.com.Transacao.Transacao;
import itauprojeto.com.TransacaoRepository.TransacaoRepository;

import java.util.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    private final TransacaoRepository transacaoRepository;


    public TransacaoController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @PostMapping
    public Transacao criarTransacao(@RequestBody Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    @GetMapping
    public List<Transacao> listarTransacoes() {
        return transacaoRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarTransacao(@PathVariable Long id) {
        transacaoRepository.remove(id);
    }
}

    
