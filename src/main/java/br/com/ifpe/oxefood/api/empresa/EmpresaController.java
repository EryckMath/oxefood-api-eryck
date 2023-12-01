package br.com.ifpe.oxefood.api.empresa;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.

RestController;

import br.com.ifpe.oxefood.modelo.empresa.Empresa;
import br.com.ifpe.oxefood.modelo.empresa.EmpresaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/empresa")
@CrossOrigin
public class EmpresaController {

  @Autowired
  private EmpresaService ongService;

  @ApiOperation(value = "Serviço responsável por salvar uma empresa no sistema.")
  @PostMapping
  public ResponseEntity<Empresa> save(@RequestBody @Valid EmpresaRequest request) {

    Empresa empresa = EmpresaService.save(request.build());
    return new ResponseEntity<Empresa>(empresa, HttpStatus.CREATED);
  }

  @ApiOperation(value = "Serviço responsável por listar todas as empresas do sistema.")
  @GetMapping
  public List<Empresa> findAll() {

    return ongService.findAll();
  }

  @ApiOperation(value = "Serviço responsável por obter uma empresa referente ao Id passado na URL.")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Retorna  a empresa."),
      @ApiResponse(code = 401, message = "Acesso não autorizado."),
      @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso."),
      @ApiResponse(code = 404, message = "Não foi encontrado um registro para o Id informado."),
      @ApiResponse(code = 500, message = "Foi gerado um erro no servidor."),
  })
  @GetMapping("/{id}")
  public Empresa findById(@PathVariable Long id) {

    return ongService.findById(id);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Empresa> update(@PathVariable("id") Long id, @RequestBody EmpresaRequest request) {

    EmpresaService.update(id, request.build());
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {

    EmpresaService.delete(id);
    return ResponseEntity.ok().build();
  }

}
