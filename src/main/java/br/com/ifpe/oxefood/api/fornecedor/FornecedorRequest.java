package br.com.ifpe.oxefood.api.fornecedor;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.fornecedor.Fornecedor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class FornecedorRequest {
    @NotNull(message = "O Nome é de preenchimento obrigatório")
    @NotBlank(message = "O Nome é de preenchimento obrigatório")
    private String nome;

    private String endereco;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFundacao;

    private Double valorMercado;

    private String paginaWeb;

    private String contatoVendedor;

    public Fornecedor build() {

        return Fornecedor.builder()
                .nome(nome)
                .endereco(endereco)
                .dataFundacao(dataFundacao)
                .valorMercado(valorMercado)
                .paginaWeb(paginaWeb)
                .contatoVendedor(contatoVendedor)
                .build();
    }
}
