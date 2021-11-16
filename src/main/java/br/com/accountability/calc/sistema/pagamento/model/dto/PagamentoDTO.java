package br.com.accountability.calc.sistema.pagamento.model.dto;

import br.com.accountability.calc.sistema.pagamento.model.Pagamento;
import lombok.Data;


@Data
public class PagamentoDTO {

    private Integer id;

    private String numeroDocumento;

    private String dataDocumento;

    private String prestador;

    private String valorBruto;

    private String descontos;

    private String dataVencimento;

    private String dataPagamento;

    private String idCobranca;

    public PagamentoDTO(Pagamento pagamento) {
        this.id = pagamento.getId();
        this.numeroDocumento = pagamento.getNumeroDocumento();
        this.dataDocumento = pagamento.getDataDocumento();
        this.prestador = pagamento.getPrestador();
        this.valorBruto = pagamento.getValorBruto();
        this.descontos = pagamento.getDescontos();
        this.dataVencimento = pagamento.getDataVencimento();
        this.dataPagamento = pagamento.getDataPagamento();
        this.idCobranca = pagamento.getIdCobranca();
    }


}
