package br.com.lucianokogut.controller;

import java.util.List;

import br.com.lucianokogut.model.bo.PessoaBO;
import br.com.lucianokogut.model.vo.PessoaVO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/pessoa")
public class PessoaRest {
	
	@POST
	@Path("/cadastrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public PessoaVO cadastrarPessoaController(PessoaVO pessoaVO) {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.cadastrarPessoaBO(pessoaVO);
	}
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PessoaVO> consultarTodasPessoasController() {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.consultarTodasPessoasBO();
	}
	
 	@GET
	@Path("/pesquisar/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public PessoaVO consultarPessoaController(PessoaVO pessoaVO) {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.consultarPessoaBO(pessoaVO);
	}

	@PUT
	@Path("/atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean atualizarPessoaController(PessoaVO pessoaVO) {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.atualizarPessoaBO(pessoaVO);
	}
	
	@DELETE
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean excluirPessoaController(PessoaVO pessoaVO) {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.excluirPessoaBO(pessoaVO);
	}
	
}
