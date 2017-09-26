package br.com.restful.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.restful.controller.ClienteController;
import br.com.restful.model.Cliente;

import com.google.gson.Gson;

/**
 * 
 * Classe responsável por conter os metodos REST de acesso ao webservice
 *
 * @author Douglas Costa <douglas.cst90@gmail.com>
 * @since 17/02/2013 02:05:23
 * @version 1.0
 */
@Path("/cliente")
public class ClienteResource {

	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Cliente> listarTodos(){
		return new ClienteController().listarTodos();
	}
	
	@GET
	@Path("/sucesso")
	@Produces("text/plain")
	public String sucesso(){
		return "Sucesso";
	}
}
