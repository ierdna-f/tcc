package br.com.accountability.calc.sistema.pagamento.controller;

import br.com.accountability.calc.sistema.pagamento.model.dto.PagamentoDTO;
import br.com.accountability.calc.sistema.pagamento.service.PagamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamento")
@CrossOrigin(origins = "*")
public class Controller {

    private PagamentoService pagamentoService;

    public Controller(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }


    @GetMapping("/")
    public List<PagamentoDTO> findAll(){
        return pagamentoService.findAll();
    }

    @GetMapping("/{id}")
    public PagamentoDTO findById(@PathVariable Integer id){
        return pagamentoService.findById(id);
    }

    @PostMapping("/")
    public void save(@RequestBody PagamentoDTO d){
        pagamentoService.save(d);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        pagamentoService.delete(id);
    }


}
