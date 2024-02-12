package br.pointjob.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pointjob.api.dto.DadosCadastroFuncao;
import br.pointjob.api.entidade.Funcao;
import br.pointjob.api.repository.FuncaoRepository;

@RestController
@RequestMapping("funcao")
public class FuncaoColaboradorController {

	@Autowired
	private FuncaoRepository funcaorepository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroFuncao dados) {
		funcaorepository.save(new Funcao(dados));
	}
}
