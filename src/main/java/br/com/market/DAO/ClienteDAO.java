package br.com.market.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.market.models.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {

}
