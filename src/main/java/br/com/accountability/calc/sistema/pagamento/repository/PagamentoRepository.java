package br.com.accountability.calc.sistema.pagamento.repository;

import br.com.accountability.calc.sistema.pagamento.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
