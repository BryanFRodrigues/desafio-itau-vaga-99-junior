package itauprojeto.com.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import itauprojeto.com.Service.TransacaoService;
import itauprojeto.com.Transacao.Transacao;
import java.util.*;


@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final TransacaoService service;


    public TransacaoController(TransacaoService service) {
        this.service = service;
    }

    @PostMapping
    public Transacao criarTransacao(@RequestBody Transacao transacao) {
        return service.salvarTransacao(transacao);
    }

    @GetMapping
    public List<Transacao> listarTransacoes() {
        return service.listarTransacoes();
    }

    @DeleteMapping("/{id}")
    public void deletarTransacao(@PathVariable Long id) {
        service.deletarTransacao(id);
    }
}

    
