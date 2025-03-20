package itauprojeto.com.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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


@ApiResponses(value = {  // Documentação da API
    @ApiResponse(
        responseCode = "200",     //Código de resposta
        description = "Transação criada com sucesso",
        content = @Content(mediaType = "application/json", schema = @Schema(implementation = Transacao.class))
    ),
    @ApiResponse(
        responseCode = "400", //Código de resposta
        description = "Requisição inválida, Insira o valor da transação"
    )
})

    @PostMapping
    public Transacao criarTransacao(@RequestBody Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    @GetMapping
    public List<Transacao> listarTransacoes() {
        return transacaoRepository.findAll();
    }

    @DeleteMapping()
    public void deletarTransacao() {
        transacaoRepository.remove();
    }
}

    
