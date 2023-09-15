package br.com.ifpe.oxefood.api.entregador;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EntregadorRequest {

    private String nome;

    private String cpf;

    private String rg;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    private String foneCelular;

    private String foneFixo;

    private String qtdEntregasRealizadas;

    private String valorPorFrete;

    private String rua;

    private String numero;

    private String bairro;

    private String cidade;

    private String cep;

    private String uf;

    private String complemento;

    public Entregador build() {

        return Entregador.builder()
                .nome(nome)
                .cpf(cpf)
                .rg(rg)
                .dataNascimento(dataNascimento)
                .foneCelular(foneCelular)
                .foneFixo(foneFixo)
                .qtdEntregasRealizadas(qtdEntregasRealizadas)
                .valorPorFrete(valorPorFrete)
                .rua(rua)
                .numero(numero)
                .bairro(bairro)
                .cidade(cidade)
                .cep(cep)
                .uf(uf)
                .complemento(complemento)
                .build();
    }

}
