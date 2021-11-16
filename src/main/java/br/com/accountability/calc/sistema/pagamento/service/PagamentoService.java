package br.com.accountability.calc.sistema.pagamento.service;

import br.com.accountability.calc.sistema.pagamento.model.dto.PagamentoDTO;

import java.util.List;

public interface PagamentoService {

    public List<PagamentoDTO> findAll();

    public PagamentoDTO findById(Integer id);

    public void save(PagamentoDTO pagamentoDTO);

    public void delete(Integer ud);

}
