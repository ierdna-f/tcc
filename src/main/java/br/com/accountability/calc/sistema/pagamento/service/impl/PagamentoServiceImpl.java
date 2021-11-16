package br.com.accountability.calc.sistema.pagamento.service.impl;

import br.com.accountability.calc.sistema.pagamento.model.Pagamento;
import br.com.accountability.calc.sistema.pagamento.model.dto.PagamentoDTO;
import br.com.accountability.calc.sistema.pagamento.repository.PagamentoRepository;
import br.com.accountability.calc.sistema.pagamento.service.PagamentoService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PagamentoServiceImpl implements PagamentoService {

    public PagamentoServiceImpl(PagamentoRepository pagamentoRepository){
        this.pagamentoRepository = pagamentoRepository;
    }

    private PagamentoRepository pagamentoRepository;

    
    public List<PagamentoDTO> findAll(){
        return pagamentoRepository.findAll()
                .stream().parallel()
                .map(PagamentoDTO::new)
                .collect(Collectors.toList());
    }

    public PagamentoDTO findById(Integer id){
        Optional<Pagamento> pagamento = pagamentoRepository.findById(id);
        return pagamento.map(PagamentoDTO::new).orElse(null);
    }

    public void save(PagamentoDTO pagamentoDTO){
        pagamentoRepository.save(new Pagamento(pagamentoDTO));
    }

    public void delete(Integer id){
        pagamentoRepository.deleteById(id);
    }

    public void deleteList(List<Integer> ids){
        return;
    }

}
