package br.pointjob.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pointjob.api.dto.DadosCadastroFuncao;

@RestController
@RequestMapping("funcao")
public class FuncaoColaboradorController {

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroFuncao dados) {
		System.out.println(dados);
	}
}
