package itauprojeto.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itauprojeto.com.estatisticaTransacao.EstatisticaTransacao;
import itauprojeto.com.service.TransacaoService;


@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {
    
    private final TransacaoService Transacaoservice;
    
    @Autowired
    public EstatisticaController(TransacaoService Transacaoservice) {
        this.Transacaoservice = Transacaoservice;
    }

    @GetMapping
    public EstatisticaTransacao estatisca() {
        return Transacaoservice.operacaoAnaltica(); 
    }
}
