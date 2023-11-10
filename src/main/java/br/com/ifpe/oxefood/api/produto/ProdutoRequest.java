package br.com.ifpe.oxefood.api.produto;

//import java.time.LocalDate;

//import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ProdutoRequest {

    private String titulo;

    // @JsonFormat(pattern = "dd/MM/yyyy")
    // private LocalDate dataNascimento;

    private Long idCategoria;

    private String codigo;

    private String descricao;

    private String valorUnit;

    private String tempoEntregaMin;

    private String tempoEntregaMax;

    public Produto build() {

        return Produto.builder()
                .titulo(titulo)
                .codigo(codigo)
                .descricao(descricao)
                .valorUnit(valorUnit)
                .tempoEntregaMin(tempoEntregaMin)
                .tempoEntregaMax(tempoEntregaMax)
                .build();
    }

}
