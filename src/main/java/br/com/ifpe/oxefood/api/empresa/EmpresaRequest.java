package br.com.ifpe.oxefood.api.empresa;

import javax.persistence.Column;

import br.com.ifpe.oxefood.modelo.acesso.Usuario;
import br.com.ifpe.oxefood.modelo.empresa.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EmpresaRequest {

    @Column
    private Usuario usuario;

    @Column
    private String site;

    @Column
    private String cnpj;

    @Column
    private String inscricaoEstadual;

    @Column
    private String nomeEmpresarial;

    @Column
    private String nomeFantasia;

    @Column
    private String fone;

    @Column
    private String foneAlternativo;

    public Empresa build() {

        return Empresa.builder()
            .usuario(usuario)
            .site(site)
            .cnpj(cnpj)
            .inscricaoEstadual(inscricaoEstadual)
            .nomeEmpresarial(nomeEmpresarial)
            .nomeFantasia(nomeFantasia)
            .fone(fone)
            .foneAlternativo(foneAlternativo)
            .build();
    }
}
