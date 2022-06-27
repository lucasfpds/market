package br.com.market.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.market.DAO.ClienteDAO;
import br.com.market.models.Cliente;
import br.com.market.util.ObjectProperties;

@RestController
public class Clientes {

    ClienteDAO dao;

    public Clientes(ClienteDAO dao) {
        this.dao = dao;
    }

    @GetMapping(value = "/clientes")
    public List<Cliente> getClientes() {
        return (List<Cliente>) dao.findAll();
    }

    @PostMapping(value = "/clientes")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return dao.save(cliente);
    }

    @PutMapping(value = "/clientes")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        ObjectProperties teste = new ObjectProperties();
        teste.imprimeAtributoseValoresPojo(cliente);
        return dao.save(cliente);
    }

    @PatchMapping(value = "/clientes")
    public Cliente patchCliente(@RequestBody Cliente cliente) {
        return dao.save(cliente);
    }

    @DeleteMapping(value = "/clientes")
    public void deleteCliente(@RequestBody Cliente cliente) {
        dao.delete(cliente);
    }
}
