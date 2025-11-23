package com.tienda.services;

import com.tienda.ports.ClienteRepositoryPort;
import com.tienda.ports.ClienteServicePort;
import com.tienda.model.Cliente;
import java.util.List;


//Capa de Servicios: Implementa la lógica de negocio para el Cliente.

public class ClienteService implements ClienteServicePort {
    
    private final ClienteRepositoryPort repositoryPort;

    public ClienteService(ClienteRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    //Implementación de Operaciones de Negocio

    @Override
    public int registrarNuevoCliente(Cliente cliente) {
        // Validación de Lógica de Negocio
        if (cliente.getNombre() == null || cliente.getApellido() == null) {
            throw new IllegalArgumentException("Nombre y Apellido del cliente son obligatorios.");
        }
        if (cliente.getDireccion() == null || cliente.getTelefono() == null) {
            throw new IllegalArgumentException("Se requiere Dirección y Teléfono para registrar un cliente.");
        }
        
        System.out.println("LOG: Lógica de negocio (Service) de Cliente ejecutada. Delegando a Persistencia.");
        
        return repositoryPort.save(cliente);
    }

    @Override
    public Cliente consultarClientePorId(int id) {
        return repositoryPort.findById(id);
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return repositoryPort.findAll();
    }

    @Override
    public boolean actualizarDatosCliente(Cliente cliente) {
        if (cliente.getIdCliente() <= 0) {
            throw new IllegalArgumentException("Se requiere un ID de Cliente válido para actualizar.");
        }
        return repositoryPort.update(cliente);
    }

    @Override
    public boolean eliminarCliente(int id) {
        return repositoryPort.delete(id);
    }
}