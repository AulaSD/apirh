package br.pointjob.api.entidade;

import br.pointjob.api.dto.DadosCadastroFuncao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="funcao_colaborador")
@Entity(name="Funcao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idfuncao")
public class Funcao {
	public Funcao(DadosCadastroFuncao dados) {
		// TODO Auto-generated constructor stub
		this.nome = dados.nome();
		this.descricao = dados.descricao();
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idfuncao;
	private String nome;
	private String descricao;

}
