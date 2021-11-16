package br.com.accountability.calc.sistema.pagamento.model;

import br.com.accountability.calc.sistema.pagamento.model.dto.PagamentoDTO;
import lombok.Data;
import javax.persistence.*;

@Data
@Table(name = "pagamentos")
@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numeroDocumento")
    private String numeroDocumento;

    @Column(name = "dataDocumento")
    private String dataDocumento;

    @Column(name = "prestador")
    private String prestador;

    @Column(name = "valorBruto")
    private String valorBruto;

    @Column(name = "descontos")
    private String descontos;

    @Column(name = "dataVencimento")
    private String dataVencimento;

    @Column(name = "dataPagamento")
    private String dataPagamento;

    @Column(name = "idCobranca")
    private String idCobranca;

    public Pagamento(PagamentoDTO pagamentoDTO) {
        this.id = pagamentoDTO.getId();
        this.numeroDocumento = pagamentoDTO.getNumeroDocumento();
        this.dataDocumento = pagamentoDTO.getDataDocumento();
        this.prestador = pagamentoDTO.getPrestador();
        this.valorBruto = pagamentoDTO.getValorBruto();
        this.descontos = pagamentoDTO.getDescontos();
        this.dataVencimento = pagamentoDTO.getDataVencimento();
        this.dataPagamento = pagamentoDTO.getDataPagamento();
        this.idCobranca = pagamentoDTO.getIdCobranca();
    }

    public Pagamento() {

    }
}
