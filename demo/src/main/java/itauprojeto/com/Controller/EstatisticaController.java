package itauprojeto.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import itauprojeto.com.estatisticaTransacao.EstatisticaTransacao;
import itauprojeto.com.Service.TransacaoService;


@ApiResponse(description = "Estatistica de transações")
@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {
    
    private final TransacaoService Transacaoservice;
    
    @Autowired
    public EstatisticaController(TransacaoService Transacaoservice) {
        this.Transacaoservice = Transacaoservice;
    }

    @GetMapping
    public EstatisticaTransacao estatisca(@RequestParam(defaultValue = "1") long time) {
        return Transacaoservice.operacaoAnaltica(time); 
    }
}
